/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class CJeu 
{
    public static void main(String[] args) 
    {
        System.out.println("------------ Partie 1 ------------");
        CGroupePartie1 groupe1 = new CGroupePartie1();
        groupe1.afficherGroupe();
        System.out.println("------------ Partie 2 ------------");
        Scanner sc = new Scanner(System.in);
        System.out.println("Nombre de personnage ?");
        int nombrePersonnage = sc.nextInt(); 
       
        CGroupePartie2 groupe2 = new CGroupePartie2(nombrePersonnage);
        groupe2.afficherGroupe();
        
        
        System.out.println("Nombre de personnage ?");
        nombrePersonnage = sc.nextInt();        
        
        CGroupePartie3 groupe3 = new CGroupePartie3(nombrePersonnage);
        groupe3.afficherGroupe();
    }
}
