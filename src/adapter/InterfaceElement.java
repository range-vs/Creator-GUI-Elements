package adapter;

import javafx.scene.Node;

public interface InterfaceElement { // интерфейс всех новых компонентов(по - умолчанию кнопка)
    public int decNumber(); // уменьшаем и возвращаем гомер номер
    public Node getElement(); // получаем элемент
    public void selectElem(); // выделяем элемент(peek)
    public void restumeElem(); // возвращаем стандартное выделение
}
