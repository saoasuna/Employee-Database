/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ryan
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class InputOutput {
    
    private  BufferedReader input;
    private  BufferedWriter output;
    private  File file;
    
    public InputOutput()
    {
        file = new File ("data.txt");
        if (!file.exists())
        {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        
        try {
            input = new BufferedReader(new FileReader(file));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        
        try {
            output = new BufferedWriter(new FileWriter(file, true));
        } catch (IOException e) {
           e.printStackTrace();
        }
      
        /*try {
        	output.write("APPLE");
        } catch (IOException e) {
        	e.printStackTrace();
        }*/
    }
    
      public  void addFulltimeEmployee(FulltimeEmployee fEmployee, HashTable hashTable)
    {
        addLine(fEmployee.getNumber() + "//" + fEmployee.getName() + "//" + fEmployee.getDeductionRate() + "//" + fEmployee.getYearlySalary() + "//");
        hashTable.addToTable(fEmployee);
    }
      
      public  void addParttimeEmployee(ParttimeEmployee pEmployee, HashTable hashTable)
    {
        addLine(pEmployee.getNumber() + "//" + pEmployee.getName() + "//" + pEmployee.getDeductionRate() + "//" + pEmployee.getHourlyWage() + "//" + pEmployee.getHoursPerWeek());
        hashTable.addToTable(pEmployee);
    }
    
    public  void addLine(String line)
    {
        try {
            output.write(line);
            output.newLine();
            output.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public  void loadData(HashTable hashTable)
    {
        //hashTable = new HashTable(); this will give error because copy by value even for parameters
        //temporary string to hold the read line
        String temp = null;
        //int tempCounter = 1;
        while (true)
        {
            try {
                temp = input.readLine();
               // System.out.println("Loaded line " + tempCounter);
               // tempCounter++;

            } catch (IOException e) {
                e.printStackTrace();
            }
            
            if (temp != null)
            {
            	//System.out.println(temp + "_");
                int initIndex = 0;
                int finalIndex = temp.indexOf("//", initIndex);
                
                Integer empNumber = new Integer(temp.substring(initIndex, finalIndex));
                    
                    initIndex = finalIndex + 2;
                    finalIndex = temp.indexOf("//", initIndex);
                    
                    String empName = temp.substring(initIndex, finalIndex);
                    
                    initIndex = finalIndex + 2;
                    finalIndex = temp.indexOf("//", initIndex);
                    
                    Float empDeductionRate = new Float(temp.substring(initIndex, finalIndex));
                    
                    initIndex = finalIndex + 2;
                    finalIndex = temp.indexOf("//", initIndex);
                
                if (temp.endsWith("//"))
                {
                    Float empYearlySalary = new Float(temp.substring(initIndex, finalIndex));
                    
                    FulltimeEmployee fEmployee = new FulltimeEmployee(empNumber, empName, empDeductionRate, empYearlySalary);
                    hashTable.addToTable(fEmployee);
                }
                
                else
                {
                    Float empHourlyWage = new Float(temp.substring(initIndex, finalIndex));
                    
                    initIndex = finalIndex + 2;
                    finalIndex = temp.indexOf("//", initIndex);
                    
                    Float empHoursPerWeek = new Float(temp.substring(initIndex, finalIndex));
                    
                    ParttimeEmployee pEmployee = new ParttimeEmployee (empNumber, empName, empDeductionRate, empHourlyWage, empHoursPerWeek);
                    hashTable.addToTable(pEmployee);
                }
            }
            
            else
            {
            	//System.out.println("Done Loading Lines");
                break;
            } 
            
        }
    }
    
}
