package CarRentSystem;
import java.util.ArrayList;

public class RentLogic {
    ArrayList<CarDetails> carlist = new ArrayList<>();

    public boolean addCar(CarDetails c) {
        for (CarDetails e : carlist) {
            if (e.getId() == c.getId()){
                System.out.println (" AllReady Exists !!");
                return false;
            }
        }
        carlist.add(c);
        System.out.println(" Car Added Successfully ++ ");
        return true;
    }

    public void viewCars() {
        if (carlist.isEmpty()) {
            System.out.println(" No Car is Available !!! ");
        }
        for (CarDetails c : carlist) {
            System.out.println(" ID: " + c.getId() + " | Model: " + c.getModel() + " | Brand: " + c.getBrand() + " | Price per day: " + c.getPerDayPrice() + " | On Rented:  " + c.getRented());
        }
    }

    public boolean rentCar(int id,int days,String confirm) {
        for (CarDetails c : carlist) {
            if (c.getId() == id) {
                if (c.getRented()) {
                    System.out.println(" Car is already on rent ");
                    return false;
                } else{
                    c.setRented(true);
                    double totalPrice = c.getPerDayPrice() * days;
                    System.out.println (" Total Amount to pay : "+totalPrice +" for "+days+" days");
                    if ( confirm.equalsIgnoreCase("yes")){
                        System.out.println (" Payment Successfully ");
                        return(true);
                    } else {
                        System.out.println(" Payment Cancel !");
                        return(false);
                    }
                }
            }
        }
        System.out.println("**  Car Not Available  **");
        return false;
    }
}


