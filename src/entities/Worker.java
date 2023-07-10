package entities;

import entities.Department;
import entities.HourContract;
import entities.enums.WorkerLevel;

import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;

public class Worker {
    private String name;
    private WorkerLevel level;
    private Double baseSalary;
    private Department department;
    private List<HourContract> hourContract = new ArrayList<>();


    public Worker(String name, WorkerLevel level, Double baseSalary) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;

    }
    public Worker(){

    }

    public List<HourContract> getHourContract() {
        return hourContract;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkerLevel getLevel() {
        return level;
    }

    public void setLevel(WorkerLevel level) {
        this.level = level;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }
    public void addContract(HourContract contract){
        hourContract.add(contract);
    }
    public void removeContract(HourContract contract){
        hourContract.remove(contract);
    }

    public double income(int year, int month){
        Calendar calendar = Calendar.getInstance();
        double sum = getBaseSalary();

        for (HourContract c: hourContract) {
            calendar.setTime(c.getDate());
            int calendarMonth = calendar.get(1 + Calendar.MONTH);
            int calendarYear = calendar.get(Calendar.YEAR);
            if (calendarMonth == month && calendarYear == year){
                sum += c.totalHours();
            }
        }
        return sum;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", level=" + level +
                ", baseSalary=" + baseSalary +
                ", department=" + department.getName() +
                ", hourContract=" + hourContract +
                '}';
    }
}
