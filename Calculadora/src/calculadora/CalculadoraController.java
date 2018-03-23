/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author 01449817262
 */
public class CalculadoraController implements Initializable {
    
    private Double n1, n2, result;
    @FXML
    private TextField txtN1;
    @FXML
    private TextField txtN2;
    @FXML
    private Button btnSoma, btnMultiplica, btnSubtrai, btnDivide;
    @FXML
    private Label lblResultado;
    
    @FXML
    private void action(ActionEvent e) {
       n1 = Double.parseDouble(txtN1.getText());
       n2 = Double.parseDouble(txtN2.getText());
       
       lblResultado.setText("Resultado: "+calc(e));
    }
    
    private Double calc(ActionEvent e){
        if (e.getSource() == btnSoma){
            result= n1 + n2;        
        }
        else
            if (e.getSource() == btnSubtrai) {
                result = n1 - n2;
            }
        else
                if (e.getSource() == btnMultiplica) {
                    result = n1 * n2;
                }
        else
                    if (e.getSource() == btnDivide) {
                        result = n1 / n2;
                    }
        
                return result;
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
