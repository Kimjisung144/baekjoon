import java.util.Scanner; // 입력받기 위한 헤더파일
import java.util.ArrayList; // 동적배열을 사용하기 위한 헤더파일
public class Main
{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        int n; // 바구니 갯수
        int m; // 샐행횟수
        int q; // 변경할 인덱스 변수1
        int r; // 변경할 인덱스 변수2
        int temp = 0;

        n = sc.nextInt();
        m = sc.nextInt();

        for(int i=1; i<=n; i++)
        {
            list.add((i-1),i); // 바구니 초기화
        }
        for(int j=0;j<m;j++)
        {
            q = sc.nextInt(); // 변경할 인덱스
            r = sc.nextInt(); // 변경할 인덱스
            q -=1; // 인덱스 변수를 위해 조정
            r -=1; // 인덱스 변수를 위해 조정

            temp = list.get(q); // 1을 임시 저장
            list.set(q,list.get(r)); // 1에 2를 저장
            list.set(r,temp); // 2에 임시변수 저장
        }
        for(int z = 0; z < list.size(); z++)
        {
            System.out.print(list.get(z)+" ");
        }
    }
}
