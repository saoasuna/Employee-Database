/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ryan
 */

import java.util.ArrayList;

public class HashTable {
    
    private ArrayList<Employee>[] hashTable;
    private int numBuckets;
    
    @SuppressWarnings("unchecked")
	public HashTable ()
    {
        numBuckets = 2;
        hashTable = new ArrayList[numBuckets];
        for (int i = 0; i < numBuckets; i++)
        {
        	hashTable[i] = new ArrayList<Employee>();
        }
    }
    
    public void addToTable(Employee employee)
    {
    	//System.out.println("TestStatement");
        hashTable[employee.getNumber()%2].add(employee);
    }
    
    public boolean search (Employee employee)
    {
        int j = employee.getNumber()%2;
        for (int i = 0; i < hashTable[j].size(); i++)
        {
            if (employee.getNumber() == hashTable[j].get(i).getNumber())
                return true;
        }
        return false;
    }
    
    public void printTable()
    {
    	for (int i = 0; i < numBuckets; i++)
    	{
    		//System.out.println("TestStatement");
    		for (int j=0; j < hashTable[i].size(); j++)
    		{
    			//System.out.println("TestStatement");
    			hashTable[i].get(j).printInformation();
    		}
    	}
    }
    
}
