import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<Integer>();// 배열
        int num1; // 숫자 갯수
        int num2; //찾아야하는 숫자
        int count = 0;// 숫자 세기
        Scanner sc = new Scanner(System.in);
        num1 = sc.nextInt();

        for(int i=0;i<num1;i++)
        {
            al.add(sc.nextInt());
        }
        num2 = sc.nextInt();

        for(int j=0;j<al.size();j++)
        {
            if(al.get(j) == num2)
            {
                count++; // 찾아야 하는 숫자와 배열의 숫자가 같을경우 1증가
            }
        }
        System.out.println(count);
    }
}
