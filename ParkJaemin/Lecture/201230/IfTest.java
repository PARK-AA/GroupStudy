import java.util.Scanner;

public class IfTest {
    // psvm
    public static void main(String[] args) {
        //sout
        System.out.println("안녕, 난 인텔리제이야~");

        String str1 ="짝수";
        String str2 ="홀수";

        Scanner scan = new Scanner(System.in);
        System.out.println("숫자를 입력하세요: ");
        //키보드 입력으로 받은 숫자를 num 변수에 대입
        int num= scan.nextInt();

        // 문자열과 숫자가 + 되면
        // 자동으로 숫자는 문자열이 되어서 처리된다.
        System.out.println("당신이 입력한 숫자는 =" + num);
        System.out.println("당신이 입력한 숫자는 =" + num + num); //ㅡ> 문자형식으로 출력
        // 실제로 숫자를 처리하고자 한다면
        // 연산의 순서를 아래와 같이 변경하여 작업하면 된다.
        System.out.println("당신이 입력한 숫자는 =" + (num + num));

// 3항 연산자를 작성하는 방법
        //먼저 3항 연산자는 아래와 같은 형식으로 구성된다.
        // 조건 ? 참인경우 : 거짓인 경우

        // 아래 케이스의 경우엔 조건에 따라 결과값이 바뀌는데
        // 이 값을 res라는 변수에 대입한 것이다.

        String res =num % 2==0 ? str1 : str2;

        System.out.println(num+ "은" + res +" 입니다!");
    }
}
