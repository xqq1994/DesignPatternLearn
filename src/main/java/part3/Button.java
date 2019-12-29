package part3;

import java.util.LinkedList;
import java.util.List;

public class Button {

    public List<ButtonListener> listeners;
    public Button() {
        this.listeners = new LinkedList<ButtonListener>();
    }

    public void addListener(ButtonListener listener){
        this.listeners.add(listener);
    }

    public void press(){
        for (ButtonListener listener : listeners) {
            listener.buttonPressed();
        }
    }
}
