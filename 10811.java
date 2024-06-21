import java.lang.Math;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<Integer>();//동적배열 생성
        int n = 0; // 전체 배열 크기
        int m = 0; // 역순할 배열 크기
        int i = 0; // 역순 배열 시작지점
        int j = 0; // 역순 배열 마지막지점
        int count=0;
        int temp;

        Scanner sc = new Scanner(System.in); // 스캐너 객체 생성

        n = sc.nextInt(); // 전체 배역 크기 입력받기
        m = sc.nextInt(); // 역순할 배열 크기 출력

        for(int k=0;k<n;k++)
        {
            list.add(k+1); // 배열에 자기 주머니 숫자 저장
        }

        i = sc.nextInt(); // 역순 배열 시작지점입력받기
        j = sc.nextInt(); // 역순 배열 마지막지점출력
        i--; // 인덱스를 위해 조정
        j--; // 인덱스를 위해 조정
        int y = Math.round((j+1)/2); // 반올림
        //역순정렬시전
        for(int k=i;k<y;k++)
        {
            temp = list.get(k); // 교체할 위치 값을 임시저장 할 곳에 저장
            list.set(k,list.get(j-count)); //34~35까지 교체하는 과정
            list.set((j-count),temp);
            count = count+1;

        }
        for(int k=0;k<n;k++)
        {
            System.out.print(list.get(k) + " ");//배열 출력
        }
    }
}
