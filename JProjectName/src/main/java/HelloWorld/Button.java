package HelloWorld;

import java.util.List;
import java.util.ArrayList;

public class Button {

    private List<ClickListener> listenerList = new ArrayList<>();

    public void addListener(ClickListener listener) {
        listenerList.add(listener);
    }

    public void click() {
        for (ClickListener listener : listenerList) {
            listener.onClick();
        }
    }
}