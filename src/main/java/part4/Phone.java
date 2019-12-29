package part4;

import part3.Button;
import part3.ButtonListener;
import part3.Dialer;

public class Phone {
    private Dialer dialer;
    private Button[] digitButtons;
    private Button sendButton;

    public Phone() {
        dialer = new Dialer();
        digitButtons = new Button[10];
        for (int i = 0; i < digitButtons.length; i++) {
            digitButtons[i] = new Button();
            final int digit = i;
            digitButtons[i].addListener(new ButtonListener() {
                public void buttonPressed() {
                    dialer.enterDigit(digit);
                }
            });
            sendButton = new Button();
            sendButton.addListener(new ButtonListener() {
                public void buttonPressed() {
                    dialer.dial();
                }
            });
        }
    }

    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.digitButtons[9].press();
        phone.digitButtons[1].press();
        phone.digitButtons[1].press();
        phone.sendButton.press();
    }
}
