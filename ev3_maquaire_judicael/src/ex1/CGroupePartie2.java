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
public class CGroupePartie2 
{
    CPersonnage[] personnages;
    
    public CGroupePartie2(int nombrePersonnage)
    {
        this.personnages = new CPersonnage[nombrePersonnage];
        for (int i = 0; i < nombrePersonnage; i++) 
        {
            this.personnages[i]=new CPersonnage();
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
