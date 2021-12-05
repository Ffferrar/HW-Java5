public final class singleton {
    private static volatile singleton instance;
    String value;

    private singleton(String value)
    {
        // Этот код эмулирует медленную инициализацию
        try
        {
            Thread.sleep(10000);
        }
        catch (InterruptedException ex)
        {
            ex.printStackTrace();
        }
        this.value = value;
    }

    static singleton getInstance(String value)
    {
        if (instance == null){
            synchronized (singleton.class){
                if (instance == null){
                    instance = new singleton(value);
                }
            }
        }
        return instance;
    }
}
