package strategy;

import adapter.InterfaceElement;
import collections.Stack;
import javafx.collections.ObservableList;
import javafx.scene.Node;


public class StackPeek implements  Action {
    @Override
    public void start(Stack st, ObservableList<Node> children) {
        InterfaceElement n = st.peek();
        if(n == null)
            return;
        n.selectElem();
    }
}
