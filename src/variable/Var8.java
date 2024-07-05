package variable;

public class Var8 {
    public static void main(String[] args) {
        // 정수
        byte b = 127; // -128 ~ 127 저장 가능, 2의 8승
        short s = 32767; // -32,768 ~ 32,767, 2의 16승
        int i = 2147483647; // - 20억 ~ 21억, 2의 32승. 기본 사용

        long l = 9223372036854775807L; // L을 붙여야 함. 2의 64승

        // 실수
        float f = 10.0f; // 7자리 정밀도. 거의 사용하지 않음
        double d = 10.0; // 15자리 정밀도. 기본 사용

        // 변수는 첫 글자는 소문자 낙타표기법
        String orderDetail;

        // 클래스는 첫 글자 대문자
    }
}
