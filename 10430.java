import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num1,num2,num3;

        num1 = sc.nextInt();
        num2 = sc.nextInt();
        num3 = sc.nextInt();

        System.out.printf("%d\n",(num1+num2)%num3); //(A+B)%C
        System.out.printf("%d\n",((num1%num3) + (num2%num3)) % num3);// ((A%C) + (B%C))%C
        System.out.printf("%d\n",(num1*num2)%num3); // (A×B)%C
        System.out.printf("%d\n",((num1%num3)*(num2%num3))%num3);// ((A%C) × (B%C))%C
    }
}
