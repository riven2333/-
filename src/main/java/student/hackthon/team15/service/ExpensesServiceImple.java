package student.hackthon.team15.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import student.hackthon.team15.dao.AccountEntityDao;
import student.hackthon.team15.dao.CategoriesEntityDao;
import student.hackthon.team15.dao.ExpensesEntityDao;
import student.hackthon.team15.entity.CategoriesEntity;
import student.hackthon.team15.entity.ExpensesEntity;

import java.util.List;

@Service
public class ExpensesServiceImple implements ExpensesService{

    @Autowired
    ExpensesEntityDao expensesEntityDao;
    @Autowired
    CategoriesEntityDao categoriesEntityDao;
    @Autowired
    AccountEntityDao accountEntityDao;

    @Override
    public List<ExpensesEntity> getAllExpenses() {
        return expensesEntityDao.getAllExpenses();
    }

    @Override
    public void addItemsToExpenses(ExpensesEntity expensesEntity) {
        expensesEntityDao.addItemToExpenses(expensesEntity);
        double account = accountEntityDao.getAccountValue();
        account -= expensesEntity.getValue();
        accountEntityDao.updateAccount(account);
    }

    @Override
    public void modifyExpenses(ExpensesEntity expensesEntity) {
        String id = expensesEntity.getId();
        double o_expense = expensesEntityDao.getExpense(id);
        double n_expense = expensesEntity.getValue();
        double account = accountEntityDao.getAccountValue();
        account += n_expense;
        account -= o_expense;
        accountEntityDao.updateAccount(account);
        expensesEntityDao.updateItemInExpenses(expensesEntity);
    }
    @Override
    public void deleteExpensebyId(String id){
        expensesEntityDao.deleteItemInExpensesbyId(id);
    }
    @Override
    public void deleteExpense(ExpensesEntity expensesEntity){
        double account = accountEntityDao.getAccountValue();
        account -= expensesEntity.getValue();
        accountEntityDao.updateAccount(account);
        expensesEntityDao.deleteItemInExpenses(expensesEntity);
    }

    @Override
    public void addItemsToCategory(CategoriesEntity categoriesEntity) {
        categoriesEntityDao.addItemToCategories(categoriesEntity);
    }

    @Override
    public List<CategoriesEntity> getAllCategories() {
        return categoriesEntityDao.getAllCategories();
    }

    @Override
    public void modifyItemInCategories(CategoriesEntity categoriesEntity) {
        categoriesEntityDao.updateItemInCategories(categoriesEntity);
    }

    @Override
    public void deleteItemInCategories(CategoriesEntity categoriesEntity) {
        categoriesEntityDao.deleteItemInCategories(categoriesEntity);
    }
    @Override
    public void deleteItemInCategoriesbyId(String id){
        categoriesEntityDao.deleteItemInCategoriesbyId(id);
    }


}
