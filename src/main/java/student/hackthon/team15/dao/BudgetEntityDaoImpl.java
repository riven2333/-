package student.hackthon.team15.dao;

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
public class BudgetEntityDaoImpl implements BudgetEntityDao{
    private static final Logger logger = (Logger) LoggerFactory.getLogger(BudgetEntityDaoImpl.class);
    @Autowired
    private MongoTemplate mongoTemplate;
    @Override
    public List<BudgetEntity> getAllBudget() {
        return mongoTemplate.findAll(BudgetEntity.class);
    }

    @Override
    public void addItemToBudget(BudgetEntity budgetEntity) {
        mongoTemplate.insert(budgetEntity);
    }

    @Override
    public void deleteBudgetItem(BudgetEntity budgetEntity) {
        mongoTemplate.remove(budgetEntity);
    }

    @Override
    public void modifyBudgetItem(BudgetEntity budgetEntity){
        Query query = new Query();
        query.addCriteria(Criteria.where("_id").is(budgetEntity.getId()));
        Update update = Update.update("value", budgetEntity.getValue());
        mongoTemplate.updateFirst(query,update,BudgetEntity.class);
    }

    @Override
    public double getCurrentBudget() {
        List<BudgetEntity> budgetEntities = mongoTemplate.findAll(BudgetEntity.class);
        return budgetEntities.get(budgetEntities.size() - 1).getValue();
    }

    @Override
    public boolean ifContainsBudget() {
        List<BudgetEntity> budgetEntities = mongoTemplate.findAll(BudgetEntity.class);
        return !budgetEntities.isEmpty();
    }
}
