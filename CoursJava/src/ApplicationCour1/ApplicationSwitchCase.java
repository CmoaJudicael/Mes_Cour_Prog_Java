/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ApplicationCour1;

import static ApplicationCour1.Valeur_Abs.Sc;

/**
 *
 * @author Admin
 */
public class ApplicationSwitchCase 
{
    
    public static void main(String[] args) {
        int a = NbrEntier();
        
        switch (a)
        {
            case 1,2,3,4,5 : 
                System.out.println("a est égale à " + a);
                break;
                default :
                System.out.println("a est inférieur à 1 ou supérieur à 5 ");
                break;
                    
        }
        
        
    }
    
 public static int NbrEntier()
    {
        int nbr = 0; 
        try 
        {            
         System.out.println("Veuillez entrer un nombre entier");
        nbr = Integer.parseInt(Sc.nextLine());        
        } 
        catch (Exception e) 
        {
            System.out.println("Veuillez entrer un nombre entier, s'il vous plaît !!!");
            NbrEntier();            
        }
        return nbr;
        
    }
        
    
    
}
