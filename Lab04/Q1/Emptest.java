
package emptest;

public class Emptest {
    public static void main(String[] args) 
    {
        employe e1=new employe();
        employe e2=new employe();
        
        e1.setEmpID(250);
        System.out.println("Employee ID: "+e1.getEmpID());
        
        e1.setempName("Bogdon");
        System.out.println("Name: "+e1.getempName());
        
        e1.setempDesignation("SE");
        System.out.println("Designation: "+e1.getempDesignation());
        
        e2.setEmpID(255);
        System.out.println("Employee ID: "+e2.getEmpID());
        
        e2.setempName("Don");
        System.out.println("Name: "+e2.getempName());
        
        e2.setempDesignation("SE");
        System.out.println("Designation: "+e2.getempDesignation());
        
        
        
    }
    
}
