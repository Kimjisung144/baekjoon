// 첫줄은 구매 합계 금액입력
// 두번째 줄은 물건 종류 갯수
// 세번째 줄부터 개당 가격, 갯수입력

import java.util.Scanner;
public class Main
{
    public static String com(int sum,int price)
    {
        if(sum == price)
        {
            return "Yes";
        }else{
            return "No";
        }
    }
    public static void main(String[] args)
    {
        int sum = 0;// price_sum과 비교할 변수
        int price_sum; // 구매 합계 금액
        int kind; // 물건 종류 갯수
        int count; // 물건 갯수
        int price_thing; //물건 가격

        Scanner sc = new Scanner(System.in);
        price_sum = sc.nextInt();// 구매 합계 입력

        kind = sc.nextInt(); // 종류 갯수 입력
        for(int i = 0; i < kind; i++)
        {
            price_thing = sc.nextInt();
            count = sc.nextInt();
            sum += (price_thing*count);
        }
        System.out.println(com(price_sum,sum));
    }
}
