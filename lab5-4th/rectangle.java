
package ex4;

public class rectangle extends shape
{
private double h, r;
double a;

void rectangle(double r, double h)
{
    this.r=r;
    this.h=h;
}
    
    @Override
    void calculateArea() 
    {
       
        a= 0.5*r*h;
         
     
    }
   void display()
    {
        System.out.println("Area is: "+a);
    }
    
    
}
