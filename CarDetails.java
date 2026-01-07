package CarRentSystem;
public class CarDetails {
    private int id;
    private String model;
    private String brand;
    private boolean isRented;
    private double perDayPrice;
    public CarDetails (int id, String model, String brand,double perDayPrice){
        this.id = id;
        this.model = model;
        this.brand = brand;
        this.isRented = false;
        this.perDayPrice = perDayPrice;
    }
    public void setId (int id){
        this.id = id;
    }
    public void  setModel(String model){
        this.model = model;
    }
    public void setBrand (String brand){
        this.brand = brand;
    }
    public void setRented(boolean isRented){
        this.isRented = isRented;
    }
   public void SetPerDayPrice (double perDayPrice){
        this.perDayPrice = perDayPrice;
   }
   public int getId(){
        return id;
   }
   public String getModel(){
        return model;
   }
   public String getBrand(){
        return brand;
   }
   public boolean getRented(){
        return isRented;
   }
   public double getPerDayPrice (){
        return perDayPrice;
   }

}
