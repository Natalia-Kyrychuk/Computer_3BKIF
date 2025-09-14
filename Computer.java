public class Computer
{
    private String betriebssystem;
    private int hauptspeicher;
    private boolean Laptop;
    private String hersteller;
    
    public String getBetriebssystem()
    {
        return betriebssystem;
    }
    public int getHauptspeicher()
    {
        return hauptspeicher;
    }
    public boolean getLaptop()
    {
        return Laptop;
    }
    public void setBetriebssystem(String neuBetriebssystem)
    {
        betriebssystem = neuBetriebssystem;
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