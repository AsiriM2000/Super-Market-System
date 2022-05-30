package dao.custom;

import dao.SuperDAO;
import dto.CustomDTO;
import entity.OrderDetails;

import java.sql.SQLException;
import java.util.ArrayList;

public interface QueryDAO extends SuperDAO {
    CustomDTO searchOrder(String id) throws SQLException, ClassNotFoundException;
    ArrayList<OrderDetails> ShowMovableItem()throws SQLException,ClassNotFoundException;
    ArrayList<OrderDetails> ShowLeastMovableItem()throws SQLException,ClassNotFoundException;
}
