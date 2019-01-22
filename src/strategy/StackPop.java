package strategy;

import collections.Stack;
import javafx.collections.ObservableList;
import javafx.scene.Node;

public class StackPop implements Action {
    @Override
    public void start(Stack st, ObservableList<Node> children) {
        if(children.size() == 0)
            return;
        st.peek().decNumber();
        Node n = st.peek().getElement();
        st.pop();
        children.remove(n);
    }
}

