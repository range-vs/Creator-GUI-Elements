package strategy;

import adapter.InterfaceElement;
import collections.Stack;
import javafx.collections.ObservableList;
import javafx.scene.Node;

public class StackPush implements Action {

    private InterfaceElement elem;

    public StackPush(InterfaceElement e){
        elem = e;
    }

    @Override
    public void start(Stack st, ObservableList<Node> children) {
        if(st.size() != 0){
            st.peek().restumeElem();
        }
        st.push(elem);
        children.add(0, elem.getElement());
    }
}
