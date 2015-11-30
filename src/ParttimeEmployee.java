/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ryan
 */
public class ParttimeEmployee extends Employee{
    
    private float hourlyWage;
    private float hoursPerWeek;
    
    public ParttimeEmployee (int num, String n, float dR, float hW, float hPW)
    {
        super(num, n, dR);
        hourlyWage = hW;
        hoursPerWeek = hPW;
    }

    protected float calcPayPerWeek() {
        return (hourlyWage * hoursPerWeek * (1.0f - deductionRate/100));
    }
    
    public float getHourlyWage()
    {
        return hourlyWage;
    }
    
    public float getHoursPerWeek()
    {
        return hoursPerWeek;
    }
    
}
