import java.util.Scanner;
public class Main
{
    public static char comparison(int n1)
    {
        if(n1 > 89 && n1 <= 100)
        {
            return 'A';
        }else if(n1 > 79 && n1 <= 89)
        {
            return 'B';
        }else if(n1 >69 && n1 <=79)
        {
            return 'C';
        }else if(n1>59 && n1 <=69)
        {
            return 'D';
        }else{
            return 'F';
        }
    }

    public static void main(String[] args)
    {
        int num1;
        Scanner sc = new Scanner(System.in);

        num1 = sc.nextInt();
        System.out.println(comparison(num1));
    }
}
