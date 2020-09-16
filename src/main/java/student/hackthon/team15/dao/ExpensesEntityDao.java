package student.hackthon.team15.dao;

import student.hackthon.team15.entity.ExpensesEntity;

import java.util.List;

public interface ExpensesEntityDao {
    public List<ExpensesEntity> getAllExpenses();
    public List<ExpensesEntity> getAllBills();
    public void addItemToExpenses(ExpensesEntity expensesEntity);
    public void deleteItemInExpensesbyId(String id);
    public void deleteItemInExpenses(ExpensesEntity expensesEntity);
    public void updateItemInExpenses(ExpensesEntity expensesEntity);
    public double getTotalAccout();
    public double getTotalBills();
    public double getTotalBillsUnpaid();
    public double getExpense(String id);

}
