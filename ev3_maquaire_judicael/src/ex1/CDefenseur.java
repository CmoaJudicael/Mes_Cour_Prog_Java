/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1;

import java.util.Random;

/**
 *
 * @author Admin
 */
public class CDefenseur extends CPersonnage
{
    
    public CDefenseur()
    {
        super.type = "defenseur";
        super.force = new  Random().nextInt(100 + 1 -10)+10;
    }
}
