package facad;

import adapter.InterfaceElement;
import adapter.InterfaceElementClass;
import adapter.LabelToInterfaceElementClass;
import adapter.TextFieldToInterfaceElementClass;
import collections.Stack;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import strategy.*;
import strategy.Action;

public class Modeling { // фасад. Всё действия скрыты от пользователя и сведегны в вызов одного метода

    private Stack elements; // стек элементов
    private Action action; // действие

    public Modeling(){
        elements = new Stack();
    }

    public void action(VBox panel, int act, int c){

            switch (act) { // употребление стратегии. Определение действия
                case 0: {
                    InterfaceElement elem = null;
                    switch(c){ // употребление адаптера
                        case 0:
                            elem = new InterfaceElementClass();
                            break;

                        case 1:
                            elem = new TextFieldToInterfaceElementClass(new TextField()); // адаптируем TextField к InterfaceElement
                            break;

                        case 2:
                            elem = new LabelToInterfaceElementClass(new Label()); // адаптируем Label к InterfaceElement
                            break;

                        default:
                            break; // недостижимо
                    }
                    action = new StackPush(elem);
                    break;
                }
                case 1:
                    action = new StackPop();
                    break;

                case 2:
                    action = new StackPeek();
                    break;

                case 3:
                    action = new StackSize();
                    break;

                default:
                    break; // недостижимо
            }
        action.start(elements, panel.getChildren()); // запуск действия
    }
}
