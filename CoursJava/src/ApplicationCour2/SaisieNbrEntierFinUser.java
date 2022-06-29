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
public class SaisieNbrEntierFinUser 
{
    static int NbrSaisie;
    public static void main(String[] args) {
        do {            
            NbrSaisie = DemandeNbr.NbrEntier();
            System.out.println("Nombre saisie : " + NbrSaisie);
            if (NbrSaisie!=0 & NbrSaisie!= -9) 
            {
                System.out.println("recommencer");
            }
            
        } while (NbrSaisie!=0 & NbrSaisie!= -9);
    }
}
