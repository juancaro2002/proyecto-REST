package entities;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity 
@Table( name = "USUARIOS" ) 

public class Dependencia {
	private int id; 
	
	private String codigo; 
	private String descripcion;  
	private String cargo; 
	private boolean estado; 

}
