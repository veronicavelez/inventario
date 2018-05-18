package co.com.poli.Appinventario.DATA;

import co.com.poli.Appinventario.Model.Producto;
import java.util.ArrayList;
import java.util.List;

public class ProductoData {

    private static List<Producto> listado;

    static {
        listado = new ArrayList<Producto>() {
            {
                add(new Producto("10", "Agua", 10D));
                add(new Producto("20", "Gaseosa", 10D));
                add(new Producto("20", "Gaseosa", 10D));
            }
        };
    }

    public static List<Producto> getProductos() {
        return listado;
    }

    public static void setProductos(List<Producto> newListado) {
        listado = newListado;
    }
}
