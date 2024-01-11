/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO.IMP;

import conexion.DBConnection;
import DAO.DaoBloquecito;
import DTO.Bloquecito;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author moniguar
 */
public class DaoBloquecitoImp implements DaoBloquecito {
    
    private String mensaje;
    
    @Override
    public List<Bloquecito> bloquecitoSel() {
        List<Bloquecito> list = null;
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT ")
                .append("id,")
                .append("palabra,")
                .append("resultado,")
                .append("fecha")
                .append(" FROM bloquecito");
        try  {
            
            conexion.DBConnection conectar = new conexion.DBConnection();
            
            Connection con = conectar.getConnection();
            
            PreparedStatement ps = con.prepareStatement(sql.toString());
            ResultSet rs = ps.executeQuery();
            list = new ArrayList<>();
            while (rs.next()) {
                Bloquecito bloquecito = new Bloquecito();
                bloquecito.setId(rs.getInt(1));
                bloquecito.setPalabra(rs.getString(2));
                bloquecito.setResultado(rs.getString(3));
                bloquecito.setFecha(rs.getString(4));
                list.add(bloquecito);
            }
        } catch (SQLException e) {
            mensaje = e.getMessage();
        }
        return list;
    }

    @Override
    public Bloquecito bloquecitoGet(String arg0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String bloquecitoIns(Bloquecito arg0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getMessage() {
        return mensaje;
    }
    
}
