import java.util.Scanner;
public class Main
{
    public static int mok(int n2, int n3) // 더한 분이 60을 넘어가는 경우를 위한 함수
    {
        return (n2 + n3) / 60; // 추가 해야하는 시 리턴
    }
    public static int na(int n2, int n3) // 추가되었을때 분 구하기
    {
        return (n2 + n3) % 60; //분 리턴
    }
    public static void main(String[] args)
    {
       int num1, num2, num3;// 1은 시, 2는 분
       Scanner sc = new Scanner(System.in);

       num1 = sc.nextInt();// 시 입력받기
       num2 = sc.nextInt(); // 분 입력받기
        num3 = sc.nextInt(); // 더해야 하는 분

        num1 +=mok(num2,num3); // 추가된 시에 기존 시 더하기
        num2 = na(num2,num3);// 재설정된 분
        if(num1>=24)
        {
            num1 -= 24;
        }
        System.out.println(num1+" "+num2);// 시 분 출력
    }
}
