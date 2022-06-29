package ev2_maquaire_judicael;
import java.util.Arrays;
public class Prog4 
{
    public static void main(String[] args) 
    {
        System.out.println("Combien voulez-vous de ligne");
        int ligne=Ev2_maquaire_judicael.NbrEntier();
        System.out.println("Combien voulez-vous de colonne");
        int colonne=Ev2_maquaire_judicael.NbrEntier();
        int[][]tabtest=creerMatrice(ligne, colonne);
        
        afficheTableau2Dimension(tabtest);
        
    }
    public static int [][] creerMatrice(int m,int n)
    {
        int[][] tableau=new int[m][n];
        System.out.println("Nous allons créer un tableau de "+m+" ligne et de "+n+" colonne");
        for (int i = 0; i < m; i++) 
        {
            for (int j = 0; j < n; j++) 
            {
                System.out.println("Ligne "+(i+1)+"\ncolonne "+(j+1));
                tableau[i][j]=Ev2_maquaire_judicael.NbrEntier();
            }
        }
        return tableau;
    }
    public static void afficheTableau2Dimension(int [][] tab)
    {
        System.out.println("valeur de chaque élément :");
        for (int i = 0; i < tab.length; i++) 
        {
            for (int j = 0; j < tab[i].length; j++) 
            {
                System.out.println("M["+i+"]["+j+"] = "+tab[i][j]);                                
            }            
        }
        System.out.println("matrice créée:");
        for (int i = 0; i < tab.length; i++) 
        {
            System.out.println(Arrays.toString(tab[i]));
        }
    }
}
