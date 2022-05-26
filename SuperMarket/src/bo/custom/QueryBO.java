package bo.custom;

import bo.SuperBO;
import dto.CustomDTO;

import java.sql.SQLException;
import java.util.ArrayList;

public interface QueryBO extends SuperBO {
    CustomDTO searchOrderByOrderID(String id)throws SQLException,ClassNotFoundException;
}
