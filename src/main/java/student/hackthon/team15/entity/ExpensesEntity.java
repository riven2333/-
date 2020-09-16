package student.hackthon.team15.entity;

import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;
import java.util.Date;
@Document(collection="expenses")
public class ExpensesEntity {
    @Id
    private String id;
    private String categoryName;
    private double value;
    private String date;
    private boolean bill;

    public void setId(String id) {
        this.id = id;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setBill(boolean bill) {
        this.bill = bill;
    }

    public void setPaid(boolean paid) {
        this.paid = paid;
    }

    public String getId() {
        return id;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public double getValue() {
        return value;
    }

    public String getDate() {
        return date;
    }

    public boolean isBill() {
        return bill;
    }

    public boolean isPaid() {
        return paid;
    }

    private boolean paid;

}
