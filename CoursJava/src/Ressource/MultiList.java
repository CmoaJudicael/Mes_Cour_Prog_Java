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
    
    public static int LongueurSurplus()
    {
        return surplus.size();
    }
    public static int Surplus(int value)
    {
        return surplus.get(value);
    }
    public static void PlusLong(int size1, int size2,int size3,int size4)
    {
        tableLong.add(size1);//2
        tableLong.add(size2);//1
        tableLong.add(size3);//1
        tableLong.add(size4);//2
        
        for (int i = 0; i < 4; i++) 
        {
            if (tableLong.get(i) == Collections.max(tableLong))
            {       
                    surplus.add(i+1);
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
    
    public static int Longueur(ArrayList Table)
    {
        int result = Table.size();
        return result;
    }
     
    public static void  AddValue(int value1,int value2, int value3, int value4)
    {
        table1.add(value1);
        table2.add(value2);
        table3.add(value3);
        table4.add(value4);        
    }
    public static int GetValue(int Col, int Value)
    {
        int resultat = 0;
        try 
        {
            switch (Col)
            {
                case 1:
                    resultat = table1.get(Value);
                    break;
                case 2:
                    resultat = table2.get(Value);
                    break;
                case 3:
                    resultat = table3.get(Value);
                    break;
                case 4:
                    resultat = table4.get(Value);
                    break;
                default:System.out.println("Il n'y a pas de pas de colonne à cette emplacement");
            }
        } 
        catch (Exception e) 
        {
            System.out.println("Il n'y a pas de valeur");
        }
        return resultat;
    }
    
}
