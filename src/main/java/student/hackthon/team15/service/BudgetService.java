package student.hackthon.team15.service;

import student.hackthon.team15.entity.BudgetEntity;

import java.util.List;

public interface BudgetService {
    public List<BudgetEntity> getAllBudget();
    public boolean ifContainsBudget(BudgetEntity budgetEntity);
    public void modifyBudget(BudgetEntity budgetEntity);
    public void addBudget(BudgetEntity budgetEntity);
    public void deleteBudget(BudgetEntity budgetEntity);
}
