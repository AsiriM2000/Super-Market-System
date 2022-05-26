package bo.custom.impl;

import bo.custom.QueryBO;
import dao.DAOFactory;
import dao.custom.QueryDAO;
import dto.CustomDTO;

import java.sql.SQLException;

public class QueryBOImpl implements QueryBO {
    private final QueryDAO queryDAO = (QueryDAO) DAOFactory.getDaoFactory().getDAO(DAOFactory.DAOType.QUERYDAO);

    @Override
    public CustomDTO searchOrderByOrderID(String id) throws SQLException, ClassNotFoundException {
        return queryDAO.searchOrder(id);
    }
}
