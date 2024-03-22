import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] list = new int[10]; // 정적 배열
        int count = 0;

        for(int i = 0; i < 10; i++)// 입력 10번 받기
        {
            list[i] = (sc.nextInt() % 42);// 하나 받을때마나 나머지 값을 list배열에 넣기
        }

        for(int j = 0; j < 10; j++)
        {
            if(list[j] < 0) // 중복 방지
            {
                continue; // j값 올려서 중복되는걸 뛰어넘기
            }
            count++;
            if(j == 9) // 어짜피 마지막 인덱스 값은 다음이 없기에 끝내기
            {
                break;
            }
            for(int k=(j+1); k<10; k++)
            {
                if(list[j] == list[k])
                {
                    list[k] = -1; // 중복은 통과 시키기기 위해 구별 -1넣기
                }
            }
        }
        System.out.println(count); // 서로 다른 나머지값 출력
    }
}
