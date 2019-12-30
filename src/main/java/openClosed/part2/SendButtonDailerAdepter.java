package openClosed.part2;

public class SendButtonDailerAdepter implements ButtonServer {
    private Dialer dialer;

    public SendButtonDailerAdepter(Dialer dialer) {
        this.dialer = dialer;
    }

    public void buttonPressed(int token) {
        dialer.dial();
    }
}
