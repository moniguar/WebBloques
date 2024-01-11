/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

/**
 *
 * @author moniguar
 */
import java.util.List;
import DTO.Bloquecito;

public interface DaoBloquecito {
    public List <Bloquecito> bloquecitoSel();
    public Bloquecito bloquecitoGet(String palabra);
    public String bloquecitoIns(Bloquecito bloquecito);
    public String getMessage();
}