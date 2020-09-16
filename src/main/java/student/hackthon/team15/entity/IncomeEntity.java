package student.hackthon.team15.entity;

import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;

@Document(collection="income")
public class IncomeEntity {
    @Id
    private String id;
    private String date;
    private double value;
    private String description;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
