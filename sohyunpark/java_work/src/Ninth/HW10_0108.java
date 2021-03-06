package Ninth;

class GuGuDan{
    int start, end;

    public GuGuDan() {
        start = 2;
        end = 9;
    }

    public GuGuDan(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public void printGuGuDan() {
        final int START = 1;
        for (int i = start; i <= end; i++){
            for (int j = START; j <= 9; j++) {
                System.out.printf("%d x %d = %2d\n", i, j, i * j);
            }
            System.out.println("");
        }
    }
}

public class HW10_0108 {
    public static void main(String[] args) {
        // 구구단을 클래스를 활용해서 프로그래밍 해보자!
        GuGuDan ggd = new GuGuDan();

        ggd.printGuGuDan();
    }
}
