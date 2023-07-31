
package q5;

public class q5class 

{
    
    char grade='A';
    {
    switch(grade)
        {
            case 'A' :
            System.out.println("Excellent!"); 
            break;
            case 'D' :
            System.out.println("You passed");
            break;
            case 'F' :
            System.out.println("Better try again");
            break;
            default :
            System.out.println("Invalid grade");
        }
        
    System.out.println("Your grade is " + grade);

    }
}
