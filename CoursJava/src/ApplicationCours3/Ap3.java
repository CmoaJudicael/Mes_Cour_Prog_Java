/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ApplicationCours3;

import java.util.Arrays;

/**
 *
 * @author Admin
 */
public class Ap3 
{
    public static void main(String[] args) 
    {
        int max = Integer.MIN_VALUE;
        int index = 0;
        int tab3[] = {5,3,9,15,4,12,1,7,8};
        
        //je cherche et affiche la valeur max 
        for (int i = 0; i < tab3.length; i++) 
        {
            if (tab3[i]>max) 
            {
                max = tab3[i];
                index = i;
            }
        }
        System.out.println("La valeur max du tableau tab3 :");
        System.out.println(max);
        System.out.print("Son index est : " + index);
        
        System.out.println("\n");
        
        // je cherche et affiche la valeur max pair
        max = Integer.MIN_VALUE;
        for (int i = 0; i < tab3.length; i++) 
        {
            if (tab3[i]>max && tab3[i]%2==0) 
            {                
                max = tab3[i];
                index = i;
            }
        }
        System.out.println("La valeur max pair du tableau tab3 :");
        System.out.println(max);
        System.out.println("Son index est : " + index);
        
        //je compte le nombre de nombre pair
        int count = 0;
        for (int i = 0; i < tab3.length; i++) 
        {
            if (tab3[i]%2==0) 
            {         
                count++;
            }
        }
        System.out.println("Le nombre de valeur paires de :" + count);
        
        int tab32[] = new int[count];
        index=0;
        for (int i = 0; i < tab3.length; i++) 
        {
            if (tab3[i]%2==0) 
            {         
                tab32[index]= tab3[i];
                index++;
                tab3[i] = 0;
            }
        }
        System.out.println("tab3 :\n" + Arrays.toString(tab3));
        System.out.println("\ntab : " + Arrays.toString(tab32));
        
        
    }
    
}
