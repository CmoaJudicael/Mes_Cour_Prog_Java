/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ressource;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Admin
 */
public class OpNewWindow {
    
       
    public static void main(String[] args){
		
	}
    

     
    public static class SimpleFenetre extends JFrame
    {
 
	public SimpleFenetre(String title, int h, int l)
        {
		build(title, h, l);//On initialise notre fenêtre
	}
 
	private void build(String title, int h, int l)
        {
		setTitle(title); //On donne un titre à l'application
		setSize(h,l); //On donne une taille à notre fenêtre
		setLocationRelativeTo(null); //On centre la fenêtre sur l'écran
		setResizable(false); //On interdit la redimensionnement de la fenêtre
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //On dit à l'application de se fermer lors du clic sur la croix
                setVisible(true);
                
	}
        public void Texte (String textString)
        {
            setContentPane(buildContentPane(textString));
        }
        private JPanel buildContentPane(String textString)
        {
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout());
		panel.setBackground(Color.white);
 
		JLabel label = new JLabel(textString);
 
		panel.add(label);
 
		return panel;
	}
}
   

    
}
