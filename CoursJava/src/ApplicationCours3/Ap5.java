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
public class Ap5 
{
    public static void main(String[] args) 
    {
        int maxValue= Integer.MIN_VALUE, indexMax = 0, temp=0,n=0;
        int[] tab6={5,3,9,15,4,12,1,7,8};
        int[] tab7={5,3,9,15,4,12,1,7,8};
        int[] tab8={5,3,9,15,4,12,1,7,8};
        boolean verif=false;
        
        //methode 1
        System.out.println("Methode 1 :\n");
        System.out.println(Arrays.toString(tab6));
        
        for (int i = 0; i < tab6.length; i++) 
        {                      
            for (int j = 0; j < (tab6.length-i); j++) 
            {                
                if (tab6[j]>maxValue) 
                {
                    maxValue=tab6[j];
                    indexMax=j;
                }
            }
            temp=tab6[(tab6.length-1-i)];
            tab6[(tab6.length-1-i)]=tab6[indexMax]; 
            tab6[indexMax]=temp;
            maxValue=Integer.MIN_VALUE;
        }
        
        System.out.println(Arrays.toString(tab6));
        
        //methode 2
        System.out.println("\nMethode 2 :\n");
        System.out.println(Arrays.toString(tab7));
        
        for (int i = 0; i < tab7.length; i++) 
        {
            temp=tab7[i];
            int j = i;
            while (j>0 && tab7[j-1]>temp) 
            {                     
                tab7[j]= tab7[j-1];
                j--;
            }
            tab7[j]= temp;
        }
        System.out.println(Arrays.toString(tab7));
        
        //mthode 3
        System.out.println("\nMethode 3 :\n");
        System.out.println(Arrays.toString(tab8));
        do {
            for (int i = 0; i <= tab8.length-2; i++) 
            {
                if (tab8[i]>tab8[i+1]) 
                {
                    temp=tab8[i];
                    tab8[i]= tab8[i+1];
                    if (i<(tab8.length-2)) 
                    {
                        tab8[i+1]=tab8[i+2];
                        tab8[i+2]=temp;                                                 
                    }              
                    else
                    {
                        tab8[i+1]=temp;                        
                    }
                }                
            }
        } while (!(tab8[0]<tab8[1] && tab8[1]<tab8[2]&&tab8[2]<tab8[3]&&tab8[3]<tab8[4]&&tab8[4]<tab8[5]&&tab8[5]<tab8[6]&&tab8[6]<tab8[7]&&tab8[7]<tab8[8]));
      
        System.out.println(Arrays.toString(tab8));
        
        
    }
}
