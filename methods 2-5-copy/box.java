import java.util.Scanner;
import java.lang.Math;
public class box{
    public static void displayBox(){
        Scanner myObj = new Scanner(System.in);
        
       System.out.println("enter width of box.");
       int x = myObj.nextInt();
       System.out.println("enter height of box.");
       int y = myObj.nextInt();
       displayBox(x,y);
    }
    public static void displayBox(int x,int y){
        while(y>0){
            int x2 =x;
            while(x2>1){
                System.out.print("$");
                x2--;
            }
            System.out.println("$");
            y--;
        }   
    }
}