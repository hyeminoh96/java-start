package condition;

public class If6 {
    public static void main(String[] args) {
        // if문에 else if를 함께 사용하는 것은 서로 연관된 조건일 때 사용한다.
        // 그런데 서로 관련이 없는 독립 조건이면 else if를 사용하지 않고 if문을 각각 따로 사용해야 한다.
        int price = 10000;
        int age = 10;
        int discount = 0;

        if (price >= 10000){
            discount = discount + 1000;
            System.out.println("10000원 이상 구매, 1000원 할인");
        } else if (age <= 10) { // 조건 1을 만족해버렸으므로 조건 2를 검사하지 않음.
            discount = discount + 1000;
            System.out.println("어린이 1000원 할인");
        }

        System.out.println("총 할인 금액:" + discount + "원");
    }
}
