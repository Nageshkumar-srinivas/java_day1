import java.util.Scanner;

public class PrincipalDiagonal {
    public static void main(String[] args) {
        int a[][]=new int[3][3];

        System.out.println("Enter the array elements");
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[0].length;j++)
            {
                Scanner s=new Scanner(System.in);
                a[i][j]=s.nextInt();
            }
        }

        System.out.println("Principal elements are");
        int j=0;
        for(int i=0;i<a.length;i++)
        {
            if(j==i)
            {
                System.out.print(a[i][i]+" ");
                j++;
            }
            System.out.println();
        }
        System.out.println("Secondary elements are");

        for(int i=0;i<a.length;i++)
        {
            for(j=0;j<a[0].length;j++){
                if((i+j)==2)
                {
                    System.out.print(a[i][j]+" ");

                }

            }
            System.out.println();
        }
    }
}
