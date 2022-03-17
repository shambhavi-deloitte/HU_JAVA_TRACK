import java.util.Scanner;
public class Triangle
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows you want to print: ");
        int n=sc.nextInt();
        System.out.print("Enter the symbol you want to get displayed : ");
        char c = sc.next().charAt(0);
        for(int a=1;a<=n;a++)
        {
            for(int b=1;b<=n-a;b++)
            {
                System.out.print(" ");
            }
            for(int b=1;b<=a;b++)
            {
                System.out.print(c);
            }
            System.out.println();
        }
        for(int a=n-1;a>0;a--)
        {
            for(int b=1;b<=n-a;b++)
            {
                System.out.print(" ");
            }
            for(int b=1;b<=a;b++)
            {
                System.out.print(c);
            }
            System.out.println();
        }
    }
}