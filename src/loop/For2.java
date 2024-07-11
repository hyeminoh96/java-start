package loop;

public class For2 {
    public static void main(String[] args) {
        int sum = 0;
        int endNum = 3;

        for (int i = 1; i < endNum; i++){
            sum += i;
            System.out.println(i);
            System.out.println(sum);
        } // for문 안에서 선언된 변수는 for 문 안에서만 사용 가능!!!
    }
}
