/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1;

/**
 *
 * @author Admin
 */
public class CGroupePartie3 
{
    CPersonnage[] personnages;
    
    public CGroupePartie3(int nombrePersonnage)
    {
        
        this.personnages = new CPersonnage[nombrePersonnage];
        for (int i = 0; i < nombrePersonnage; i++) 
        {
            if (i >= ((nombrePersonnage*2)/3)) 
            {
                this.personnages[i]=new CPersonnage();
            }
            else if (i >= ((nombrePersonnage)/3)) 
            {
                this.personnages[i]=new CAttaquant();
            }
            else
            {
                this.personnages[i]=new CDefenseur();
            }
        }
    }
    public void afficherGroupe()
    {
        for (int i = 0; i < this.personnages.length ; i++) 
        {
            System.out.println("pers "+(i+1)+":"+this.personnages[i].toString());
        }
        
    }
}
