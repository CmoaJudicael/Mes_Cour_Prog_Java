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
public class CPersonnage 
{
    protected String type = "standard";
    protected int force;
    
    public CPersonnage()
    {
        this.force = new  Random().nextInt(100 + 1 -10)+10;
    }
    
    public String getType()
    {
        return this.type;
    }
    public int getForce()
    {
        return this.force;
    }
    public boolean SetForce(int force)
    {
        if (force >= 10 && force <=100) 
        {
            this.force = force;
            return true;
        }
        else
        {
            return false;
        }
    }
    @Override
    public String toString()
    {
        return "type = "+this.type+", force = "+this.force;
    }
    
}
