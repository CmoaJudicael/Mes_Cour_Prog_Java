/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ressource;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

/**
 *
 * @author Admin
 */
public class MultiList 
{
    
    static List<Integer> table1 = new ArrayList<Integer>();
    static List<Integer> table2 = new ArrayList<Integer>();
    static List<Integer> table3 = new ArrayList<Integer>();
    static List<Integer> table4 = new ArrayList<Integer>();
    static List<Integer> tableLong = new ArrayList<Integer>();
    
    static List<Integer> surplus = new ArrayList<Integer>();
    
    public static int Surplus(int value)
    {
        return surplus.get(value);
    }
    public static void PlusLong(String table)
    {
                boolean test = false;
        tableLong.add(table1.size());
        tableLong.add(table2.size());
        tableLong.add(table3.size());
        tableLong.add(table4.size());
        
        for (int i = 1; i <= 4; i++) 
        {
            if (tableLong.get(i) == Collections.max(tableLong))
            {       
                    surplus.add(i);
            }
        }
        
    }
    
    public static void TriageReverse (String table)
    {
         switch(table)
        {
            case "table1" -> 
            {
                Collections.sort(table1);
                Collections.reverse(table1);
            }
            case "table2" -> 
            {
                Collections.sort(table2);
                Collections.reverse(table2);
            }
            case "table3" -> 
            {
                Collections.sort(table3);
                Collections.reverse(table3);
            }
            case "table4" -> 
            {
                Collections.sort(table4);
                Collections.reverse(table4);
            }
                default -> System.out.println("Il n'y a pas de table correspondante.\nLes tables existantes sont :\n - \"table1\"\n - \"table2\"\n -\"table3\"\n\n");
                
        }
    }
    
    public static int Longueur(String table)
    {
        int result= 0; 
        switch(table)
        {
            case "table1" -> 
            {
                result = table1.size();
            }
            case "table2" -> 
            {
                result = table2.size();
            }
            case "table3" -> 
            {
                result = table3.size();
            }
            case "table4" -> 
            {
                result = table4.size();
            }
                default -> System.out.println("Il n'y a pas de table correspondante.\nLes tables existantes sont :\n - \"table1\"\n - \"table2\"\n -\"table3\"\n\n");
                
        }
        return result;
    }
     
    public static void  AddValue(String table,int value)
    {
        switch(table)
        {
            case "table1" -> 
            {
                table1.add(value);
            }
            case "table2" -> 
            {
                table2.add(value);
            }
            case "table3" -> 
            {
                table3.add(value);
            }
            case "table4" -> 
            {
                table4.add(value);
            }
                default -> System.out.println("Il n'y a pas de table correspondante.\nLes tables existantes sont :\n - \"table1\"\n - \"table2\"\n -\"table3\"\n\n");
                
        }
    }
    
}
