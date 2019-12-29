package part2;

public class DigitButtonDailerAdepter implements ButtonServer {
    private Dialer dialer;

    public DigitButtonDailerAdepter(Dialer dialer) {
        this.dialer = dialer;
    }

    public void buttonPressed(int token) {
        dialer.enterDigit(token);
    }
}
