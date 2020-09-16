package student.hackthon.team15.entity;

import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;

@Document(collection="person")
public class productPerson {
    @Id
    public String id;
    public String age;
    public String name;
    public boolean good;

}