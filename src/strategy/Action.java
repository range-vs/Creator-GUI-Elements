package strategy;

import collections.Stack;
import javafx.collections.ObservableList;
import javafx.scene.Node;

public interface Action {
    public void start(Stack st, ObservableList<Node> children);
}
