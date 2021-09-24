/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ApplicationCour2;

import Ressource.DemandeNbr;
import java.time.format.ResolverStyle;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class Min_Max_Moy {
    static List<Integer> MemoireNbrSaisie = new ArrayList<Integer>();
     static int NbrSaisie;
    public static void main(String[] args) {
        do {       
            
            NbrSaisie = DemandeNbr.NbrEntier();
            System.out.println("Nombre saisie : " + NbrSaisie);
            if (NbrSaisie!=0 & NbrSaisie!= -9) 
            {
                MemoireNbrSaisie.add(NbrSaisie);
                System.out.println("recommencer");
            }
            
        } while (NbrSaisie!=0 & NbrSaisie!= -9);
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        float moy = 0;
        for (int i = 0; i < MemoireNbrSaisie.size(); i++) {
            if (max < MemoireNbrSaisie.get(i))
            {
                max = MemoireNbrSaisie.get(i);
            }
            if (min > MemoireNbrSaisie.get(i)) 
            {
                min = MemoireNbrSaisie.get(i);
            }
            moy += MemoireNbrSaisie.get(i);
        }
        moy = moy/MemoireNbrSaisie.size();
        
            System.out.println("Valeur max saisie : " + max);
            System.out.println("Valeur min saisie : " + min);
            System.out.println("Valeur moyenne saisie : " + moy);
    }
}
