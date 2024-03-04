import java.util.Scanner;
public class Main
{
    public static String comparison(int n1,int n2)
    {
        if(n1>n2)
        {
            return ">";
        }
        else if(n1<n2)
        {
            return "<";
        }
        else
        {
            return "==";
        }
    }
    public static void main(String[] args)
    {
        int num1,num2;
        Scanner sc = new Scanner(System.in);

        num1 = sc.nextInt();
        num2 = sc.nextInt();
        System.out.println(comparison(num1,num2));
    }
}
