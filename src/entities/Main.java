package entities;
import entities.enums.WorkerLevel;
import java.util.Scanner;


// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        Worker Worker = new Worker();

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
        Worker.addContract(scann.nextInt());
    }
}