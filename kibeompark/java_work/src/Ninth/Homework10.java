package Ninth;

class GuGuDan {
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

        for (int i = start; i <= end; i++) {
            for (int j = START; j <= end; j++) {
                System.out.printf("%d x %d = %2d\n", i, j, i * j);
            }
            System.out.println("");
        }
    }
}
public class Homework10 {
    public static void main(String[] args) {
        GuGuDan ggd = new GuGuDan();

        ggd.printGuGuDan();
    }
}

/*
package Homework.Eighth;

class MultiplicationTables {
    public final int NUMBER = 9;

    public MultiplicationTables(int num) {
        System.out.printf("구구단 %d단 출력 !\n", num);

        for (int i = 1; i <= NUMBER; i++) {
            System.out.printf("%d * %d = %2d\n", num, i, num * i);
        }
        System.out.println();
    }

    public void printMT() {
        System.out.println("구구단 전체 출력 !");

        for (int i = 1; i <= NUMBER; i++) {
            System.out.printf("%d단\n", i);
            for (int j = 1; j <= NUMBER; j++) {
                System.out.printf("%d * %d = %2d\t", i, j, i * j);
            }
            System.out.println();
        }
    }
}

public class Homework10 {
    public static void main(String[] args) {
        // 10) 구구단을 클래스를 활용해서 프로그래밍 해 보자!
        MultiplicationTables mt = new MultiplicationTables(7);

        mt.printMT();
    }
}
 */