/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ApplicationCour2;

import Ressource.DemandeNbr;
import Ressource.MultiList;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class Filtrage_Compta_Valeur 
{
     static List<Integer> MemoireNbrSaisie = new ArrayList<Integer>();
     static int NbrSaisie;
     static MultiList Ml = new MultiList();
    public static void main(String[] args) {
        do {       
            
            NbrSaisie = DemandeNbr.NbrEntier();
            System.out.println("Nombre saisie : " + NbrSaisie);
            if (NbrSaisie!=0 & NbrSaisie!= -9) 
            {
                if (NbrSaisie > 0 & NbrSaisie < 5) 
                {
                    MemoireNbrSaisie.add(NbrSaisie);
                    System.out.println("recommencer");   
                    
                }
                else
                {
                    System.out.println("recommencer");                    
                }
            }
            
        } while (NbrSaisie!=0 & NbrSaisie!= -9);
      
        for (int i = 0; i < MemoireNbrSaisie.size(); i++) 
        {
            switch (MemoireNbrSaisie.get(i))
            {
                case 1 :
                    Ml.AddValue("table1", 1);
                    break;
                case 2 :
                    Ml.AddValue("table2", 2);
                    break;
                case 3 :
                    Ml.AddValue("table3", 3);
                    break;
                case 4 :
                    Ml.AddValue("table4", 4);
                    break;                
            } 
            
        }
            Ml.TriageReverse("table1");
            Ml.TriageReverse("table2");
            Ml.TriageReverse("table3");
            Ml.TriageReverse("table4");
        
            System.out.println("Il y a : " + Ml.Longueur("table1") + " de valeur 1 qui à été saisie\n" );
            System.out.println("Il y a : " + Ml.Longueur("table2") + " de valeur 2 qui à été saisie\n" );
            System.out.println("Il y a : " + Ml.Longueur("table3") + " de valeur 3 qui à été saisie\n" );
            System.out.println("Il y a : " + Ml.Longueur("table4") + " de valeur 4 qui à été saisie\n" );            
            
            System.out.println("la valeur la plus saisie est la valeur : " + Ml.Surplus(0) );
            for (int i = 0; i < 3; i++) 
            {
                if (Ml.Surplus(i) == Ml.Surplus(i+1)) 
                {                    
                    System.out.println("la valeur la plus saisie est la valeur : " + Ml.Surplus(i+1) );
                }
            }
    }
    
}
