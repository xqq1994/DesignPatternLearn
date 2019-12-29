package part2;

public class Main {
    public static void main(String[] args) {
        Dialer dialer = new Dialer();
        new Button(new DigitButtonDailerAdepter(dialer)).buttonServer.buttonPressed(9);
        new Button(new DigitButtonDailerAdepter(dialer)).buttonServer.buttonPressed(10);
        new Button(new SendButtonDailerAdepter(dialer)).buttonServer.buttonPressed(12);
    }
}
