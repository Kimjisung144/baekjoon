import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        int wh,num1,num2;
        Scanner sc = new Scanner(System.in);
        wh = sc.nextInt();
        for(int i=0;i<wh;i++)
        {
            num1 = sc.nextInt();
            num2 = sc.nextInt();
            System.out.println(num1+num2);
        }
    }
}
