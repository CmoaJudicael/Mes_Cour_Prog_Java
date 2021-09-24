/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ApplicationCour2;
import Ressource.DemandeNbr;
import java.util.Random;

/**
 *
 * @author Admin
 */
public class NombreMystere 
{
    static int NbrSaisie, NbrMystere;
    public static void main(String[] args) 
    {
        NbrMystere = DemandeNbr.DemandRandomInt(0, 100);
        do {     
            System.out.println("Trouvez le nombre mystère : ");
            NbrSaisie = DemandeNbr.NbrEntier();
            if (NbrSaisie == NbrMystere) 
            {
                System.out.println("Félicitation, vous avez trouvé le nombre mystère !!! ;)");
            }
            else if (NbrSaisie>NbrMystere) 
            {
                System.out.println("Votre nombre est plus grand");
            }
            else if (NbrSaisie<NbrMystere) 
            {
                System.out.println("Votre nombre est plus petit");
            }
            
        } while (NbrSaisie != NbrMystere);
        
    }
}
