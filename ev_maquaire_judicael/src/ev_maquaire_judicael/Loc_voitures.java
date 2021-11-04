/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ev_maquaire_judicael;



public class Loc_voitures {
    
 static int typeMoteur = 0, nbrKilometre, jourDeLocation, tryCount=0;
 static float resultat;
 static boolean err = false;
 
    public static void main(String[] args) {
        System.out.println("Bienvenue dans le programme de location de véhicule\n");
        
        while (typeMoteur!=1&typeMoteur!=2&typeMoteur!=3) 
        {            
            System.out.println("\nQuelle type de moteur désirez vous? 1-Essence 2-Diesel 3-Comparez les deux");
            typeMoteur = Ev_maquaire_judicael.NbrEntier();
            if (typeMoteur!=1&typeMoteur!=2&typeMoteur!=3) 
            {
                System.out.println("\nDésolé, ce type de moteur n'existe pas");
                tryCount++;
                if (tryCount==3) 
                {                    
                    err = true;
                    break;
                }
                System.out.println("Nombre d'essai restant : " + (3-tryCount));
            }
        }
        if (!err) 
        {
             System.out.println("\nVeuillez indiquer le nombre de kilometre souhaitez?");
            nbrKilometre = Ev_maquaire_judicael.NbrEntier();
            System.out.println("Combien de jour de location envisagez-vous?");
            jourDeLocation = Ev_maquaire_judicael.NbrEntier();
        
            switch(typeMoteur)
            {
                case 1:
                    if (jourDeLocation<10) 
                    {
                        resultat = (float) (jourDeLocation * 15 + nbrKilometre * 0.85) ;
                        System.out.println("\nPour un véhicule de type essence, cela vous fera " + resultat + " €");                    
                    }
                    else
                    {
                        resultat = (float) (jourDeLocation * 15 + nbrKilometre * 0.85 - jourDeLocation) ;
                        System.out.println("\nPour un véhicule de type essence, cela vous fera " + resultat + " €");
                    
                    }
                    break;
                case 2:       
                    if (jourDeLocation<10)
                    {
                        resultat = (float) (jourDeLocation * 26 + nbrKilometre * 0.76) ;
                        System.out.println("\nPour un véhicule de type diesel, cela vous fera " + resultat + " €");                    
                    }
                    else
                    {                    
                        resultat = (float) (jourDeLocation * 26 + nbrKilometre * 0.76 - jourDeLocation) ;
                        System.out.println("\nPour un véhicule de type diesel, cela vous fera " + resultat + " €");
                    }
                    break;
                case 3:       
                    if (jourDeLocation<10)
                    {
                        resultat = (float) (jourDeLocation * 15 + nbrKilometre * 0.85) ;
                        System.out.println("\nPour un véhicule de type essence, cela vous fera " + resultat + " €");    
                    
                        resultat = (float) (jourDeLocation * 26 + nbrKilometre * 0.76) ;
                        System.out.println("\nPour un véhicule de type diesel, cela vous fera " + resultat + " €");                    
                    }
                    else
                    {                    
                        resultat = (float) (jourDeLocation * 15 + nbrKilometre * 0.85 - jourDeLocation) ;
                        System.out.println("\nPour un véhicule de type essence, cela vous fera " + resultat + " €");
                    
                        resultat = (float) (jourDeLocation * 26 + nbrKilometre * 0.76 - jourDeLocation) ;
                        System.out.println("\nPour un véhicule de type diesel, cela vous fera " + resultat + " €");
                    }
                    break;
            }
            
        }
        else
        {
            System.out.println("Bonne journée, au revoir");
        }
       
        
    }
}
