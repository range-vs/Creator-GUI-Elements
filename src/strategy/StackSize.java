package strategy;

import collections.Stack;
import javafx.collections.ObservableList;
import javafx.scene.Node;
import javafx.scene.control.Alert;

public class StackSize implements Action {


    @Override
    public void start(Stack st, ObservableList<Node> children) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Информация");
        alert.setHeaderText("Результаты:");
        alert.setContentText("Количество элементов в стеке: " + st.size());
        alert.showAndWait();
    }
}
