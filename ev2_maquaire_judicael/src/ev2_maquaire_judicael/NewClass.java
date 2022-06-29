/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ev2_maquaire_judicael;
import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class NewClass 
{
     static int [][] creerMatrice(int m, int n){

        int matrice[][]=new int [m][n];
        for(int i=0;i<matrice.length;i++)
        {

            for(int j=0;j<matrice[i].length;j++)
            {
                matrice[i][j]= (i+j+1)+(i*2);
            }
        }   
        return matrice;
    }
    public static void main(String[] args) {

         int m;
         int n;
         int[][] tab;

         Scanner sc = new Scanner (System.in);

         System.out.println("rentrez un premier nombre entier");
         m=sc.nextInt();

         System.out.println("rentrez un deuxième nombre entier");
         n=sc.nextInt();
         tab=creerMatrice(m, n);
        for (int i = 0; i < tab.length; i++) 
        {
            System.out.println(Arrays.toString(tab[i]));
        }
    }
}
