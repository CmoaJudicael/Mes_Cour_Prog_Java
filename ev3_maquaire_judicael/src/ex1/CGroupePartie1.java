/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class CGroupePartie1 
{
    List<CPersonnage> personnage = new ArrayList<CPersonnage>();
    
    public CGroupePartie1()
    {
        this.personnage.add(new CPersonnage());
        this.personnage.add(new CPersonnage());
    }
    public void afficherGroupe()
    {
        for (int i = 0; i < this.personnage.size(); i++) 
        {
            System.out.println("pers "+(i+1)+":"+this.personnage.get(i).toString());
        }
        
    }
}
