package ev2_maquaire_judicael;
import java.util.Random;
public class Prog3 
{
    public static void main(String[] args) 
    {
        int[] tableauDeTest=new int[10];
        Random random = new Random();
        
        for (int i = 0; i <tableauDeTest.length; i++) 
        {
            tableauDeTest[i]=random.nextInt(10+1)+1;
        }
        if(estPresent(tableauDeTest, 0)==0)
        {
            System.out.println("La valeur n'est pas présente dans le tableau");
        }
        else if (estPresent(tableauDeTest, 0)>1)
        {
            System.out.println("La valeur est présente plusieurs fois dans le tableau");
        }
        else if (estPresent(tableauDeTest, 0)==1)
        {
            System.out.println("La valeur est présente une seule fois dans le tableau");
        }
                
    }
    public static int estPresent(int[] tableauEntier,int n)
    {
        int result=0;
        for (int i = 0; i < tableauEntier.length; i++) 
        {
            if (tableauEntier[i]==n) 
            {
                result++;
            }
        }
        return result;
    }
}
