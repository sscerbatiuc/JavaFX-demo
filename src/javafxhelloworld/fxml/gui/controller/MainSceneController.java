package javafxhelloworld.fxml.gui.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author sscerbatiuc
 */
public class MainSceneController implements Initializable {

    @FXML
    private Button btnPlus;

    @FXML
    private TextField txtFieldFirstNumber;

    @FXML
    private TextField txtFieldSecondNumber;

    @FXML
    private Button btnMinus;

    @FXML
    private Button btnMultiply;

    @FXML
    private Button btnDivide;

    @FXML
    private Label labelResult;

    /**
     * Initializes the controller class.
     *
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    public void onBtnPlusActionPerformed() {
        String first = this.txtFieldFirstNumber.getText();
        String second = this.txtFieldSecondNumber.getText();
        if (!first.isEmpty() && !second.isEmpty()) {
            Integer firstInt = Integer.parseInt(first);
            Integer secondInt = Integer.parseInt(second);
            this.labelResult.setText(String.valueOf(firstInt + secondInt));
        }
    }

}
