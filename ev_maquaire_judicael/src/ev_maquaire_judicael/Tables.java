/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ev_maquaire_judicael;

/**
 *
 * @author Admin
 */
public class Tables {
       
 static int nbrAMultiplier = 1, resultat;
    
    public static void main(String[] args) 
    {
        System.out.println("Bienvenue dans le programme de table de multiplication, Chossissez combien de tables souhaiteriez vous affichez\n");
        while (nbrAMultiplier>0) 
        {
            
            nbrAMultiplier = Ev_maquaire_judicael.NbrEntier();//Dans la variable nbrAMultiplier j'appelle la methode NbrEntier qui demande à l'utilisateur un nombre entier
        
            if (nbrAMultiplier>0 & nbrAMultiplier<=10) 
            {
                
                for (int j = 2; j <= nbrAMultiplier; j++) 
                {
                    System.out.println("Table de " + j + " :");         
                    for (int i = 1; i <= 10; i++) 
                    {
                        resultat = j*i;
                        System.out.println("" + j + " x " + i + " = " + resultat);
                    } 
                    if (j!=nbrAMultiplier) 
                    {
                        System.out.println("--------------");                        
                    }                    
                }
                if (nbrAMultiplier==1) 
                {
                    System.out.println("Choissisez un nombre supérieur ou égal à 2\n");
                }
                                
            }
            else if(nbrAMultiplier>10)
            {
                System.out.println("\nDésolé, ceci n'est pas un nombre compris entre 1 et 10\n");
            }
            else
            {                
                System.out.println("\nMerci d'avoir utilisé notre programme\n");
            }
        }
        
        
    }
}
