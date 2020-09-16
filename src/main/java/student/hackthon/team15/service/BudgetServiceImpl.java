package student.hackthon.team15.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import student.hackthon.team15.dao.BudgetEntityDao;
import student.hackthon.team15.entity.BudgetEntity;

import java.util.List;

@Service
public class BudgetServiceImpl implements BudgetService{
    @Autowired
    BudgetEntityDao budgetEntityDao;

    @Override
    public List<BudgetEntity> getAllBudget() {
        return budgetEntityDao.getAllBudget();
    }

    @Override
    public boolean ifContainsBudget(BudgetEntity budgetEntity) {
        return budgetEntityDao.ifContainsBudget();
    }

    @Override
    public void modifyBudget(BudgetEntity budgetEntity) {
        budgetEntityDao.modifyBudgetItem(budgetEntity);
    }

    @Override
    public void addBudget(BudgetEntity budgetEntity){
        budgetEntityDao.addItemToBudget(budgetEntity);
    }
    @Override
    public void deleteBudget(BudgetEntity budgetEntity){
        budgetEntityDao.deleteBudgetItem(budgetEntity);
    }


}
