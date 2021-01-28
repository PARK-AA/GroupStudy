package Twentyoneth;

public class AccelThread extends OperationAccelerator implements Runnable{
    private int localStart;
    private int localEnd;
    private int threadId;

    private double localSum = 0;

    private static double totalSum = 0;

    // maxThreadNum = 5   (1, 10억, 5, for문의 i)
    public AccelThread(int start, int end, int maxThreadNum, int id) {
        super(start, end, maxThreadNum);

        int total = end - start + 1; // 10억
        int threadPerData = total / maxThreadNum; // threadPerData=10억/5

        localStart = id * threadPerData + 1; // id=0)0*2억+1    id=1,2,3,4
        localEnd = localStart + threadPerData - 1;// id=0)1+2억-1   id=1,2,3,4
        threadId = id;
    }

    public synchronized void addAll(double localSum) {
        totalSum += localSum;
    }

    public void run() {
        System.out.printf("threadId = %d, localStart = %d\n", threadId, localStart);
        System.out.printf("threadId = %d, localEnd = %d\n", threadId, localEnd);

        for(int i = localStart; i <= localEnd; i++) {
            localSum += (i * (FinalPerformanceTest.COEFFICIENT * i)) *
                    Math.sin(i * Math.PI / FinalPerformanceTest.DEG2RAD);
        }

        System.out.printf("threadId = %d, localSum = %f\n", threadId, localSum);

        addAll(localSum);

        System.out.printf("threadId = %d, totalSum = %f\n", threadId, totalSum);
    }

}
