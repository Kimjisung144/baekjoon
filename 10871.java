import java.util.Scanner;
import java.util.ArrayList;
public class Main
{
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<Integer>();// 입력받을 정수 저장용 배열 동적 배열
        ArrayList<Integer> list2 = new ArrayList<Integer>();// n보다 작은 정수 저장용 배열
        Scanner sc = new Scanner(System.in);
        int n; //입력받을 정수 갯수
        int x; //기준선

        n = sc.nextInt(); //입력받을 정수 갯수 입력
        x = sc.nextInt(); // 기준 정수 입력
        for(int i=0;i<n;i++) //n번 반복
        {
            list1.add(sc.nextInt());// 모든 정수 list1 배열에 저장
        }
        for(int j=0;j<n;j++)
        {
            if(list1.get(j) < x)// 만약 n보다 작을시
            {
                list2.add(list1.get(j));  //배열에 저장
            }
        }
        for(int k=0; k< list2.size();k++)
        {
            System.out.print(list2.get(k)+" ");
        }
    }
}
