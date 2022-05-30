package bo.custom.impl;

import bo.custom.QueryBO;
import dao.DAOFactory;
import dao.custom.QueryDAO;
import dto.CustomDTO;
import dto.CustomerDTO;
import dto.OrderDetailDTO;
import entity.Customer;
import entity.OrderDetails;

import java.sql.SQLException;
import java.util.ArrayList;

public class QueryBOImpl implements QueryBO {
    private final QueryDAO queryDAO = (QueryDAO) DAOFactory.getDaoFactory().getDAO(DAOFactory.DAOType.QUERYDAO);

    @Override
    public CustomDTO searchOrderByOrderID(String id) throws SQLException, ClassNotFoundException {
        return queryDAO.searchOrder(id);
    }

    @Override
    public ArrayList<OrderDetailDTO> getAllMovableItem() throws SQLException, ClassNotFoundException {
        ArrayList<OrderDetails> all = queryDAO.ShowMovableItem();
        ArrayList<OrderDetailDTO> allMovableItem = new ArrayList<>();
        for (OrderDetails order : all){
            allMovableItem.add(new OrderDetailDTO(order.getItemCode(),order.getOrderQty(),order.getDescription()));
        }
        return allMovableItem;
    }

    @Override
    public ArrayList<OrderDetailDTO> getAllLeastMovableItem() throws SQLException, ClassNotFoundException {
        ArrayList<OrderDetails> all = queryDAO.ShowLeastMovableItem();
        ArrayList<OrderDetailDTO> allLeastMovableItem = new ArrayList<>();
        for (OrderDetails order : all){
            allLeastMovableItem.add(new OrderDetailDTO(order.getItemCode(),order.getOrderQty(),order.getDescription()));
        }
        return allLeastMovableItem;
    }
}
