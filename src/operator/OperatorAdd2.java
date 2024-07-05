package operator;

public class OperatorAdd2 {
    public static void main(String[] args) {
        int a = 1;
        int b = 0;

        b = ++a; //a의 값을 먼저 증가시키고 그 결과를 b에 대입
        System.out.println("a = " + a); // python과 달리 , 로 연결할 수 없음
        System.out.println("b = " + b);

        a = 1; // a의 값을 다시 1로 지정
        b = 0; // b의 값을 다시 0으로 지정

        b = a++; // a의 현재 값을 b에 먼저 대입하고 그 후 a의 값을 증가
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        ++a; // 단독으로 사용하면 자기 자신만 증가시킴
        System.out.println(a);


    }
}
