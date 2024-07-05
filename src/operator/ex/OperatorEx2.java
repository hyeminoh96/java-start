package operator.ex;

public class OperatorEx2 {
    public static void main(String[] args) {
        double val1 = 1.5;
        double val2 = 2.5;
        double val3 = 3.5;
//        System.out.println("sum = " + (var1 + var2 + var3)); 이러한 문법은 허용되지 않음

        double sum = val1 + val2 + val3;
        double avg = sum / 3;

        System.out.println(sum);
        System.out.println(avg);
    }
}
