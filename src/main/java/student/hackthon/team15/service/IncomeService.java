package student.hackthon.team15.service;

import student.hackthon.team15.entity.IncomeEntity;

import java.util.List;

public interface IncomeService {
    public List<IncomeEntity> getIncomesList();
    public void addIncome(IncomeEntity incomeEntity);
    public void deleteIncome(IncomeEntity incomeEntity);
    public void updateIncome(IncomeEntity incomeEntity);
}
