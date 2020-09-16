package student.hackthon.team15.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import student.hackthon.team15.dao.AccountEntityDao;
import student.hackthon.team15.dao.BudgetEntityDao;
import student.hackthon.team15.dao.ExpensesEntityDao;
import student.hackthon.team15.dao.IncomeEntityDao;
import student.hackthon.team15.entity.HomeItems;

@Service
public class HomeItemsServiceImpl implements HomeItemsService{
    @Autowired
    ExpensesEntityDao expensesEntityDao;
    @Autowired
    IncomeEntityDao incomeEntityDao;
    @Autowired
    BudgetEntityDao budgetEntityDao;
    @Autowired
    AccountEntityDao accountEntityDao;


    @Override
    public HomeItems getHomeItems() {
        double expenses, bills, billsUnpaid, incomeValue, budget, accountValue;
        expenses = expensesEntityDao.getTotalAccout();
        bills = expensesEntityDao.getTotalBills();
        billsUnpaid = expensesEntityDao.getTotalBillsUnpaid();
        incomeValue = incomeEntityDao.getTotalIncome();
        budget = budgetEntityDao.getCurrentBudget();
//        accountValue = accountEntityDao.updateAccount(900.76);
        accountValue = accountEntityDao.getAccountValue();


        HomeItems homeItems = new HomeItems(expenses,bills,billsUnpaid,incomeValue,budget,accountValue);
        return homeItems;
    }
}
