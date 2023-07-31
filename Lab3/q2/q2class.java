
package q2;

public class q2class 
{
    private String name;
    private float bsalary, bonus, bamouth;
    
    public q2class (String name, float bsalary, float bonus)
    {
        this.name=name;
        this.bsalary=bsalary;
        this.bonus=bonus;
       
    }
    
    public String getname()
    {
        return name;
    }
     public float getbsalary()
    {
        return bsalary;
    }
      public float getbonus()
    {
        return bonus;
    }
    
    public float getbamouth()
    {
        bamouth=bsalary+bonus;
        return bamouth;
     
    }
    
}
