package sample;


import facad.Modeling;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.VBox;

public class Controller {

    @FXML
    private ComboBox typeComponent;
    @FXML
    private VBox panel;

    private Modeling facad;
    
    @FXML
    public void initialize() {
        // create facad
        facad = new Modeling();
        // Init combo box
        ObservableList<String> langs = FXCollections.observableArrayList("Кнопка", "Текстовое поле", "Метка");
        typeComponent.setItems(langs);
        typeComponent.setValue("Кнопка"); // устанавливаем выбранный элемент по умолчанию
    }


    public void startAction(ActionEvent act) {
        facad.action(panel, Integer.parseInt((String) ((Button)act.getSource()).getUserData()),  typeComponent.getSelectionModel().getSelectedIndex()) ;
    }
}
