
package lab5;
public class Lab5 {

    public static void main(String[] args) 
    {
        superB b=new superB();
        b.setlt(2);
        b.increment();
        b.triple();
        
        System.out.println(b.returnlt());
        SubC c=new SubC();
        c.setlt(2);
        c.increment();
        c.triple();
        System.out.println(c.returnlt());
        
    }
    
}
