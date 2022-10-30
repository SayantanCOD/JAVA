import java.util.*;

public class array
{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);


        int a[] = new int[10];

        int i;
        System.out.println("enter the element  :");

        for (i = 0; i < 10; i++) {
            a[i] = sc.nextInt();

        }
        System.out.println("the element are :");

        for (i=0;i<10;i++)
        {
            System.out.println("the number is " + a[i]);
        }





    }
}
