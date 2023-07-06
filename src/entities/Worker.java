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

    public void setHourContract(HourContract contract) {
        this.hourContract.add(contract);
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
    public void addContract(int value){
        for (var i = 0; i < value; i++){
            Scanner scann = new Scanner(System.in);
            HourContract Contract = new HourContract();
            System.out.println("Enter contract #" + i + ": ");
            System.out.print("Date(DD/MM/YYYY): ");
            Contract.setDate(LocalDate.parse(scann.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy")));
            System.out.println("How many hours this contract: ");
            Contract.setHours(LocalTime.parse(scann.next(),DateTimeFormatter.ofPattern("HH:mm")));
            System.out.println("Whats's value of hours: ");
            Contract.setValuesPerHours(scann.nextDouble());
            System.out.println("Duration this contract: ");
            Contract.setDuration(LocalTime.parse(scann.next(), DateTimeFormatter.ofPattern("HH:mm")));
            setHourContract(Contract);
        }
    }
    public void removeContract(){

    }
    public double income(){
        return 0;
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
