/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ApplicationCour1;
import static Ressource.DemandeNbr.NbrEntier;

/**
 *
 * @author Admin
 */
public class Classement_Nbr_Int {
    
    public static void main(String[] args) {
        int a = NbrEntier();        
        int b = NbrEntier();        
        int c = NbrEntier();
        
        ClassementNbr(a, b, c);
        
        
        
    }
    
    public static  void ClassementNbr(int a, int b, int c)
    {
        int d = 0;
        if (a > b) //a plus grand que b
        {
            if (a > c) //a plus grand que c
            {
                if (b < c ) //c plus grand que b
                {
                        d = c;
                        c = b;
                        b = c;
                }
            }
            else //a plus petit que c
            {
                if (c > b) 
                {
                        d = a;
                        a = c;
                        c = b;
                        b = d;                        
                }                
            }
            
        }
        else  
        {
            if (a > c)
            {
                d = a;
                a = b;
                b = d;
            }
            else
            {
                if (b < c) 
                {
                        d = a;
                        a = c;
                        c = d;                     
                }    
                else
                {
                    d = a;
                    a = b;
                    b = c;
                    c = d;
                }
            }
            
        }
        System.out.println("valeur de a : " + a);
        System.out.println("valeur de b : " + b);
        System.out.println("valeur de c : " + c);
        
    }
    
}
