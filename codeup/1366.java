import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        for(int i=0;i<a;i++){
            if(i==0 || i==a-1 || i==a/2)
                for(int j=0;j<a;j++) System.out.print("*");
            else if(i!=0 && i!=a-1){
                for(int j=0;j<a;j++){
                    if(j==0 || j==a-1 || j == a/2) System.out.print("*");
                    else {
                        if(j==i || j==(a-i)-1) System.out.print("*");
                        else System.out.print(' ');
                    }
                }
            }
            System.out.println("");
        }
    }
}