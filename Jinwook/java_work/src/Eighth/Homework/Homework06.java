package Eighth.Homework;

import java.util.Random;

//특수한 주사위 게임이다.
//   플레이어의 수는 3명이라고 가정한다.
//   주사위는 1개 있으며 이 주사위는 정팔면체이다.
//   (면이 8 개 있다는 뜻: 1 ~ 8)
//   주사위를 굴려 가장 큰 숫자가 나온 사람이 이기는 게임이다.
//   규칙 1) 홀수가 나오면 한 번 더 굴릴 수 있다.
//          [단 최초 한 번만 허용된다]
//   규칙 2) 홀수가 나와 기회를 한 번 더 얻었을때
//          그 다음에도 연속해서 홀수가 나오면 0 점 처리된다.
//   규칙 3) 홀수가 나와 기회를 한 번 더 얻었을때
//          아래의 숫자들은 각각 다른 능력을 가진다.
//          2: 이미 주사위를 얻은 사람의 주사위 값을 3 파괴한다.
//          4: 지정한 사용자의 주사위 값을 0 으로 만든다.
//          6: 모든 플레이어의 주사위 값을 2 파괴한다.
//          8: 자신을 제외한 모든 플레이어의 주사위 값을 3 상승시킨다.
//          [ 홀수만 아니라면 앞서 얻은 값에 두 번째 나온 값을 추가한다 ]
//   규칙 4) 합산 결과는 최소 0 이상이다.
//   규칙 5) 무승부가 발생한다면 승부가 날 때까지 게임을 다시 시작한다.
//
//ex) A: 7(5 + 2), B: 7(5 + 2), C: 9(1 + 8)
//       7 - 3 = 4    7 + 3 = 10
//       4 + 3 = 7
class DiceGame{
    int [] player;
    int dice;
    public DiceGame(int num){
        this.player = new int[num];

    }
    public void dice(){
        int cnt = 1;
        for(int i = 0; i < player.length; i++){
            player[i] = (int)(Math.random()*8)+1;
            System.out.println("dice " + player[i]);

        }
        cnt++;
    }
//    public int getDice( ){
//
//    }

}
public class Homework06 {
    public static void main(String[] args) {
        DiceGame dg = new DiceGame(3);
        dg.dice();

    }
}
