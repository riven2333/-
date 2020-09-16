package student.hackthon.team15.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import student.hackthon.team15.entity.BudgetEntity;
import student.hackthon.team15.entity.IncomeEntity;
import org.springframework.stereotype.Repository;
import student.hackthon.team15.entity.BudgetEntity;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Update;

import org.slf4j.Logger;
import org.springframework.data.mongodb.core.query.Query;
import java.util.List;
@Repository
public class IncomeEntityDaoImpl implements IncomeEntityDao{
    private static final Logger logger = (Logger) LoggerFactory.getLogger(IncomeEntityDaoImpl.class);
    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public List<IncomeEntity> getAllIncome() {
        return mongoTemplate.findAll(IncomeEntity.class);
    }

    @Override
    public void addItemToIncome(IncomeEntity IncomeEntity) {
        mongoTemplate.insert(IncomeEntity);
    }

    @Override
    public void deleteItemInIncome(IncomeEntity IncomeEntity) {
        mongoTemplate.remove(IncomeEntity);
    }

    @Override
    public void updateItemInIncome(IncomeEntity IncomeEntity) {
        Query query = new Query();
        query.addCriteria(Criteria.where("_id").is(IncomeEntity.getId()));
        Update update = new Update();
        update.set("date",IncomeEntity.getDate());
        update.set("value",IncomeEntity.getValue());
        update.set("description",IncomeEntity.getDescription());
        mongoTemplate.updateFirst(query,update,IncomeEntity.class);
    }

    @Override
    public double getTotalIncome() {
        double sum = 0.0;
        List<IncomeEntity> entities = mongoTemplate.findAll(IncomeEntity.class);
        for(int i = 0; i < entities.size(); i++){
            sum += entities.get(i).getValue();
        }
        return sum;
    }

    @Override
    public double getIncome(String id){
        IncomeEntity incomeEntity = mongoTemplate.findById(id,IncomeEntity.class);
        return incomeEntity.getValue();
    }
}
