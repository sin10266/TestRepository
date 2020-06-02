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
public class Farmer extends Person{
    
    private String crop;
    private int numCows;
    
    public Farmer(String firstName, String lastName, String crop, int numCows)
    {
        super(firstName, lastName);
        
        this.crop = crop;
        this.numCows = numCows;
    }
    
    protected void addCow()
    {
        numCows = numCows + 1;
    }
    
    protected void sellCows(int num)
    {
        if(num < numCows)
        {
            numCows = numCows - num;
        }
        
        else
        {
            System.out.println("Error : Cows Not Availaible. Try Smaller Number.");
        }
    }
    
    protected String getCrop()
    {
        return crop;
    }
    
    protected int getNumberOfCows()
    {
        return numCows;
    }
}
