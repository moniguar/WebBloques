/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author moniguar
 */
import java.sql.*;

public class Bloquecito {
    
    private Integer id;
    private String palabra;
    private String resultado;
    private String fecha;

    public Bloquecito(){
        
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Integer getId() {
        return id;
    }

    public String getPalabra() {
        return palabra;
    }

    public String getResultado() {
        return resultado;
    }

    public String getFecha() {
        return fecha;
    }
    
   
    
    
    
}
