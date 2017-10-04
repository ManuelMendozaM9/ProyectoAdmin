/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import interfaces.DAOProducto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import projectadmin.Producto;
/**
 *
 * @author Manuel
 */
public class DAOProductoImpl extends Conexion implements DAOProducto {

    @Override
    public void registrar(Producto pro) throws Exception {
        try{
            Connection c = Conexion.getConnection();
            PreparedStatement st = c.prepareStatement(
                    "insert into evento(nombre,descripcion,precio,unidad_medida,"
                            + "categoria) values(?,?,?,?,?)");
            st.setString(1, pro.getNombre());
            st.setString(2, pro.getDescripcion());
            st.setDouble(3, pro.getPrecio());
            st.setString(4, pro.getUnidadMedida());
            st.setString(5, pro.getCategoria());
            st.executeQuery();
        }catch(Exception e){
            throw e;
        }finally{
            this.cerrar();
        }
    }

    @Override
    public List<Producto> verProducto() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void modificar(Producto pro) throws Exception {
        Connection c = Conexion.getConnection();
        PreparedStatement st = c.prepareStatement(
                "update producto set nombre = ?, descripcion = ?, precio = ?"
                        + "unidad_medida = ?, categoria = ? where producto_ID = "
                        + "select producto_ID from producto where nombre = ?");
                
    }

    @Override
    public void baja(Producto pro) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminar(Producto pro) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
