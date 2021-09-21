public class AvgMidPoint
{
    public static void main(String[] args)
    {
        int []a={1,2,3,4,5};
        float []fa={1.1f,2.2f,3.3f,4.4f,5.5f};

        int  avg=(a[0]+a[1]+a[2]+a[3]+a[4])/2;
        int i=(a.length/2);
        System.out.println("average of int array"+avg);
        System.out.println("midpoint of int array"+a[i]);

        float avgf=(fa[0]+fa[1]+fa[2]+fa[3]+fa[4])/2;
        int j=(fa.length/2);
        System.out.println("average of float array"+avgf);
        System.out.println("midpoint of float array"+fa[i]);


    }
}
