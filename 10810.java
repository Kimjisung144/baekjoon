import java.util.Scanner; // 입력받기 위한 헤더파일
import java.util.ArrayList; // 동적배열을 사용하기 위한 헤더파일
public class Main
{
    public static void main(String[] args) {
        ArrayList <Integer>list1 = new ArrayList<Integer>(); //동적배열 선언

        Scanner sc = new Scanner(System.in); // 스캐너객체 선언
        int n; // 바구니 갯수
        int m; // 실행횟수
        int i;// i번 바구니부터 시작
        int j; // j번 바구니까지
        int k; // k번 공을 넣음

        n = sc.nextInt(); //바구니 갯수 입력
        m = sc.nextInt(); //반복할 횟수 입력
        for(int c=0;c<n;c++)
        {
            list1.add(0); // 배열 초기화
        }
        for(int a=0; a < m; a++)
        {
            i = sc.nextInt();
            j = sc.nextInt();
            k = sc.nextInt();
            i -=1;//배열은 0부터 시작하기에 조정해주기
            j -=1;//배열은 0부터 시작하기에 조정해주기

            for(int b=i;b<=j;b++)
            {
                list1.set(b,k); // 바구니에 공 번호 변경
            }

        }
        for(int z=0;z<list1.size();z++)
        {
            System.out.print(list1.get(z)+" ");// 출력
        }
    }
}
