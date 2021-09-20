

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class Types_primitifs 
{
    static float prix;
    static float pi = 3.14f;
    static  int nb1, nb2 = 5;
    static double v1,v2 = 3d;
    static float flottant1 = +1f, flottant2 = -1e3f;
    static boolean gagne = false;
    
    static char code = 'D';
    static String nom = "Alice";
    
    static final int QUANTITE_MAX = 25;
    static final String CENTRE = "Greta";
    
    public static void main(String[] args) 
    {
        System.out.println("flottant 1 : " + flottant1);
        System.out.println("flottant 2 : " + flottant2);
        System.out.println("Alice : " + nom);
        
        
        System.out.println("Quantité Max : " + QUANTITE_MAX);
        System.out.println("Gagné ? " + gagne);
    }
    
}
