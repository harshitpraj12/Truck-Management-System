package com.harshit;

import java.util.List;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {

//        Truck truck1 = new Truck("TATA", "Bigger", 1234, "Suresh");
//        Truck truck2 = new Truck("Volvo", "Bigger", 1236, "rajesh");
//        Truck truck3 = new Truck("Ashok Leland", "Bigger", 1235, "mukesh");
//
//        truckServices.addTruck(truck1);
//        truckServices.addTruck(truck2);
//        truckServices.addTruck(truck3);

//        Truck truck = truckServices.getTruck(1);
//        System.out.println(truck);
//
//        truck.setDriver("Krishh");
//        truckServices.updateTruck(truck);
//        System.out.println("Updated truck: "+ truckServices.getTruck(4));
//
//        List<Truck> allTruck = truckServices.getAllTruck();
//        for (Truck s : allTruck) {
//            System.out.println(s);
//        }

//        for(int i=0; i<10; i++){
//            truckServices.deleteTruck(i);
//            System.out.println("Data deleted of id: "+i);
//        }
        TruckServices truckServices = new TruckServices();
        while (true) {

            System.out.println("Which operation do you want to perform??");
            System.out.println("1: Insertion");
            System.out.println("2: Update");
            System.out.println("3: Get Truck By ID");
            System.out.println("4: Get All Truck");
            System.out.println("5: Delete by ID");
            System.out.println("Enter your requirement");
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            sc.nextLine();
            switch (a) {
                case 1:
                    System.out.println("Here you can insert (❁´◡`❁)");
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
                    break;
                case 2:
                    System.out.println("Enter Truck id: ");
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
                    truck.setDriver(driver);
                    truck.setTNumber(num);
                    truck.setModel(model);
                    truck.setCompany(com);
                    truckServices.updateTruck(truck);
                    System.out.println("Updated truck: " + truckServices.getTruck(id));
                    break;
                case 3:
                    System.out.println("Enter Truck id: ");
                    id = sc.nextInt();
                    Truck truck3 = truckServices.getTruck(id);
                    System.out.println("Truck id: "+truck3.getId());
                    System.out.println("Truck company: "+truck3.getCompany());
                    System.out.println("Truck model: "+truck3.getModel());
                    System.out.println("Truck number: "+truck3.getTNumber());
                    System.out.println("Truck driver: "+truck3.getDriver());
                    break;
                case 4:
                    List<Truck> allTruck = truckServices.getAllTruck();
                    for (Truck s : allTruck) {
                        System.out.println("Truck id : "+s.getId());
                        System.out.println("Truck company: "+s.getCompany());
                        System.out.println("Truck model: "+s.getModel());
                        System.out.println("Truck number: "+s.getTNumber());
                        System.out.println("Truck driver: "+s.getDriver());
                    }
                    break;
                case 5:
                    System.out.println("Enter Truck id: ");
                    id = sc.nextInt();
                    truckServices.deleteTruck(id);
                    System.out.println("Data deleted of id: " + id);
                    break;
                default:
                    System.out.println("You entered wrong input!!!");
                    System.out.println("Try again... :)");
                    break;
            }
        }
    }
}
