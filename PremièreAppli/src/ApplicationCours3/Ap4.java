/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ApplicationCours3;
import Ressource.DemandeNbr;
import java.util.Arrays;

/**
 *
 * @author Admin
 */
public class Ap4 
{
    public static void main(String[] args) 
    {
        int[] tab4={5,3,9,15,4,12,1,7,8};
        int[] tab5 = {1,0,0,2,5,0,4};
        
        int indexToChange =0, ChangeToIndex=0, temp = 0, saisieNBR = 0, indexSaisie = 0, tempbis=0;
        
        System.out.println("tab4 : " + Arrays.toString(tab4));
        
        boolean verif=true;
        do 
        {                   
            System.out.println("veuillez indiquez une valeur de l'index entre 0 et " + (tab4.length-1));
            indexToChange=DemandeNbr.NbrEntier();
            if (indexToChange >= tab4.length | indexToChange < 0) 
            {
                System.out.println("Désolé, vous dépasser des valeurs, recommencez");
                verif = true;
            }
            else
            {
                verif=false;
            }
        } while (verif);
        
        do 
        {                   
            System.out.println("veuillez indiquez une valeur de l'index à échanger entre 0 et " + (tab4.length-1));
            ChangeToIndex=DemandeNbr.NbrEntier();
            if (ChangeToIndex >= tab4.length | ChangeToIndex < 0) 
            {
                System.out.println("Désolé, vous dépasser des valeurs, recommencez");
                verif = true;
            }
            else
            {
                verif=false;
            }
        } while (verif);
        temp = tab4[indexToChange];
        tab4[indexToChange] = tab4[ChangeToIndex];
        tab4[ChangeToIndex] = temp;
        
        System.out.println("tab4 : " + Arrays.toString(tab4));
        
        System.out.println("veuillez indiquez une valeur à inserer");
        saisieNBR = DemandeNbr.NbrEntier();
        do 
        {
            System.out.println("veuillez indiquez une valeur de l'index à échanger entre 0 et " + tab4.length);
            indexSaisie=DemandeNbr.NbrEntier();
            if (indexSaisie > tab4.length | indexSaisie < 0) 
            {
                System.out.println("Désolé, vous dépasser des valeurs, recommencez");
                verif = true;
            }
            else
            {
                verif=false;
            }
        } while (verif);
        temp = saisieNBR;
        for (int i = indexSaisie; i < tab4.length; i++) 
        {
            tempbis=tab4[i];
            tab4[i]=temp;
            temp=tempbis;
        }
        
        System.out.println("tab4 : " + Arrays.toString(tab4));
        
        
        System.out.println("\ntab5 : " + Arrays.toString(tab5));
        for (int i = 0; i < tab5.length; i++) 
        {
            if (tab5[i] == 0) 
            {
                for (int j = i+1; j < tab5.length; j++) 
                {
                    if (tab5[j]!=0) 
                    {
                        temp = tab5[j];
                        tab5[j]= 0;
                        tab5[i]=temp;
                        break;
                    }
                    
                }
                
            }
            
        }
        
        System.out.println("\ndécalage de zéro tab5 : " + Arrays.toString(tab5));
        
    }
   
}
