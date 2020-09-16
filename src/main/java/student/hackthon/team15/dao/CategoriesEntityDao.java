package student.hackthon.team15.dao;

import student.hackthon.team15.entity.CategoriesEntity;

import java.util.List;

public interface CategoriesEntityDao {
    public List<CategoriesEntity> getAllCategories();
    public void addItemToCategories(CategoriesEntity categoriesEntity);
    public void updateItemInCategories(CategoriesEntity categoriesEntity);
    public void deleteItemInCategories(CategoriesEntity categoriesEntity);
    public void deleteItemInCategoriesbyId(String id);
}
