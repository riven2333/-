package student.hackthon.team15.dao;

import student.hackthon.team15.entity.IncomeEntity;

import java.util.List;

public interface IncomeEntityDao {
    public List<IncomeEntity> getAllIncome();
    public void addItemToIncome(IncomeEntity IncomeEntity);
    public void deleteItemInIncome(IncomeEntity IncomeEntity);
    public void updateItemInIncome(IncomeEntity IncomeEntity);
    public double getTotalIncome();
    public double getIncome(String id);
}
