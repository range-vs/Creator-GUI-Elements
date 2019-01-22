package adapter;

import javafx.scene.Node;
import javafx.scene.control.TextField;

public class TextFieldToInterfaceElementClass implements InterfaceElement {
    private TextField component;
    private static int current = 0;
    private String becupStyle;

    public TextFieldToInterfaceElementClass(TextField c){
        component = c;
        component.setText(String.valueOf(current++));
        component.setMaxWidth(Double.MAX_VALUE);
        becupStyle = component.getStyle();
    }

    @Override
    public int decNumber() {
        return --current;
    }

    @Override
    public Node getElement() {
        return component;
    }

    @Override
    public void selectElem() {
        component.setStyle("-fx-background-color: green");
    }

    @Override
    public void restumeElem() {
        component.setStyle(becupStyle);
    }
}
