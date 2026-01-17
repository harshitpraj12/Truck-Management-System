package com.harshit;

import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        TruckServices truckServices = new TruckServices();
        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\nWhich operation do you want to perform?");
            System.out.println("1: Insertion");
            System.out.println("2: Update");
            System.out.println("3: Get Truck By ID");
            System.out.println("4: Get All Truck");
            System.out.println("5: Delete by ID");
            System.out.println("6: Exit");
            System.out.print("Enter your choice: ");

            int a = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (a) {

                case 1:
                    System.out.println("Enter Truck Company: ");
                    String com = sc.nextLine();

                    System.out.println("Enter Truck Model: ");
                    String model = sc.nextLine();

                    System.out.println("Enter Truck Number: ");
                    int num = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Enter Truck Driver Name: ");
                    String driver = sc.nextLine();

                    Truck truck = new Truck(com, model, num, driver);
                    truckServices.addTruck(truck);
                    System.out.println("Truck inserted successfully ✅");
                    break;

                case 2:
                    System.out.println("Enter Truck ID to update: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Enter Truck Company: ");
                    com = sc.nextLine();

                    System.out.println("Enter Truck Model: ");
                    model = sc.nextLine();

                    System.out.println("Enter Truck Number: ");
                    num = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Enter Truck Driver Name: ");
                    driver = sc.nextLine();

                    truck = new Truck();
                    truck.setId(id);
                    truck.setCompany(com);
                    truck.setModel(model);
                    truck.setTNumber(num);
                    truck.setDriver(driver);

                    truckServices.updateTruck(truck);
                    System.out.println("Truck updated successfully ✅");
                    break;

                case 3:
                    System.out.println("Enter Truck ID: ");
                    id = sc.nextInt();

                    Truck t = truckServices.getTruck(id);
                    if (t != null) {
                        System.out.println("ID: " + t.getId());
                        System.out.println("Company: " + t.getCompany());
                        System.out.println("Model: " + t.getModel());
                        System.out.println("Number: " + t.getTNumber());
                        System.out.println("Driver: " + t.getDriver());
                    } else {
                        System.out.println("Truck not found ❌");
                    }
                    break;

                case 4:
                    List<Truck> trucks = truckServices.getAllTruck();
                    if (trucks.isEmpty()) {
                        System.out.println("No trucks available ❌");
                    }
                    for (Truck s : trucks) {
                        System.out.println("\nID: " + s.getId());
                        System.out.println("Company: " + s.getCompany());
                        System.out.println("Model: " + s.getModel());
                        System.out.println("Number: " + s.getTNumber());
                        System.out.println("Driver: " + s.getDriver());
                    }
                    break;

                case 5:
                    System.out.println("Enter Truck ID: ");
                    id = sc.nextInt();
                    truckServices.deleteTruck(id);
                    System.out.println("Truck deleted successfully ✅");
                    break;

                case 6:
                    System.out.println("Exiting application... 👋");
                    sc.close();
                    System.exit(0);   // ✅ Exit loop completely

                default:
                    System.out.println("Invalid choice ❌ Try again");
            }
        }
    }
}
