
/**
 * Write a description of class battery here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class battery
{
    // instance variables - replace the example below with your own
    private int charge ;
    private int volts;
    private int amps;
    private Boolean rechargable;
    private int max;
    /**
     * Constructor for objects of class battery
     */
    public battery()
    {
        charge = 0;
        volts = 0;
        amps = 0;
        max = 12;
    }
    public battery(int charge, Boolean rechargable,int max)
    {
        this.charge = charge;
        this.rechargable = rechargable;
        this.max = max;
    }    
    public int discharge(battery a,int discharge)
    {
     this.charge-= discharge;
     return discharge;
    }
    public void charge(battery a,int charge)
    {
     this.charge+= charge;
    }
}
