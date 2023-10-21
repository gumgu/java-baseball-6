package baseball;

public class PrintManager {

    public void printGameStart() {
        System.out.println("숫자 야구 게임을 시작합니다.");
    }

    public void printInputValue() {
        System.out.println("숫자를 입력해주세요.");
    }

    public void printResult(int strike, int ball) {

        if (ball == 0 && strike ==0) {
            System.out.println("낫싱");
        }

        if (ball == 0) {
            System.out.println(strike + "스트라이크");
        }

        if (strike == 0) {
            System.out.println(ball + "볼");
        }

        System.out.println(ball + "볼 " + strike + "스트라이크");

    }

}
