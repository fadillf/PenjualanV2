package penjualan.interfc;

import penjualan.entity.pelanggan;
import java.sql.SQLException;
import java.util.List;
/**
 * @author Fadillah F
 */
public interface pelangganInterfc {
    pelanggan insert (pelanggan o) throws SQLException;
    void update (pelanggan o) throws SQLException;
    void delete (String id_pelanggan) throws SQLException;
    List getAll() throws SQLException;
}