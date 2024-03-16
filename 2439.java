public class Main {
    public static void main(String[] args) {
        for(int i = 4; i >= 0; i--)//5번 실행
        {
            for(int j = 4; j > (4-i); j--)// 공백 생성
            {
                System.out.print(" ");
            }
            for(int k=0; k<(5-i); k++)// 별 생성
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
