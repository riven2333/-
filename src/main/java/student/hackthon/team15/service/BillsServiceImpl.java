package student.hackthon.team15.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import student.hackthon.team15.dao.ExpensesEntityDao;
import student.hackthon.team15.entity.ExpensesEntity;

import java.util.List;

@Service
public class BillsServiceImpl implements BillsService {
    @Autowired
    ExpensesEntityDao expensesEntityDao;

    @Override
    public List<ExpensesEntity> getAllBillsDetails() {
        return expensesEntityDao.getAllBills();
    }
}
