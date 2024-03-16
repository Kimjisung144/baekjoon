import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num1,num2,sum;

        Scanner sc = new Scanner(System.in);

        while(true)
        {
            num1 = sc.nextInt();
            num2 = sc.nextInt();
            sum = num1 + num2;
            if(num1 == 0 && num2 ==0)
            {
                break;
            }
            System.out.println(sum);

        }
    }
}
