import java.util.Scanner;

// abstract class
abstract class Reservation{
    private String destination;
    private String arrivalDate;
    private String departureDate;
    private String availabletickets;
    private int cost;
    private String order;
    private String status;
    
    public String getDestination(){
        return this.destination;
    }
    
    public void setDestination(String destination){
        this.destination = destination;
    }
    
    public String getArrivalDate(){
        return this.arrivalDate;
    }
    
    public void setArrivalDate(String arrivalDate){
        this.arrivalDate = arrivalDate;
    }
    
    public String getDepartureDate(){
        return this.departureDate;
    }
    
    public void setDepartureDate(String departureDate){
        this.departureDate = departureDate;
    }
    
    public int getCost(){
        return this.cost;
    }
    
    public void setCost(int cost){
        this.cost = cost;
    }
    
    public String getOrder(){
        return this.order;
    }
    
    public void setOrder(String order){
        this.order = order;
    }
    
    public String getStatus(){
        return this.status;
    }
    
    public void setStatus(String status){
        this.status = status;
    }
    
    public static void makeReservation(){
        // code to make a reservation 
    }
    
    public static void viewReservation(){
        // code to view a reservation
    }
    
    public static void cancelReservation(){
        // code to cancel a reservation
    }
    
    abstract void calculateCost();
}

// class Reservation
class Booking extends Reservation {
 
    private int distance;
 
    public int getDistance(){
        return this.distance;
    }
 
    public void setDistance(int distance){
        this.distance = distance;
    }
 
    public static void makeReservation(){
        // code to make a Normal Reservation
    	System.out.println("Choose the type of reservation:")
    	System.out.println("1.1 A/C");
    	System.out.println("2.2 A/C ");
    	System.out.println("3.3 A/C");
    	System.out.println("4.A/C chaircar");
    	System.out.println("5.Sleeper class.");
    	System.out.println("6.Exit Choice of preference");
    	Scanner ch = new Scanner(System.in);
    	int choice = nextInt();
    	switch(choice){
        case 1: 
            System.out.println("Your choice is 1 A/C");
            System.out.println("Availale Seats: 67");
            System.out.println("To book Tickets press Enter");
            Scanner en = new Scanner(System.in);
            System.out.println("For payment....");
            System.out.println("Enter your mobile Number:");
            int no = nextInt();
            System.out.println("Enter the OTP:");
            int OTP =nextInt();
            System.out.println("Enter your payment reference ID:");
            int ref =nextInt();
            break;
        case 2:
            System.out.println("Your choice is 1 A/C");
            System.out.println("Availale Seats: 67");
            System.out.println("To book Tickets press Enter");
            Scanner en = new Scanner(System.in);
            System.out.println("For payment....");
            System.out.println("Enter your mobile Number:");
            int no = nextInt();
            System.out.println("Enter the OTP:");
            int OTP =nextInt();
            System.out.println("Enter your payment reference ID:");
            int ref =nextInt();
            break;
        case 3:
        	System.out.println("Your choice is 1 A/C");
            System.out.println("Availale Seats: 67");
            System.out.println("To book Tickets press Enter");
            Scanner en = new Scanner(System.in);
            System.out.println("For payment....");
            System.out.println("Enter your mobile Number:");
            int no = nextInt();
            System.out.println("Enter the OTP:");
            int OTP =nextInt();
            System.out.println("Enter your payment reference ID:");
            int ref =nextInt();
            break;
        case 4:
        	System.out.println("Your choice is 1 A/C");
            System.out.println("Availale Seats: 67");
            System.out.println("To book Tickets press Enter");
            Scanner en = new Scanner(System.in);
            System.out.println("For payment....");
            System.out.println("Enter your mobile Number:");
            int no = nextInt();
            System.out.println("Enter the OTP:");
            int OTP =nextInt();
            System.out.println("Enter your payment reference ID:");
            int ref =nextInt();
            break;
         case 4:
        	System.out.println("Your choice is 1 A/C");
            System.out.println("Availale Seats: 67");
            System.out.println("To book Tickets press Enter");
            Scanner en = new Scanner(System.in);
            System.out.println("For payment....");
            System.out.println("Enter your mobile Number:");
            int no = nextInt();
            System.out.println("Enter the OTP:");
            int OTP =nextInt();
            System.out.println("Enter your payment reference ID:");
            int ref =nextInt();
            break;   
        default:
            System.out.println("Invalid input. Please try again.");
    }
    }
 
    private static int nextInt() {
		// TODO Auto-generated method stub
		return 0;
	}

	public static void viewReservation(){
        // code to view a Normal Reservation
    }
 
    public static void cancelReservation(){
        // code to cancel a Normal Reservation
    }
 
    // Method to calculate cost 
    public void calculateCost(){
        int cost = this.distance * 10;
        this.setCost(cost);
    }
}

// class Reservation
class FoodReservation extends Reservation {
 
    private String foodType;
    private int quantity;
 
    public String getFoodType(){
        return this.foodType;
    }
 
    public void setFoodType(String foodType){
        this.foodType = foodType;
    }
 
    public int getQuantity(){
        return this.quantity;
    }
 
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }
 
    public static void makeReservation(){
        // code to make a Food Reservation 
    }
 
    public static void viewReservation(){
        // code to view a Food Reservation
    }
 
    public static void cancelReservation(){
        // code to cancel a Food Reservation
    }
 
    // Method to calculate cost 
    public void calculateCost(){
        int cost = this.quantity * 5;
        this.setCost(cost);
    }
}

public class TrainReservationSystem{
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = "";
        while(true){
            System.out.println("Welcome to the Train Reservation System");
            System.out.println("Please select an option:");
            System.out.println("1. Make a Reservation");
            System.out.println("2. View Reservation");
            System.out.println("3. Cancel Reservation");
            System.out.println("4. Exit");
            input = scanner.nextLine();
            switch(input){
                case "1":
                    Reservation.makeReservation();
                    break;
                case "2":
                    Reservation.viewReservation();
                    break;
                case "3":
                    Reservation.cancelReservation();
                    break;
                case "4":
                    System.out.println("Thank you for using the Train Reservation System.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid input. Please try again.");
            }
        }
    }
}
