
package ex4;

public class circle extends shape
{
    private double r;
    double a;
    
    void circle(double r)
    {
        this.r=r;
    }
    
    @Override
    void calculateArea() 
    {
        
        a=Math.PI*r*r;
    }
    
    
   void display()
    {
        System.out.println("Area is: "+a);
    }

   
    
    
}
