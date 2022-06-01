package dto;

import java.math.BigDecimal;
import java.time.LocalDate;

public class IncomeDTO {
    private String OrderId;
    private LocalDate OrderDate;
    private BigDecimal total;

    public IncomeDTO() {
    }

    public IncomeDTO(String orderId, LocalDate orderDate, BigDecimal total) {
        this.OrderId = orderId;
        this.OrderDate = orderDate;
        this.total = total;
    }
    public IncomeDTO(BigDecimal total) {
        this.total = total;
    }
    public String getOrderId() {
        return OrderId;
    }

    public void setOrderId(String orderId) {
        this.OrderId = orderId;
    }

    public LocalDate getOrderDate() {
        return OrderDate;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.OrderDate = orderDate;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "IncomeDTO{" +
                "OrderId='" + OrderId + '\'' +
                ", OrderDate=" + OrderDate +
                ", total=" + total +
                '}';
    }
}
