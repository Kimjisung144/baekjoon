import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int count;
        num = sc.nextInt();
        count = num / 4;
        if(num % 4 != 0)
        {
            count++;
        }
        for(int i = 0; i < count; i++)
        {
            System.out.print("long ");
        }
        System.out.print("int");
    }
}
