
import com.sun.tools.javac.Main;
import java.util.Scanner;
import javax.swing.JFrame;
public class Premiere_appli 
{
    public static void main (String[] args)
    {
        
        
        
      /*  
        //Définit un titre pour notre fenêtre
        NFenetre.setTitle("Yahoooo");
    //Définit sa taille 
    NFenetre.setSize(400,400);
    //Nous demandons maintenant à notre objet de se positionner au centre
    NFenetre.setLocationRelativeTo(null);
    //Termine le processus lorsqu'on clique sur la croix rouge
    NFenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    //Et enfin, la rendre visible        
    NFenetre.setVisible(true);*/
      
        int a,b,somme;
        Scanner Sc = new Scanner(System.in);
        
        System.out.print("Entrez la valeur de a : ");
        a = Sc.nextInt();
        System.out.print("Entrez la valeur de b : ");
        b = Sc.nextInt();
        
   
        somme = a + b;
        System.out.println("La somme de " + a + " + " + b + " est " + somme);
        
    }

}
