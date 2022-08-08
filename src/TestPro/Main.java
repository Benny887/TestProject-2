package TestPro;

public class Main {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("JavaTheBest");
        int countOfReverse = 1000;
        System.out.println(sb);
        System.out.println(sb.reverse());
        for (int i = 0; i < 3; i++) {
            long start = System.nanoTime();
            reverseString(sb, countOfReverse);
            long finish = System.nanoTime();
            System.out.printf("%.7f\n", ((finish - start) / 1000000000.0));
            countOfReverse *= 10;
        }

    }

    public static void reverseString(StringBuilder sb, int countOfReverse) {
        for (int i = 0; i < countOfReverse; i++) {
            sb.reverse();
        }
    }

}
