/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ApplicationCour1;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Variation_Max {
    public static Scanner Sc = new Scanner(System.in);
    public static DecimalFormat df = new DecimalFormat("'$'0.#");  
    public static List<Float> temperatureList = new ArrayList<>(3);
    
    public static void main(String[] args) {
       
df.setRoundingMode(RoundingMode.FLOOR);
        System.out.println("Veuillez entrer la première température");
        temperatureList.add(NbrFloat());
        System.out.println("Veuillez entrer la deuxième température");    
        temperatureList.add(NbrFloat());
        
        System.out.println("Veuillez entrer la troisième température");  
        temperatureList.add(NbrFloat());
        System.out.println("Veuillez entrer la quatrième température");  
        temperatureList.add(NbrFloat());
        System.out.println("Veuillez entrer la cinquième température");  
        temperatureList.add(NbrFloat());
        
        float tMax = 0;
        float tMin = Float.MAX_VALUE;
        for(int i=0; i<temperatureList.size(); i++)
           {
            if(temperatureList.get(i) > tMax)
                {
                    tMax = temperatureList.get(i);
                }
                if(temperatureList.get(i) < tMin)
                {
                    tMin = temperatureList.get(i);
                }
           }
    
        
        System.out.println("La température maximal est de " + df.format(tMax) + " " + tMax );
        System.out.println("La température minimal est de " + df.format(tMin) );
        
        System.out.println("La variation maximal est de " + df.format(tMax - tMin) );
    }
 
    public static float NbrFloat()
    {
        float nbr = 0f;
        try 
        { 
        nbr = Float.parseFloat(Sc.nextLine()); 
        
        } 
        catch (Exception e) 
        {
            System.out.println("Veuillez entrer un nombre, s'il vous plaît !!!");
            NbrFloat();            
        }
        return nbr;
    }
    
}
