/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ryan
 */
public class FulltimeEmployee  extends Employee{

    private float yearlySalary;
    
    public FulltimeEmployee (int num, String n, float dR, float yS)
    {
        super (num, n, dR);
        yearlySalary = yS;
    }
    
    protected float calcPayPerWeek() {
       return ((yearlySalary/365 * 7) * (1.0f - deductionRate/100));
    }
    
    public float getYearlySalary()
    {
        return yearlySalary;
    }
    
}
