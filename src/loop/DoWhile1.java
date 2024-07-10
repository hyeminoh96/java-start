package loop;

public class DoWhile1 {
    public static void main(String[] args) {
        int i = 0;
        // do-while문은 최초 한 번은 코드블럭을 꼭 실행한다.
        do {
            System.out.println("현재 숫자는 " + i);
            i++;
        } while (i < 3);
        }
    }
