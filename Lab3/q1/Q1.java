
package q1;

public class Q1 {

    public static void main(String[] args) 
    {
        
        ex e1=new ex();
        
        e1.setname("Amal");
        System.out.println("Name is: "+e1.getname());
        
        e1.setage(25);
        System.out.println("Age is: "+e1.getage());
        
        e1.setsalary(25000.00f);
        System.out.println("Salary is: "+e1.getsalary());
        
        cons c1=new cons("Sarani", 25, 25000.00f);
        c1.display();
    }
    
}
