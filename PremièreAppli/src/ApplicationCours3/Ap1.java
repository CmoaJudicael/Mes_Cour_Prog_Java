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
public class Ap1 
{
    public static void main(String[] args) 
    {
        int [] tab1 = {1,2,3,4,5,6,7,8,9};
        System.out.println("Valeur à l'index 1 "+tab1[1]);
        System.out.println("Toutes les valeurs du tableau avec une boucle");
        for (int i = 0; i < tab1.length; i++) 
        {
            System.out.println(tab1[i]);
        }
        System.out.println("toute les valeurs avec Arrays.toString(tab1)");
        System.out.println(Arrays.toString(tab1));
        int tab2[]=new int[51];
        for (int i = 0; i < tab2.length; i++) 
        {
            tab2[i]= i;
        }
    }
}
