package entities;
import entities.enums.WorkerLevel;

import javax.lang.model.util.SimpleElementVisitor6;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;


// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner scann = new Scanner(System.in);
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        Worker Worker = new Worker();
        SimpleDateFormat sdf = new SimpleDateFormat();

        System.out.print("Enter department: ");
        Worker.setDepartment(new Department(scann.nextLine()));
        System.out.println("Please write your date: ");
        System.out.print("Name: ");
        Worker.setName(scann.nextLine());
        System.out.print("Level: ");
        Worker.setLevel(WorkerLevel.valueOf(scann.nextLine()));
        System.out.print("Base Salary: ");
        Worker.setBaseSalary(scann.nextDouble());
        System.out.print("How many contracts you worked? ");
        int n = scann.nextInt();
        for (int i = 0; i < n; i++){
            HourContract contract = new HourContract();
            System.out.println("Enter contract #" +  i  + " data:");
            System.out.println("Date (DD/MM/YYYY): ");
            contract.setDate(format.parse(scann.next()));
            System.out.println("Value per hours: ");
            contract.setValuesPerHours(scann.nextDouble());
            System.out.println("Hours: ");
            contract.setDuration(scann.nextInt());
            Worker.addContract(contract);
        }
        System.out.println("What date needs calculate? ");
        String monthAndYear = scann.next();
        int month = Integer.parseInt(monthAndYear.substring(0,2));
        int year = Integer.parseInt(monthAndYear.substring(3));

        System.out.println("Name: " + Worker.getName());
        System.out.println("Depatment: " + Worker.getDepartment().getName());
        System.out.println("Income for" + monthAndYear + ": " + Worker.income(month,year));
        scann.close();
    }
}