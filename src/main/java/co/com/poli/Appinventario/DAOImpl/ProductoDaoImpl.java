
package co.com.poli.Appinventario.DAOImpl;

import co.com.poli.Appinventario.DAO.IProductoDao;
import co.com.poli.Appinventario.DATA.ProductoData;
import co.com.poli.Appinventario.Model.Producto;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public class ProductoDaoImpl implements IProductoDao{

    @Override
    public List<Producto> getProductos() {
        return ProductoData.getProductos();
    }
    
    
    
}
