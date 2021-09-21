
import java.util.Scanner;

public class ReadingNumber {
    public static void main(String[] args) {
        int i;
        long l;
        double d;
        float f;
        boolean b;
        char c='c';
        Scanner scan=new Scanner(System.in);
        i=scan.nextInt();
        l=scan.nextLong();
        d=scan.nextDouble();
        f=scan.nextFloat();
        b=scan.nextBoolean();

        System.out.println(i);
        System.out.println(l);
        System.out.println(d);
        System.out.println(f);
        System.out.println(b);
        System.out.println(c);

    }
}
