import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int []a=new int[5];

        System.out.println("Array elements are:");
        for(int i=0;i<a.length;i++){
            Scanner scanner=new Scanner(System.in);
            a[i]=scanner.nextInt();

        }
        System.out.println("Square of array elements are:");
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]*a[i]);
        }
    }
}
