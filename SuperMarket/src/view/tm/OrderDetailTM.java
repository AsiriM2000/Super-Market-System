package view.tm;

import java.math.BigDecimal;

public class OrderDetailTM {
    private String ItemCode;
    private String description;
    private int OrderQty;
    private BigDecimal unitPrice;
    private BigDecimal total;

    private String OrderId;

    public OrderDetailTM(String itemCode, String description, int orderQty, BigDecimal unitPrice, BigDecimal total) {
        this.ItemCode = itemCode;
        this.description = description;
        this.OrderQty = orderQty;
        this.unitPrice = unitPrice;
        this.total = total;
    }

    public OrderDetailTM(String ItemCode, int orderQty, String description) {
        this.ItemCode = ItemCode;
        this.OrderQty = orderQty;
        this.description = description;
    }

    public String getItemCode() {
        return ItemCode;
    }

    public void setItemCode(String itemCode) {
        this.ItemCode = itemCode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "OrderDetailTM{" +
                "ItemCode='" + ItemCode + '\'' +
                ", description='" + description + '\'' +
                ", OrderQty=" + OrderQty +
                ", unitPrice=" + unitPrice +
                ", total=" + total +
                '}';
    }
}
