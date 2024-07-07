package condition;

public class CondOp2 {
    public static void main(String[] args) {
        int age = 18;
        // 삼항 연산자
        String status = (age >= 18) ? "성인" : "미성년자"; //조건이 참이면 왼쪽, 거짓이면 오른쪽

        System.out.println("age = " + age + " status = " + status);
    }
}
