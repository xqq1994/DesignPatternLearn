package part4;

import java.util.LinkedList;
import java.util.List;

public abstract class Button {

    abstract void onPress();

    public List<ButtonListener> listeners;
    public Button() {
        this.listeners = new LinkedList<ButtonListener>();
    }

    public void addListener(ButtonListener listener){
        this.listeners.add(listener);
    }

    public void press(){
        onPress();
        for (ButtonListener listener : listeners) {
            listener.buttonPressed();
        }
    }
}
