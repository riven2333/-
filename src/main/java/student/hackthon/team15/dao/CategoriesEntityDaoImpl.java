package student.hackthon.team15.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Repository;
import student.hackthon.team15.entity.CategoriesEntity;


import java.util.List;


@Repository
public class CategoriesEntityDaoImpl implements CategoriesEntityDao{
    private static final Logger logger = (Logger) LoggerFactory.getLogger(CategoriesEntityDaoImpl.class);
    @Autowired
    private MongoTemplate mongoTemplate;
    @Override
    public List<CategoriesEntity> getAllCategories() {
        return mongoTemplate.findAll(CategoriesEntity.class);
    }

    @Override
    public void addItemToCategories(CategoriesEntity categoriesEntity) {
        mongoTemplate.insert(categoriesEntity,"categories");
    }

    @Override
    public void updateItemInCategories(CategoriesEntity categoriesEntity){
        mongoTemplate.save(categoriesEntity);
    }

    @Override
    public void deleteItemInCategories(CategoriesEntity categoriesEntity) {
        mongoTemplate.remove(categoriesEntity);
    }

    @Override
    public void deleteItemInCategoriesbyId(String id){
        Query query = new Query();
        query.addCriteria(Criteria.where("_id").is(id));
        mongoTemplate.remove(query,"categories");
    }

}
