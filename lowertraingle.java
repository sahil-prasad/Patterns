import java.util.Scanner;
public class upperhalfpyramid
{
    public static void main(String[]args)
    {
        int r,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the order");
        r=sc.nextInt();
        c=r;
        for(int i=1;i<=r;i++)
        {
            for(int j=1;j<=c;j++)
            {
            if(i<=j)
            {
                System.out.print(" *");
            }
            else
            System.out.print(" ");
            }System.out.println();
        }


    }
}