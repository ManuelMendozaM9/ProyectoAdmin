/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.util.List;
import projectadmin.Producto;

/**
 *
 * @author Manuel
 */
public interface DAOProducto {
    public void registrar(Producto pro) throws Exception;
    public List<Producto> verProducto() throws Exception;
    public void modificar(Producto pro) throws Exception;
    public void baja(Producto pro) throws Exception;
    public void eliminar(Producto pro) throws Exception;
}
