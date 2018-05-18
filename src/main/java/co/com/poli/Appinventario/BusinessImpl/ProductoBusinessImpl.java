package co.com.poli.Appinventario.BusinessImpl;

import co.com.poli.Appinventario.Business.IProductoBusiness;
import co.com.poli.Appinventario.DAO.IProductoDao;
import co.com.poli.Appinventario.Model.Producto;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ProductoBusinessImpl implements IProductoBusiness{
    
    @Autowired IProductoDao producto;
    
    @Override
    public List<Producto> getProductos() {
        return producto.getProductos();
    }
    
}
