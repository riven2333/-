package student.hackthon.team15.entity;

import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;

@Document(collection="account")
public class AccountEntity {
    @Id
    private String id;
    private double value;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
}
