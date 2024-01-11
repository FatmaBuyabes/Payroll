import java.util.Date;

public class Payment {
    private Date paymentDate;
    private String paymentMethods;
    private double amount;

    public Payment(Date paymentDate, String paymentMethods, double amount) {
        this.paymentDate = paymentDate;
        this.paymentMethods = paymentMethods;
        this.amount = amount;
    }

    public Date getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }

    public String getPaymentMethods() {
        return paymentMethods;
    }

    public void setPaymentMethods(String paymentMethods) {
        this.paymentMethods = paymentMethods;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
