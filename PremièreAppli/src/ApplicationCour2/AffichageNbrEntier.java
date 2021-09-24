/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ApplicationCour2;
import Ressource.DemandeNbr;

/**
 *
 * @author Admin
 */
public class AffichageNbrEntier {
    public static void main(String[] args) 
    {    
        
        VerifInterval(DemandeNbr.NbrEntier(), DemandeNbr.NbrEntier());
        
        
    }
    public static void VerifInterval(int a, int b)
    {
        System.out.println("a : " + a + " et b " + b + "/n");
        if (a > b)
        {
            int d = a;
            a = b;
            b = d;
        }
        
        for (int i = a; i <= b; i++) 
        {
            System.out.println("Nombre de l'intervalle : " + i);
        }
    }
    
}
