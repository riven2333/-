package student.hackthon.team15.entity;

public class HomeItems {
    private double expensesValue;
    private double billsValue;
    private double billsUnpaid;
    private double incomeValue;
    private double budget;
    private double accountValue;

    public HomeItems(double expensesValue, double billsValue, double billsUnpaid, double incomeValue, double budget, double accountValue) {
        this.expensesValue = expensesValue;
        this.billsValue = billsValue;
        this.billsUnpaid = billsUnpaid;
        this.incomeValue = incomeValue;
        this.budget = budget;
        this.accountValue = accountValue;
    }

    public double getExpensesValue() {
        return expensesValue;
    }

    public void setExpensesValue(double expensesValue) {
        this.expensesValue = expensesValue;
    }

    public double getBillsValue() {
        return billsValue;
    }

    public void setBillsValue(double billsValue) {
        this.billsValue = billsValue;
    }

    public double getBillsUnpaid() {
        return billsUnpaid;
    }

    public void setBillsUnpaid(double billsUnpaid) {
        this.billsUnpaid = billsUnpaid;
    }

    public double getIncomeValue() {
        return incomeValue;
    }

    public void setIncomeValue(double incomeValue) {
        this.incomeValue = incomeValue;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public double getAccountValue() {
        return accountValue;
    }

    public void setAccountValue(double accountValue) {
        this.accountValue = accountValue;
    }
}
