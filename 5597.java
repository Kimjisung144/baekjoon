import java.util.Scanner; // 입력받기 위한 헤더파일
import java.util.ArrayList; // 동적배열을 사용하기 위한 헤더파일
public class Main
{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<30;i++)
        {
            list.add(i,0); // 인덱스 0은 출석번호 1번
        }
        for(int j=0;j<28;j++)
        {
            list.set((sc.nextInt()-1),1); // 예 28 == 출석번호 27번
        }
        for(int k=0; k<list.size(); k++)
        {
            if(list.get(k) == 0)
            {
                System.out.print((k+1)+" ");
            }
        }
    }
}
