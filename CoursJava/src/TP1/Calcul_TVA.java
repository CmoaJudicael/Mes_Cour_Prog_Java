/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TP1;
import java.util.Scanner;
        
/**
 *
 * @author Admin
 */
public class Calcul_TVA 
{
    public static Scanner SC = new Scanner(System.in);
    
    public static void main(String[] args) 
    {
        
        float montantTTC = CalculTTC(PrixHT(),ChoixTVA());
        System.out.println("Votre montant TTC est de : " + montantTTC);
        
        
    }
    public static float PrixHT()
    {
        float PxHT = 0f;
        try 
        {            
        System.out.println("Quelle est votre montant Total Hors Taxes ?");
        PxHT = Float.parseFloat(SC.nextLine());        
        } 
        catch (Exception e) 
        {
            System.out.println("Veuillez entrer un nombre, s'il vous plaît !!!");
            PrixHT();            
        }
        return PxHT;
    }
     public static float ChoixTVA()
    {
        float TxTVA = 0f;
        
        try 
        {            
            System.out.println("Quelle est votre Taux de TVA ?");
            System.out.println("20 % ou 5 %");  
            TxTVA = Integer.parseInt(SC.nextLine());
        } 
        catch (Exception e) 
        {
            System.out.println("Veuillez entrer un nombre, 20 ou 5, s'il vous plaît !!!");
            ChoixTVA();            
        }
        return TxTVA;
    }
    public static float CalculTTC(float  a, float b)
    {
        float res = a + (a * (b / 100));
        return res;
    }
    
    
}
