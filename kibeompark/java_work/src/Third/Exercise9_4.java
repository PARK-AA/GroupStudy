package Third;

public class Exercise9_4 {
    public static void main(String[] args) {
        // 먼저 무한루프에서 주사위가 굴러가도록 만든다.
        for(;;) {
            int dice = (int)(Math.random() * 6) + 1;

            System.out.println("주사위 눈금 = " + dice);

            if(dice % 2 == 0) {
                System.out.println("짝수 입니다.");
                break;
            } else {
                System.out.println("홀수 입니다.");
            }
        }
    }
}