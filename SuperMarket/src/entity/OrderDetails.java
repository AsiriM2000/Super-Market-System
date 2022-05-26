package entity;

import java.math.BigDecimal;

public class OrderDetails {
    private String OrderId;
    private String ItemCode;
    private int OrderQty;
    private BigDecimal unitPrice;

    public OrderDetails() {
    }

    public OrderDetails(String orderId, String itemCode, int orderQty, BigDecimal unitPrice) {
        this.OrderId = orderId;
        this.ItemCode = itemCode;
        this.OrderQty = orderQty;
        this.unitPrice = unitPrice;
    }

    public String getOrderId() {
        return OrderId;
    }

    public void setOrderId(String orderId) {
        this.OrderId = orderId;
    }

    public String getItemCode() {
        return ItemCode;
    }

    public void setItemCode(String itemCode) {
        this.ItemCode = itemCode;
    }

    public int getOrderQty() {
        return OrderQty;
    }

    public void setOrderQty(int orderQty) {
        this.OrderQty = orderQty;
    }

    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }
}
