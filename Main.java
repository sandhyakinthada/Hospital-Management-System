package com.hospital;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
        HospitalManagementSystem hospitalSystem = new HospitalManagementSystem();

        while (true) {
            System.out.println("HOSPITAL MANAGEMENT SYSTEM");
            System.out.println("1. Add Patient");
            System.out.println("2. View Patients");
            System.out.println("3. View Doctors");
            System.out.println("4. Book Appointment");
            System.out.println("5. Feedback Form");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                  System  .out.print("Enter patient name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter patient age: ");
                    int age = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter patient gender: ");
                    String gender = scanner.nextLine();
                    System.out.print("Enter patient phone number: ");
                    String phoneNo = scanner.nextLine();
                    hospitalSystem.addPatient(new Patient(hospitalSystem.patients.size() + 1, name, age, gender, phoneNo));
                    break;
                case 2:
                    System.out.println("Patients:");
                  
                    
                    hospitalSystem.viewPatients();
                    break;
                case 3:
                	System.out.println("Enter doctor name:");
                	String Name = scanner.nextLine();
                	System.out.println("enter doctor specialization:");
                	String Specialization = scanner.nextLine();
                	break;
               
                case 4:
                	System.out.println("Appointment:");
                    System.out.println("Enter date:");
                    String date = scanner.nextLine();
                    System.out.println("Enter time:");
                    String time = scanner.nextLine();
                    break;
                case 5:
                    System.out.println("FeedbackForm:");
                  
                    System.out.println("Great Service");
                    break;
                case 6:
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
		// TODO Auto-generated method stub

	}


