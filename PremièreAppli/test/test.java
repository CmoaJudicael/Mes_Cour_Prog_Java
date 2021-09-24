/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import Ressource.OpNewWindow;

/**
 *
 * @author Admin
 */
public class test {
    public static void main(String[] args) {
        OpNewWindow.SimpleFenetre MyWindow = new OpNewWindow.SimpleFenetre("test",800,600);
        MyWindow.Texte("Je suis un text");
    }
}
