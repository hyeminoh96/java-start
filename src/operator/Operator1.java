package operator;

public class Operator1 {
    public static void main(String[] args) {
        // 변수 초기화
        int a = 5;
        int b = 2;

        int sum = a + b;
        System.out.println(sum);

        int diff = a - b;
        System.out.println(diff);

        int multi = a * b;
        System.out.println(multi);

        int div = a / b; // int형은 소수점을 표현할 수 없으므로 2.5가 아닌 2가 출력됨
        System.out.println(div);

        int mod = a % b;
        System.out.println(mod);
    }
}
