package baseball.ui;

public class PrintManager {

    public void printGameStart() {
        System.out.println("숫자 야구 게임을 시작합니다.");
    }

    public void printInputValue() {
        System.out.printf("숫자를 입력해주세요 : ");
    }

    public void printResult(int strike, int ball) {
        if (ball == 0 && strike ==0) {
            System.out.println("낫싱");
        }

        if (ball == 0 && strike != 0) {
            System.out.println(strike + "스트라이크");
        }

        if (ball != 0 && strike == 0) {
            System.out.println(ball + "볼");
        }

        if (ball != 0 && strike != 0) {
            System.out.println(ball + "볼 " + strike + "스트라이크");
        }
    }

    public void printGameOver() {
        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
    }

    public void printRestart() {
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
    }

    public void printError() {
        System.out.println("적절하지 않은 값을 입력했습니다. 게임을 종료합니다.");
    }
}
