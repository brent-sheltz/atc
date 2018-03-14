
/**
 * Write a description of class plane here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class plane
{
    private String model;
    private String callsign;
    private String comp;
    private int numengines;
    public int[][] locat;
    
    public plane(String model , String comp)
    {

    }

    public plane(String model)
    {
        
    }
    public void setengines(int a)
    {
     this.numengines= a; 
    }
    public void setlocate(int x , int y)
    {
     this.locat[x][y] = locat[x][y]  ; 
    }
}
