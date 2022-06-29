/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ApplicationCour2;

import Ressource.DemandeNbr;
import Ressource.MultiList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Admin
 */
public class Filtrage_Compta_Valeur 
{
     static List<Integer> MemoireNbrSaisie = new ArrayList<Integer>();
     static List<Integer> valeur1 = new ArrayList<Integer>();
     static List<Integer> valeur2 = new ArrayList<Integer>();
     static List<Integer> valeur3 = new ArrayList<Integer>();
     static List<Integer> valeur4 = new ArrayList<Integer>();
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
      int count = 0;
        for (int i = 0; i < MemoireNbrSaisie.size(); i++) 
        {
            switch (MemoireNbrSaisie.get(i))
            {
                case 1 :
                    valeur1.add(1);
                    count++;
                    break;
                case 2 :
                    valeur2.add(2);
                    count++;
                    break;
                case 3 :
                    
                    valeur3.add(3);
                    count++;
                    break;
                case 4 :
                    valeur4.add(4);
                    count++;
                    break;                
            } 
            
        }
        
            System.out.println("Il y a : " + valeur1.size() + " de valeur 1 qui à été saisie\n" );
            System.out.println("Il y a : " + valeur2.size() + " de valeur 2 qui à été saisie\n" );
            System.out.println("Il y a : " + valeur3.size() + " de valeur 3 qui à été saisie\n" );
            System.out.println("Il y a : " + valeur4.size() + " de valeur 4 qui à été saisie\n" );            
            
            Ml.PlusLong( valeur1.size(), valeur2.size(), valeur3.size(), valeur4.size());
            for (int i = 0; i < Ml.LongueurSurplus(); i++) 
            {                       
                int proportion = 0;
                System.out.println("la valeur la plus saisie est la valeur : " + Ml.Surplus(i));
                switch (i+1)
                {
                    case 1:
                        proportion = (valeur1.size()*100)/count ;
                        break;
                    case 2:
                        proportion = (valeur2.size()*100)/count ;
                        break;
                    case 3:
                        proportion = (valeur3.size()*100)/count ;
                        break;
                    case 4:
                        proportion = (valeur4.size()*100)/count ;
                        break;
                }
                System.out.println("soit : " + proportion + " %");
                
            }
    }
    
}
