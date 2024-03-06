import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {
        int count;
        int num1,num2;
        Scanner sc = new Scanner(System.in);
        count = sc.nextInt();
        for(int i=1;i<=count;i++)
        {
            num1 = sc.nextInt();
            num2 = sc.nextInt();
            System.out.println("Case #"+i+": "+(num2+num1));
        }
    }
}
