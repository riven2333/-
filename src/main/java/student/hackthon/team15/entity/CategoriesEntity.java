package student.hackthon.team15.entity;

import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;

@Document(collection="categories")
public class CategoriesEntity {
    @Id
    private String id;
    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
