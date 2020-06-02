/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog24178;

/**
 *
 * @author Manjot Singh
 */
public class Employee extends Person {
    
    private String companyName;
    private double salary;
    
    public Employee(String firstName, String lastName, String companyName, double salary)
    {
        super(firstName, lastName);
        
        this.companyName = companyName;
        this.salary = salary;
    }

    protected String getCompanyName()
    {
        return companyName;
    }
    
    protected void giveRaise(double increase)
    {
        
        salary = salary + increase;
    }
    
    protected double getSalary()
    {
        return salary;
    }
    
}
