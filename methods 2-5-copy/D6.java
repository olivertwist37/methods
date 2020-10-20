import java.util.Scanner;
import java.lang.Math;

public class D6{

    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);

        for (int i=1;i>0;i--){
            int total = 0;
            System.out.println(" "); 
            System.out.print("How many Die do you want to roll?");
            int Die = myObj.nextInt();
            System.out.println(" "); 
            System.out.print("How many sides per die?");
            int Sides = myObj.nextInt();

            System.out.print("you rolled: ");
            roll(Die,Sides,0);

            System.out.println(" "); 
            System.out.println("Total: "+total); 
            System.out.println(" "); 
            System.out.println("Again? [y,n]");
            String again = myObj.next();
            if (again.equals("y"))i++;
            else i--;
        }

    }

    public static void roll(int Die,int Sides,int total){
        for (Die=Die; Die>0; Die--){

            int n = (int) (Math.random() * (Sides-1+1)+1);
            System.out.print(" "+n);
            total=total+n;

        }
    } 
}
