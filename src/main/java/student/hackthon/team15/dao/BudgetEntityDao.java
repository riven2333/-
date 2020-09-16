package student.hackthon.team15.dao;

import student.hackthon.team15.entity.BudgetEntity;

import java.util.List;

public interface BudgetEntityDao {
    public List<BudgetEntity> getAllBudget();
    public void addItemToBudget(BudgetEntity budgetEntity);
    public void deleteBudgetItem(BudgetEntity budgetEntity);
    public void modifyBudgetItem(BudgetEntity budgetEntity);
    public double getCurrentBudget();
    public boolean ifContainsBudget();
}
