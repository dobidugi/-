import java.util.Scanner;
import java.util.Arrays;
public class Main{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = scan.nextInt();
        }
        Arrays.sort(arr);
        System.out.print(arr[n-1]+" "+arr[0]);
    }
}
