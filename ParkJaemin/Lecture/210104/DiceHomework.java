import java.util.Random;

public class DiceHomework {
    public static void main(String[] args) {
//        주사위를 10 번 굴려서 홀수는 더하고 짝수는 뺀다.
//        10번 굴린 이후의 주사위 눈금을 구하도록 프로그래밍 해보자!
//                (주사위 눈금의 총합을 구하면 된다)

        Random rand = new Random();

        System.out.println("주사위를 10번 굴려서 홀수는 더하고 짝수는 뺀다");
        int diceSum = 0;
        int evensum = 0, addsum = 0;
        for (int i = 0; i < 10; i++) {
            int dice = rand.nextInt(6) + 1;
            System.out.println("주사위 눈금 합 = " + dice);

            if (dice % 2 == 0) {
                evensum += dice;
                diceSum -= dice;
            } else {
                addsum += dice;
                diceSum += dice;
            }
        }
        System.out.println("결과는 = " + diceSum);
        System.out.println("짝수 합 = " + evensum);
        System.out.println("홀수 합 = " + addsum);
    }
}
