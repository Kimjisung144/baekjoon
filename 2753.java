import java.util.Scanner;
public class Main
{
    public static int leap_year_check(int n1)
    {
        if((n1 % 4 == 0 && n1 % 100 != 0) || n1 % 400 == 0) //윤년은 연도가 4의 배수이면서, 100의 배수가 아닐 때 또는 400의 배수일 때이다.
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }
    public static void main(String[] args)
    {
        int num1; // 윤년인지 확인받을 변수
        Scanner sc = new Scanner(System.in);
        num1 = sc.nextInt();
        System.out.println(leap_year_check(num1));
    }
}
