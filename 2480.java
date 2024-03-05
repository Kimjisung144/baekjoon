// 같은 눈이 3개가 나오면 10,000원+(같은 눈)×1,000원의 상금을 받게 된다.
// 같은 눈이 2개만 나오는 경우에는 1,000원+(같은 눈)×100원의 상금을 받게 된다.
// 모두 다른 눈이 나오는 경우에는 (그 중 가장 큰 눈)×100원의 상금을 받게 된다.
import java.util.Scanner;
public class Main
{
    public static int max(int num[])
    {
        int max = num[0];
        for(int i=0;i<3;i++)
        {
            if(max < num[i])
            {
                max = num[i];
            }
        }
        return max;
    }
    public static int check(int num[])
    {
        int count = 1;
        int s = 0;
        int e = 2;

        for(int i = 0; i < 2; i++)
        {
            for(int j = 0; j <= 2; j++)
            {
                if(i==j)
                {
                    continue;
                }
                if(num[i] == num[j])
                {
                    count++;
                }
            }
        }
        return count-2;
    }
    public static int twin_check(int num[]) {
        for (int i = 0; i < 2; i++) {
            for (int j = i; j <= 2; i++) {
                if (i == j) {
                    continue;
                }
                if (num[i] == num[j]) {
                    return num[i];
                }
            }
        }
        return 0;
    }
    public static void main(String[] args)
    {
        int num[] = new int[3];
        int twin_number;
        int count;
        Scanner sc = new Scanner(System.in);

        for(int i=0;i<3;i++)
        {
            num[i] = sc.nextInt();
        }
        twin_number = twin_check(num);
        count = check(num);
        System.out.println(count);
        switch(count)
        {
            case 1:
                System.out.println(max(num)*100);
                break;
            case 2:
                System.out.println((twin_number*100)+1000);
                break;
            case 3:
                System.out.println((twin_number*1000)+10000);
                break;
        }
    }
}
