/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ApplicationCour1;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Valeur_Abs 
{
    
    public static Scanner Sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println(VerifAbs(NbrEntier()));
    }
    public static int VerifAbs(int x)
    {
        int res = 0;
        if (x < 0)
        {
            res = -x;
        }
        return res;
    }
     public static int NbrEntier()
    {
        int nbr = 0; try 
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
