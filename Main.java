package CarRentSystem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        RentLogic rent = new RentLogic();
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("*-*-*-*-*- Car Rent System -*-*-*-*-*");
                System.out.println(" 1) Add Car ");
                System.out.println(" 2) View All Car ");
                System.out.println(" 3) For Rent Car ");
                System.out.println(" 4) Exit ");
                System.out.println("------------------------------------");
                int choice = sc.nextInt();
                sc.nextLine();
                switch (choice) {
                    case 1:
                        System.out.println(" Enter Car ID No ");
                        int id = sc.nextInt(); sc.nextLine();
                        System.out.println(" Enter Car Model ");
                        String model = sc.nextLine();
                        System.out.println(" Enter Car Brand ");
                        String brand = sc.nextLine();
                        System.out.println(" Enter Price Per Day ");
                        double price = sc.nextDouble();
                        CarDetails obj = new CarDetails(id, model, brand, price);
                        rent.addCar(obj);
                        break;
                    case 2:
                        rent.viewCars();
                        break;
                    case 3:
                        System.out.println(" Enter Car ID No ");
                        int Find = sc.nextInt();
                        System.out.println(" Enter Days for Car Rent ");
                        int days = sc.nextInt(); sc.nextLine();
                        System.out.println (" Enter Confirm Payment (yes/no)");
                        String confirm = sc.nextLine();
                        rent.rentCar(Find, days,confirm);
                        break;
                    case 4:
                        System.out.println(" Thank for Using Car Rental System ......");
                        System.exit(0);
                    default:
                        System.out.println(" Please Choose Valid Option !!");
                }
            } catch (Exception e){
                System.out.println (" Put Valid Number !! ");
                sc.next();
            }
        }
    }
}
