import java.util.Scanner;

public class demo {
    public static void main(String []args)
    {
        int i;
        int n;
        String a;

        System.out.println("Enter the name");
        Scanner scan=new Scanner(System.in);
        a=scan.nextLine();

        System.out.println("Enter the number");
        Scanner scanner=new Scanner(System.in);
        n=scanner.nextInt();
        for(i=0;i<=n;i++)
        {
            System.out.println(a);
        }
    }
}
