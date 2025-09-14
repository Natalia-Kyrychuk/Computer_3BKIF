public class Computer
{
    private String hersteller;
    private int hauptspeicher;
    private boolean Laptop;
    
    public String getHersteller()
    {
        return hersteller;
    }
    public int hauptspeicher()
    {
        return hauptspeicher;
    }
    public boolean Laptop()
    {
        return Laptop;
    }
    public void setHersteller(String neuHersteller)
    {
        hersteller = neuHersteller;
    }
    public void setHauptspeicher(int neuHauptspeicher)
    {
        hauptspeicher = neuHauptspeicher;
    }
    public void setLaptop(boolean neuLaptop)
    {
        Laptop = neuLaptop;
    }
}