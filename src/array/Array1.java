package array;

public class Array1 {
    public static void main(String[] args) {
        int[] students; // 배열 변수 선언. 값이 아닌 배열을 담을 수 있다. 배열의 참조값을 가지고 있다.
//        students = new int[5]; // 실제 배열 생성. 숫자는 0으로 자동 초기화. boolean은 false, string은 null로 초기화
        students = new int[]{90, 80, 70, 60, 50}; // 배열 생성과 초기화


        for(int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }
    }
}
