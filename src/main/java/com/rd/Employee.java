package com.rd;

public class Employee {
    private String name;
    private int workingDays;

    public Employee(String name) {
        this.name = name;
        this.workingDays = 0;
    }

    public void setWorkingDays(int workingDays) {
        this.workingDays = workingDays;
    }

    public double calculateSalary() {
        double salaryPerDay = 200; // Assuming daily salary is 200 TL
        double salary = workingDays * salaryPerDay;
        return salary;
    }

    public double calculateBonus() {
        int extraWorkingDays = workingDays - 25;
        double bonusPerDay = 1000; // Bonus for each extra working day
        double bonus = (extraWorkingDays > 0) ? extraWorkingDays * bonusPerDay : 0;
        return bonus;
    }
}
