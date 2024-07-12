package casting;

public class Casting3 {
    public static void main(String[] args) {
        // 오버플로우
        long maxIntValue = 2147483647; // int 최고값
        long maxIntOver = 2147483648L; // int 최고값 + 1 (초과)
        int intValue = 0;

        intValue = (int) maxIntValue;
        System.out.println("maxIntValue casting = " + intValue);

        intValue = (int) maxIntOver;
        System.out.println("maxIntOver casting=" + intValue); // -2147483648
        // 시계가 한 바퀴 돈 것처럼 다시 처음부터 시작한다.
        // 범위는 -2147... ~ 2147...
    }
}
