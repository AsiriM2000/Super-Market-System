package dao.custom.impl;

import dao.SQLUtil;
import dao.custom.QueryDAO;
import dto.CustomDTO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;


public class QueryDAOImpl implements QueryDAO {
    @Override
    public CustomDTO searchOrder(String id) throws SQLException, ClassNotFoundException {
        ResultSet rst = SQLUtil.executeQuery("select o.orderId,o.orderDate,o.custId,OD.itemCode,OD.orderQty,OD.unitPrice,OD.total from orders o inner join orderDetails OD on o.orderId = OD.orderID where o.orderId =?",id);
        while (rst.next()){
            return new CustomDTO(rst.getString(1), LocalDate.parse(rst.getString(2)),rst.getString(3),rst.getString(4),rst.getInt(5),rst.getBigDecimal(6),rst.getBigDecimal(7));
        }
        return null;
    }

}
