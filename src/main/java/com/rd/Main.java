package com.rd;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("John");
        employee.setWorkingDays(28); // Assuming John worked for 28 days
        double salary = employee.calculateSalary();
        double bonus = employee.calculateBonus();
        double totalPayment = salary + bonus;
        System.out.println("Salary: " + salary + " TL");
        System.out.println("Bonus: " + bonus + " TL");
        System.out.println("Total Payment: " + totalPayment + " TL");
    }
}