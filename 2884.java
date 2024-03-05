// 45분 일찍 알람 설정하기
// 만약 분이 45보다 작으면 60추가 단 그대신 시 -1하기 -1하기 전에 0일때 24로 치환
import java.util.Scanner;
public class Main
{
    public static int reset(int n2)
    {
        if(n2<45)
        {
            return (60+n2)-45;
        }else{
            return n2-45;
        }
    }
    public static void main(String[] args)
    {
       int num1,num2;
       Scanner sc = new Scanner(System.in);

       num1 = sc.nextInt();
       num2 = sc.nextInt();

       num2 = reset(num2);
       if(num1-1 < 0 && num2 > 25)
       {
           num1=24;
       }
       if(num2 > 25)
       {
           num1-=1;
       }
        System.out.println(num1+" "+num2);
    }
}
