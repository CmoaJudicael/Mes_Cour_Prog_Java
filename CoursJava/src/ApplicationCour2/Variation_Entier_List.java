/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ApplicationCour2;

import Ressource.DemandeNbr;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class Variation_Entier_List 
{
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
        int varNbrList = 0;
        for (int i = 0; i < MemoireNbrSaisie.size(); i++) 
        {
            int temp = 0;
            if (max < MemoireNbrSaisie.get(i))
            {
                max = MemoireNbrSaisie.get(i);
            }
            if (min > MemoireNbrSaisie.get(i)) 
            {
                min = MemoireNbrSaisie.get(i);
            }
            for (int j = 0; j < MemoireNbrSaisie.size(); j++) 
            {
                if (MemoireNbrSaisie.get(i)< MemoireNbrSaisie.get(j)) 
                {
                    temp = MemoireNbrSaisie.get(j)- MemoireNbrSaisie.get(i);
                }
                else
                {
                    temp = MemoireNbrSaisie.get(i)- MemoireNbrSaisie.get(j);
                }
                if (varNbrList < temp) 
                {
                    varNbrList = temp;
                }
                    
                
                
            }
            moy += MemoireNbrSaisie.get(i);
        }
        moy = moy/MemoireNbrSaisie.size();
        
            System.out.println("Valeur max saisie : " + max);
            System.out.println("Valeur min saisie : " + min);
            System.out.println("Valeur moyenne saisie : " + moy);
            System.out.println("Plus forte variation : " + varNbrList);
    }
}
