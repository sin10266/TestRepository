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
public class Person {
    
    private String firstName;
    private String lastName;
    
    public Person()
    {
        firstName = "<none>";
        lastName = "<none>";
    }
    
    public Person(String firstName, String lastName)
    {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    
    protected String getName()
    {
        return(firstName + " " + lastName);
    }
    
}
