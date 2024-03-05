import java.util.Scanner;
public class Main
{
    public static int check(int x,int y)
    {
        if(x>0 && y>0)
        {
            return 1;
        }else if(x<0 && y>0)
        {
            return 2;
        }else if(x<0 && y<0)
        {
            return 3;
        }else {
            return 4;
        }
    }
    public static void main(String[] args)
    {
       int num1,num2;
       Scanner sc = new Scanner(System.in);

       num1 = sc.nextInt();
       num2 = sc.nextInt();

        System.out.println(check(num1,num2));
    }
}
