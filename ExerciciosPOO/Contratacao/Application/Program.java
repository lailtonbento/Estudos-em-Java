package ExerciciosPOO.Contratacao.Application;

import ExerciciosPOO.Contratacao.Department;
import ExerciciosPOO.Contratacao.HourContract;
import ExerciciosPOO.Contratacao.Worker;
import ExerciciosPOO.Contratacao.WorkerLevel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {
        Scanner scan = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Enter department's name: ");
        String departmentName = scan.next();
        System.out.println("Enter worker data: ");
        System.out.print("Name: ");
        String workerName = scan.next();
        System.out.print("Level: ");
        String workerLevel = scan.next();
        System.out.print("Base Salary: ");
        double baseSalary = scan.nextDouble();
        Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary, new Department(departmentName));
        System.out.print("How many contracts to this worker? ");
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter contract #" + i+1 + " data: ");
            System.out.print("Date (DD/MM/YYYY): ");
            Date contractDate = sdf.parse(scan.next());
            System.out.print("Value per hour: ");
            double valuePerHour = scan.nextDouble();
            System.out.print("Duration (hours): ");
            int hours = scan.nextInt();
            HourContract contract = new HourContract(contractDate, valuePerHour, hours);
            worker.addContract(contract);

        }
        System.out.print("Enter month and year to calculate income (MM/YYYY): ");
        String monthAndYear = scan.next();
        int month = Integer.parseInt(monthAndYear.substring(0, 2));
        int year = Integer.parseInt(monthAndYear.substring(3, 7));
        System.out.println("name: " + worker.getName());
        System.out.println("Department: " + departmentName);
        System.out.println("Income for: " + monthAndYear + ":" + String.format("%.2f", worker.income(year, month)));

        scan.close();
    }
}
