package method;

public class Overloading3 {
    public static void main(String[] args) {
        System.out.println(add(1, 2));
        System.out.println(add(1.2, 1.2));
    }
    // method signature = 메서드 이룸 + 매개변수 타입과 순서

    public static int add(int a, int b){
        System.out.println("Call 1");
        return a + b;
    }
    // 위를 주석처리하여도 실행됨. 자동 형변환.

    public static double add(double a, double b){
        System.out.println("Call 2");
        return a + b;
    }
}
