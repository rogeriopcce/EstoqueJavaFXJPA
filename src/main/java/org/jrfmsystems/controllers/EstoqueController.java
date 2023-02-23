package org.jrfmsystems.controllers;

import org.jrfmsystems.util.Alertas;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;

public class EstoqueController {

    @FXML
    private Button btnBoasVindas;

    @FXML
    void btnBoasVindasAction(ActionEvent event) {
    	
    	Alertas.showAlerta("Tela Principal", "Boas Vindas", 
    			"Nosso Controle de Estoque MAVEN/HIBERNATE",
    			AlertType.INFORMATION);
    }

}
