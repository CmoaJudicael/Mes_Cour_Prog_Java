/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ApplicationCour1;

import static Ressource.DemandeNbr.NbrFloat;


/**
 *
 * @author Admin
 */
public class Equation_Second_Degre {
    
    public static void main(String[] args) 
    {
        CalculDescriminant(NbrFloat(), NbrFloat(), NbrFloat());
        
    }
    
    public static void CalculDescriminant(float a,float b,float c)
    {
        float descriminant = 0;
        descriminant = (float) ((b*b) - (4*a*c));
         System.out.println("descriminant : " + descriminant);
                
        VerifDelta(descriminant, a, b, c);
    }
    public static void VerifDelta(float descriminant, float a,float b, float c)
    {
        float Solution = 0;
        if (descriminant < 0)
        {            
         System.out.println("Pas de solution à l'équation dans l'ensemble réel");
        }
        else if (descriminant == 0) 
        {
            Solution = -(b/(2*a));
         System.out.println("solution à l'équation dans l'ensemble réel = " + Solution);
        }
        else if (descriminant > 0) 
        {
            Solution = (float) ((-b-Math.sqrt(descriminant))/(2*a));
            System.out.println("solution 1 à l'équation dans l'ensemble réel = " + Solution);
            
            Solution = (float) ((-b+Math.sqrt(descriminant))/(2*a));
            System.out.println("solution 2 à l'équation dans l'ensemble réel = " + Solution);
            
        }
    }
   
}
