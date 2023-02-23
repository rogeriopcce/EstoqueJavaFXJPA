package org.jrfmsystems.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.BatchSize;

import javafx.fxml.FXML;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Cliente {

	@Id
	@GeneratedValue( strategy = GenerationType.AUTO)
	@FXML
	private long id;

	@FXML
	@BatchSize(size = 150)
	private String nome;
	
}
