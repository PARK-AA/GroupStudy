package Twentyoneth;

public class FinalPerformanceTest {
    final static int ZERO = 0;
    final static int END = 1000000000;
    final static int START = 1;
    final static double COEFFICIENT = Math.pow(10, -15);
    final static double DEG2RAD = 180.0;

    final static int MAXTHREAD = 5;

    public static void main(String[] args) throws InterruptedException {
        double sum = ZERO;

        Thread[] thr = new Thread[MAXTHREAD];

        for(int i = 0; i < MAXTHREAD; i++) {
            thr[i] = new Thread(new AccelThread(START, END, MAXTHREAD, i));
        }

        PerformanceUtil.performanceCheckStart();

        for(int i = 0; i < MAXTHREAD; i++) {
            thr[i].start();
        }

        // 모든 쓰레드가 끝날 때까지 대기(for문의 동작이 완료될 때까지 기다림)
        for(int i = 0; i < MAXTHREAD; i++) {
            thr[i].join(); // 스레드 끝날 때까지 기다리는 것-끝까지 기다리려면(0)
                           // ( ) 괄호 안에 ms 의 기다리는 만큼 숫자 쓰록
        }

        PerformanceUtil.performanceCheckEnd();
        PerformanceUtil.printPerformance();
    }
}
