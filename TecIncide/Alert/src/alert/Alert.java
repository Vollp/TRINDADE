/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alert;

import java.awt.Button;
import java.net.URL;

/**
 *
 * @author alexandre.carvalho
 */
public class Alert {

    private Button btnAbrirAlert;
    public void initialize (URL url,ResoucerBundle rb) {
    
    }
    
    public void abrirAlert(){
        String ERROR = "";
        Alert alert = new Alert(Alert.AlertType.ERROR);
    }

    private static class AlertType {
        
    }
}
