import java.util.Scanner; // 입력받기 위한 헤더파일
import java.util.ArrayList; // 동적배열을 사용하기 위한 헤더파일
public class Main
{
    public static void main(String[] args) {
        ArrayList <Integer>list1 = new ArrayList<Integer>(); //동적배열 선언

        Scanner sc = new Scanner(System.in); // 스캐너객체 선언
        int max; // 최댓값 저장 변수
        int index = 0; // 최댓값이 있는 인덱스 값

        for(int i=0; i<9; i++)
        {
            list1.add(sc.nextInt()); // 정수들 입력받기
        }

        max = list1.get(0); // 최댓값을 list1[0]으로 설정
        for(int j=0;j<list1.size();j++)
        {
            if(max < list1.get(j)) // 만약 max값이 작을시
            {
                max = list1.get(j);
                index = j;
            }
        }
        System.out.println(max+"\n"+(index+1)); // 최댓값과 최솟값 출력
    }
}
