package dao.custom;

import dao.SuperDAO;
import dto.CustomDTO;

import java.sql.SQLDataException;
import java.sql.SQLException;
import java.util.ArrayList;

public interface QueryDAO extends SuperDAO {
    CustomDTO searchOrder(String id) throws SQLException, ClassNotFoundException;
}
