package casting;

public class Casting4 {
    public static void main(String[] args) {
        // 같은 타입의 연산은 같은 타입의 결과를 낸다.
        // 서로 다른 타입의 게산은 큰 범위로 자동 형변환이 일어난다.

        int div1 = 3 / 2;
        System.out.println("div1 = " + div1);

        double div2 = 3 / 2;
        System.out.println("div2 = " + div2); // 자동형변환 발생

        double div3 = 3.0 / 2;
        // = 3.0 / 2.0
        System.out.println("div3 = " + div3);

        double div4 = (double) 3 / 2;
        System.out.println("div4 = " + div4);

        int a = 3;
        int b = 2;
        double result = (double) a / b;
        System.out.println("result = " + result);
    }
}
