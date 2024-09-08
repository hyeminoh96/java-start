package array;

public class EnhancedFor1 {
    public static void main(String[] args) {
        // 향상된 for문, for-each문
        int[] numbers = {1, 2, 3, 4, 5};
        for (int number : numbers){ // numbers의 전체 요소를 순회
            System.out.println(number);
        }
    }
}
