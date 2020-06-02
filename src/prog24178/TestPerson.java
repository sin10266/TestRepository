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
public class TestPerson {
    
    public static void main(String[] args)
    {
        Person person = new Person("Manjot", "Singh");
        
        Employee employee = new Employee("Sandeeppal", "Singh", "Tesla Motors", 6000);
        
        Farmer farmer = new Farmer("John", "Scott", "Wheat", 24);
        
        System.out.println("Person Name : " + person.getName() + "\n");
        
        System.out.println("Employee Name : " + employee.getName() + " " + employee.getCompanyName());
        System.out.println("Present Salary : " + employee.getSalary());
        employee.giveRaise(2596.22);
        System.out.println("Future Salary : " + employee.getSalary() + "\n");
        
        System.out.println("Farmer Name : " + farmer.getName() + " " + farmer.getCrop());
        System.out.println("Number Of Cows (At Present) : " + farmer.getNumberOfCows());
        farmer.addCow();
        System.out.println("Number Of Cows (At Future) : " + farmer.getNumberOfCows());
        farmer.sellCows(11);
        System.out.println("Number Of Cows After Selling : " + farmer.getNumberOfCows());
        
    }
}
