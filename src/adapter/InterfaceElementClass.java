package adapter;

import javafx.scene.Node;
import javafx.scene.control.Button;

public class InterfaceElementClass extends Button implements InterfaceElement {
    private static int current = 0;
    private String becupStyle;

    public InterfaceElementClass(){
        super();
        setText(String.valueOf(current++));
        setMaxWidth(Double.MAX_VALUE);
        becupStyle = getStyle();
    }

    @Override
    public int decNumber() {
        return --current;
    }

    @Override
    public Node getElement() {
        return this;
    }

    @Override
    public void selectElem() {
        setStyle("-fx-background-color: green");
    }

    @Override
    public void restumeElem() {
        setStyle(becupStyle);
    }

}
