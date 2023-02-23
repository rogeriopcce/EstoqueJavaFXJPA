package org.jrfmsystems;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class EstoqueFX extends Application {

    @Override
    public void start(Stage stage) {
    	try {
			Parent root = FXMLLoader.load(getClass().getResource("/View/ViewPrincipal.fxml"));
			System.out.println("Passou aqui");
			Scene cena = new Scene(root);
			
			stage.setScene(cena);
			stage.setTitle("Controle de Estoque");
			stage.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    }	


    public static void main(String[] args) {
        launch();
    }

}