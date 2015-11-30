/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ryan
 */
public abstract class Employee {
    
    protected int number;
    protected String name;
    protected float deductionRate;
    
    protected abstract float calcPayPerWeek();
    
    public Employee(int num, String n, float dR)
    {
        number = num;
        name = n;
        deductionRate = dR;
    }
    
    // GETTER AND SETTER METHODS
    
    public int getNumber()
    {
        return number;
    }
    
    public String getName()
    {
        return name;
    }
    
    public float getDeductionRate()
    {
        return deductionRate;
    }
    
    public void setNumber(int num)
    {
        number = num;
    }
    
    public void setName(String n)
    {
        name = n;
    }
    
    public void setDeductionRate(float dR)
    {
        deductionRate = dR;
    }
    
    public void printInformation()
    {
    	System.out.println(number + " " + name + " " + deductionRate);
    }
    
}
