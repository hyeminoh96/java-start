package operator.ex;

public class OperatorEx3 {
    public static void main(String[] args) {
        int score = 79;
        boolean result = score >= 80 && score <= 100;
        boolean result2 = 80 <= score && score <= 100; // 가독성 향상을 위한 방법
        System.out.println(result);
        System.out.println(result2);
    }
}
