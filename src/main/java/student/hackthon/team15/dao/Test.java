package student.hackthon.team15.dao;

import student.hackthon.team15.entity.productPerson;

import java.util.List;
public interface Test {
    productPerson getBookById(String id);
    void findAll(productPerson productPerson);
    void dele(String id);
}
