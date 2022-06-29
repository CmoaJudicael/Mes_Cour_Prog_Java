/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ev2_maquaire_judicael;
/**
 *
 * @author Admin
 */
public class Prog2 
{
    public static void main(String[] args) 
    {
        if (estPair(Ev2_maquaire_judicael.NbrEntier())) 
        {
            System.out.println("Le nombre est pair");
        }
        else
        {
            System.out.println("Le nombre est impair");            
        }
    }
    public static boolean estPair(int n)
    {
        if (n%2==0) 
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
}
