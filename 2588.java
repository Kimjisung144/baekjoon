import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        int num1,num2;
        int one,ten,hundr;
        Scanner sc = new Scanner(System.in);
        num1 = sc.nextInt();
        num2 = sc.nextInt();

        hundr = (num2/100);
        ten = (num2-(hundr*100))/10;
        one = ((num2-(hundr*100))-(ten*10));
        System.out.println(one+"\n"+ten+"\n"+hundr);
        System.out.println(one*num1+"\n"+ten*num1+"\n"+hundr*num1+"\n"+num1*num2);
    }
}
