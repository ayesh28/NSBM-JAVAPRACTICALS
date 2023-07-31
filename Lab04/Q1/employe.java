/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emptest;
public class employe 
{
    private int EmpID;
    private String empName,empDesignation;
    
    public void setEmpID(int a)
    {
        EmpID=a;
    }
    
    public void setempName(String b)
    {
        empName=b;
    }
    public void setempDesignation(String c)
    {
        empDesignation=c;
    }
    
    public int getEmpID()
    {
        return EmpID;
    }
    public String getempName()
    {
        return empName;
    }
    public String getempDesignation()
    {
        return empDesignation;
    }
            
   
}
