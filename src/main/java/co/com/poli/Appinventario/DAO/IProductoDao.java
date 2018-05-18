
package co.com.poli.Appinventario.DAO;

import co.com.poli.Appinventario.Model.Producto;
import java.util.List;


public interface IProductoDao {
    
    List<Producto> getProductos();
}
