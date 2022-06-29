/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Admin
 */
public class CPersonnageTest {
    
    public CPersonnageTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of SetForce method, of class CPersonnage.
     */
    @Test
    public void testSetForce() {
        //Premier test vérifie si la force est inférieur à 10
        System.out.println("SetForce test 1");
        int force = 9;//initialisation de la force
        CPersonnage instance = new CPersonnage();//création d'un nouveau personnage
        boolean expResultTest = false;//définition du retour attendu
        boolean resultTest = instance.SetForce(force);//appel de la methode
        assertEquals(expResultTest, resultTest);//Comparaison du retour de la méthode avec le résultat attendu
        
        //Deuxième test vérifie si la force est entre 10 et 100
        System.out.println("SetForce test 2");
        force = 50;//initialisation de la force
        CPersonnage instance2 = new CPersonnage();//création d'un nouveau personnage
        boolean expResultTest2 = true;//définition du retour attendu
        boolean resultTest2 = instance2.SetForce(force);//appel de la methode
        assertEquals(expResultTest2, resultTest2);//Comparaison du retour de la méthode avec le résultat attendu
        
        //Troisième test vérifie si la force est supérieur à 100
        System.out.println("SetForce test 3");
        force = 101;//initialisation de la force
        CPersonnage instance3 = new CPersonnage();//création d'un nouveau personnage
        boolean expResultTest3 = false;//définition du retour attendu
        boolean resultTest3 = instance3.SetForce(force);//appel de la methode
        assertEquals(expResultTest3, resultTest3);//Comparaison du retour de la méthode avec le résultat attendu
        
        //Quatrième test vérifie si la force est égale à 10
        System.out.println("SetForce test 4");
        force = 10;//initialisation de la force
        CPersonnage instance4 = new CPersonnage();//création d'un nouveau personnage
        boolean expResultTest4 = true;//définition du retour attendu
        boolean resultTest4 = instance.SetForce(force);//appel de la methode
        assertEquals(expResultTest4, resultTest4);//Comparaison du retour de la méthode avec le résultat attendu
        
        //Premier test vérifie si la force est égal à 100
        System.out.println("SetForce test 5");
        force = 100;//initialisation de la force
        CPersonnage instance5 = new CPersonnage();//création d'un nouveau personnage
        boolean expResultTest5 = true;//définition du retour attendu
        boolean resultTest5 = instance.SetForce(force);//appel de la methode
        assertEquals(expResultTest5, resultTest5);//Comparaison du retour de la méthode avec le résultat attendu
    }

}
