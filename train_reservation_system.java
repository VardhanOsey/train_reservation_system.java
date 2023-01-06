package ticket;

import java.util.*;

import java.util.InputMismatchException;
import java.util.Scanner;


// abstract class
abstract class AvailableTrains{
    private String TrainName;
    private int TrainNumber;
    private int Time;
    private int Date;

    public AvailableTrains(String TrainName, int TrainNumber, int Time,int Date) {
        this.TrainName = TrainName;
        this.TrainNumber = TrainNumber;
        this.Time = Time;
        this.Date=Date;
    }
    public AvailableTrains() {
    }

    public String getTrainName() {
        return TrainName;
    }
    public int getTrainNumber() {
        return TrainNumber;
    }
    public int getTime() {
        return Time;
    }
    public int getDate() {
        return Date;
    }
}
class TrainDetails extends AvailableTrains{

    public TrainDetails(String TrainName, int TrainNumber, int Time, int Date) {
        super(TrainName, TrainNumber, Time, Date);
    }
    String source;
    String destination;
    String dateofjourney;

    public TrainDetails() {
        super();
    }

    public TrainDetails(String source, String destination, String dateofjourney) {
    }

    public String getdateofjourney() {
        return dateofjourney;
    }

    Scanner ava = new Scanner(System.in);
    public void AvailableTrains(){

        System.out.println("Enter the details according to show your train.");
        System.out.println("Source:");
        source = ava.next();
        System.out.println("Destination:");
        destination=ava.next();
        System.out.println("Enter the date of journey:");
        dateofjourney = ava.next();
        System.out.println("Train from "+source+" to "+destination);
        System.out.println("###########################################################################");
        System.out.println(" S.No    Train No         Train Name            Time      Date of journey");
        System.out.println(" 1        12345           A1 Express            12:45     "+dateofjourney);
        System.out.println(" 2        23415           B1 Express            01:19     "+dateofjourney);
        System.out.println(" 3        56782           C1 Express            11:56     "+dateofjourney);
        System.out.println(" 4        24532           D1 Express            14:23     "+dateofjourney);
        System.out.println(" 5        22345           E1 Express            19:45     "+dateofjourney);
        System.out.println(" 6        13415           F1 Express            07:19     "+dateofjourney);
        System.out.println(" 7        26782           G1 Express            12:56     "+dateofjourney);
        System.out.println(" 8        14532           H1 Express            19:23     "+dateofjourney);
        System.out.println(" 9        64332           F1 Express            10:23     "+dateofjourney);


    }
}
class login {
    public login() {
        System.out.println("                                        ***WELCOME TO THE INDIAN CENTRAL RAILWAY RESERVATION SYSTEM!!****");
        System.out.println("                                                            !!..HAVE A SAFE JOURNEY..!!");
        System.out.println("Enter your choice___");
        System.out.println("1. Login ");
        System.out.println("2. Sign Up");
        System.out.println("3. Forgot password");
        System.out.println("4. Exit");
        Scanner sc = new Scanner(System.in);
        int input1 = sc.nextInt();
        while ( input1 != 5) {
            switch (input1) {
                case 1:
                    System.out.println("Enter your Username:");
                    String username = sc.next();
                    System.out.println("Enter Your Password:");
                    String password = sc.next();
                    System.out.println("Login Successfully.........Welcome Back!!!");
                    input1= 5;
                    break;
                case 2:
                    System.out.println("Enter your email address: ");
                    String email = sc.next();
                    System.out.println("Enter your Phone Number: ");
                    String number = sc.next();
                    System.out.println("Enter the OTP sent to your Mobile:");
                    int OTP = sc.nextInt();
                    System.out.println("Successfully registered");
                    System.out.println("Create a Username:");
                    String username1 = sc.next();
                    System.out.println("Create a Password:");
                    String password1 = sc.next();
                    System.out.println("Thank you for Creating your account");
                    System.out.println("Enter your Username:");
                    String username2 = sc.next();
                    System.out.println("Enter your Password:");
                    String password2 = sc.next();
                    System.out.println("login Successfully");
                    input1= 5;
                    break;
                case 3:
                    System.out.println("We have sent an OTP to your mobile.");
                    System.out.println("Please enter your OTP.");
                    int OTP1= sc.nextInt();
                    System.out.println("Enter your New password");
                    String password3=sc.next();
                    System.out.println("Enter your Username:");
                    String username3=sc.next();
                    System.out.println("Enter your password:");
                    String password4=sc.next();
                    System.out.println("login Successfully......");
                    input1= 5;
                    break;
                case 4:
                    System.out.println("exited successfully.");
                    input1= 5;
                    break;
            }

        }
    }

    public void login() {
    }
}
class ChooseTrain extends TrainDetails {
    public ChooseTrain(String source, String destination, String dateofjourney){
        super(source,destination,dateofjourney);
    }
}
abstract class Reservation extends TrainDetails{
    private String destination;
    private String arrivalDate;
    private String departureDate;
    private int cost;
    private String status;

    protected Reservation() {
    }
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

    public String getStatus(){
        return this.status;
    }

    public void setStatus(String status){
        this.status = status;
    }

    public void makeReservation(){
    }

    public  void viewReservation(){
    }
    public  void cancelReservation(){
    }
    abstract void calculateCost();
}
abstract class Person extends Reservation{
    private String name;
    private String gender;
    private int age;

    public Person(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public Person() {

    }

    public String getName() {
        return name;
    }
    public String getGender() {
        return gender;
    }
    public int getAge() {
        return age;
    }
}
class Persondetails extends Person{
    public int topa;
    public String[] ma = new String[topa];
    public int[] na=new int[topa];
    public String[] la=new String[topa];
    public Persondetails(String name, String gender, int age) {
        super(name, gender, age);
    }


    public Persondetails() {

    }

    public void Persondetail(){
        System.out.println("Enter number of Passengers(maximum 6 passengers)");
        int i;
        Scanner pas = new Scanner(System.in);
        topa=pas.nextInt();
        ma = new String[topa];
        na=new int[topa];
        la=new String[topa];
        Booking b = new Booking();
        for (i=0;i<topa;i++)
        {
            System.out.println("Enter the name of passenger"+(i+1)+":");
            ma[i]=pas.next();
            try {
                System.out.println("Enter the age of passenger"+(i+1)+":");
                na[i]=pas.nextInt();
            }
            catch (InputMismatchException ex) {
                System.out.println(ex);
                System.out.println("Enter the valid Age");

            }
            System.out.println("Enter the gender of passenger"+(i+1)+":");
            la[i]=pas.next();
            b.makeReservation();
        }
    }


    @Override
    void calculateCost() {

    }
}
// class Reservation
class Booking extends Persondetails {

    private int distance;
    private static int[] berths = new int[13];

    public int getDistance() {
        return this.distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public void makeReservation() {
        System.out.println("Choose the type of reservation:");
        System.out.println("1.1 A/C");
        System.out.println("2.2 A/C ");
        System.out.println("3.3 A/C");
        System.out.println("4.Sleeper class.");
        System.out.println("5.Exit Choice of preference");
        card c;
        Scanner ch = new Scanner(System.in);
        int choose = ch.nextInt();
        switch (choose) {
            case 1:
                System.out.println("Your choice is 1 A/C");
                System.out.println("Available Seats: 22");
                System.out.println("To book Tickets press Enter");
                Scanner en = new Scanner(System.in);
                System.out.println("For payment, select the choices below....");
                calculateCost(3000);
                System.out.println("For credit card press 1 ");
                System.out.println("For debit card press 2 ");
                System.out.println("For upi press 3 ");
                int abc = ch.nextInt();
                switch(abc){
                    case 1:
                        c=new creditcard();
                        System.out.println("by creditcard pay incl* charges: "+c.chargepertransaction(getCost()));
                        break;
                    case 2:
                        c=new debitcard();
                        System.out.println("by debitcard pay incl* charges: "+c.chargepertransaction(getCost()));
                        break;
                    case 3:
                        c=new mobilebanking();
                        System.out.println("by upi incl* charges: "+c.chargepertransaction(getCost()));
                        break;
                }
                System.out.println("Enter your mobile Number:");
                double no = ch.nextDouble();
                System.out.println("Enter the OTP:");
                int OTP6 = ch.nextInt();
                while(OTP6<1000||OTP6>9999) {
                    System.out.println("Wrong OTP");
                    OTP6 = ch.nextInt();
                }
                System.out.println("Do the payment with the link sent to your Mobile number.");
                System.out.println("Enter your payment reference ID:");
                String ref = ch.next();
                int[] berths = new int[13];
                for (int i = 0; i < 12; i++) {
                    berths[i] = 0;
                }
                Scanner s = new Scanner(System.in);
                int choice = 1;


                System.out.print("Please select your type of berth:\n1.Upper Berth\n2.Lower Berth\n0.Exit.\n");
                choice = s.nextInt();

                int seatnumber = 0;


                if (choice == 1) {
                    seatnumber = bookUpper();
                    if (seatnumber == -1) {
                        seatnumber = bookLower();
                        if (seatnumber != -1) {
                            System.out.println("Sorry, there are no Upper Berths available. But we do have a Lower Berth.");
                            boardingPass(seatnumber);
                        }
                    } else {
                        System.out.println("Congratulations, we have a Upper Berth available!");
                        boardingPass(seatnumber);
                    }
                } else if (choice == 2) {
                    seatnumber = bookLower();
                    if (seatnumber == -1) {
                        seatnumber = bookUpper();
                        if (seatnumber != -1) {
                            System.out.println("Sorry, there are no Lower Berths available. But we do have a Upper Berth.");
                            boardingPass(seatnumber);
                        }
                    } else {

                        System.out.println("         Congratulations, we have a Lower berth available!");
                        boardingPass(seatnumber);
                    }
                } else {

                    System.out.println("Your choice is invalid. Please provide valid choice!");
                    choice = 0;
                }


                if (seatnumber == -1) {
                    System.out.println("Sorry, there are no Upper Berths or no Lower Berths available");
                    System.out.println();
                }




                break;
            case 2:
                System.out.println("Your choice is 2 A/C");
                System.out.println("Available Seats: 34");
                System.out.println("To book Tickets press Enter");
                Scanner aa = new Scanner(System.in);
                System.out.println("For payment, select the choices below....");
                calculateCost(2000);
                System.out.println("For credit card press 1 ");
                System.out.println("For debit card press 2 ");
                System.out.println("For upi press 3 ");
                int abcd = aa.nextInt();
                switch(abcd){
                    case 1:
                        c=new creditcard();
                        System.out.println("by creditcard pay incl* charges: "+c.chargepertransaction(getCost()));
                        break;
                    case 2:
                        c=new debitcard();
                        System.out.println("by debitcard pay incl* charges: "+c.chargepertransaction(getCost()));
                        break;
                    case 3:
                        c=new mobilebanking();
                        System.out.println("by upi incl* charges: "+c.chargepertransaction(getCost()));
                        break;
                }
                System.out.println("Enter your mobile Number:");
                double bb = aa.nextDouble();
                System.out.println("Enter the OTP:");
                int cc = aa.nextInt();
                while(cc<1000||cc>9999) {
                    System.out.println("Wrong OTP");
                    cc = aa.nextInt();
                }
                System.out.println("Do the payment with the link sent to your Mobile number.");
                System.out.println("Enter your payment reference ID:");
                String dd = aa.next();
                int[] berths1 = new int[13];
                for (int i = 0; i < 12; i++) {
                    berths1[i] = 0;
                }
                int choice1 = 1;


                System.out.print("Please select your type of berth:\n1.Upper Berth\n2.Lower Berth\n0.Exit.\n");
                choice1 = aa.nextInt();

                seatnumber = 0;


                if (choice1 == 1) {
                    seatnumber = bookUpper();
                    if (seatnumber == -1) {
                        seatnumber = bookLower();
                        if (seatnumber != -1) {
                            System.out.println("Sorry, there are no Upper Berths available. But we do have a Lower Berth.");
                            boardingPass(seatnumber);
                        }
                    } else {
                        System.out.println("Congratulations, we have a Upper Berth available!");
                        boardingPass(seatnumber);
                    }
                } else if (choice1 == 2) {
                    seatnumber = bookLower();
                    if (seatnumber == -1) {
                        seatnumber = bookUpper();
                        if (seatnumber != -1) {
                            System.out.println("Sorry, there are no Lower Berths available. But we do have a Upper Berth.");
                            boardingPass(seatnumber);
                        }
                    } else {

                        System.out.println("         Congratulations, we have a Lower berth available!");
                        boardingPass(seatnumber);
                    }
                } else {

                    System.out.println("Your choice is invalid. Please provide valid choice!");
                    choice1 = 0;
                }


                if (seatnumber == -1) {
                    System.out.println("Sorry, there are no Upper Berths or no Lower Berths available");
                    System.out.println();
                }



                break;
            case 3:
                System.out.println("Your choice is 3 A/C");
                System.out.println("Available Seats: 67");
                System.out.println("To book Tickets press Enter");
                Scanner ee = new Scanner(System.in);
                System.out.println("For payment, select the choices below....");
                calculateCost(1000);
                System.out.println("For credit card press 1 ");
                System.out.println("For debit card press 2 ");
                System.out.println("For upi press 3 ");
                int abcde = ee.nextInt();
                switch(abcde){
                    case 1:
                        c=new creditcard();
                        System.out.println("by creditcard pay incl* charges: "+c.chargepertransaction(getCost()));
                        break;
                    case 2:
                        c=new debitcard();
                        System.out.println("by debitcard pay incl* charges: "+c.chargepertransaction(getCost()));
                        break;
                    case 3:
                        c=new mobilebanking();
                        System.out.println("by upi incl* charges: "+c.chargepertransaction(getCost()));
                        break;
                }
                System.out.println("Enter your mobile Number:");
                double ff = ee.nextDouble();
                System.out.println("Enter the OTP:");
                int gg = ee.nextInt();
                while(gg<1000||gg>9999) {
                    System.out.println("Wrong OTP");
                    gg = ee.nextInt();
                }
                System.out.println("Do the payment with the link sent to your Mobile number.");
                System.out.println("Enter your payment reference ID:");
                String hh = ee.next();
                int[] berths2 = new int[13];
                for (int i = 0; i < 12; i++) {
                    berths2[i] = 0;
                }
                int choice2 = 1;


                System.out.print("Please select your type of berth:\n1.Upper Berth\n2.Lower Berth\n0.Exit.\n");
                choice2 = ee.nextInt();

                seatnumber = 0;


                if (choice2 == 1) {
                    seatnumber = bookUpper();
                    if (seatnumber == -1) {
                        seatnumber = bookLower();
                        if (seatnumber != -1) {
                            System.out.println("Sorry, there are no Upper Berths available. But we do have a Lower Berth.");
                            boardingPass(seatnumber);
                        }
                    } else {
                        System.out.println("Congratulations, we have a Upper Berth available!");
                        boardingPass(seatnumber);
                    }
                } else if (choice2 == 2) {
                    seatnumber = bookLower();
                    if (seatnumber == -1) {
                        seatnumber = bookUpper();
                        if (seatnumber != -1) {
                            System.out.println("Sorry, there are no Lower Berths available. But we do have a Upper Berth.");
                            boardingPass(seatnumber);
                        }
                    } else {

                        System.out.println("         Congratulations, we have a Lower berth available!");
                        boardingPass(seatnumber);
                    }
                } else {

                    System.out.println("Your choice is invalid. Please provide valid choice!");
                    choice2 = 0;
                }


                if (seatnumber == -1) {
                    System.out.println("Sorry, there are no Upper Berths or no Lower Berths available");
                    System.out.println();
                }



                break;
            case 4:
                System.out.println("Your choice is Sleeper");
                System.out.println("Available Seats: 178");
                System.out.println("To book Tickets press Enter");
                Scanner ii = new Scanner(System.in);
                System.out.println("For payment, select the choices below....");
                calculateCost(500);
                System.out.println("For credit card press 1 ");
                System.out.println("For debit card press 2 ");
                System.out.println("For upi press 3 ");
                int abdc = ii.nextInt();
                switch(abdc){
                    case 1:
                        c=new creditcard();
                        System.out.println("by creditcard pay incl* charges: "+c.chargepertransaction(getCost()));
                        break;
                    case 2:
                        c=new debitcard();
                        System.out.println("by debitcard pay incl* charges: "+c.chargepertransaction(getCost()));
                        break;
                    case 3:
                        c=new mobilebanking();
                        System.out.println("by upi incl* charges: "+c.chargepertransaction(getCost()));
                        break;
                }
                System.out.println("Enter your mobile Number:");
                double jj = ii.nextDouble();
                System.out.println("Enter the OTP:");
                int kk = ii.nextInt();
                while(kk<1000||kk>9999) {
                    System.out.println("Wrong OTP");
                    kk = ii.nextInt();
                }
                System.out.println("Do the payment with the link sent to your Mobile number.");
                System.out.println("Enter your payment reference ID:");
                String ll = ii.next();
                int[] berths3 = new int[13];
                for (int i = 0; i < 12; i++) {
                    berths3[i] = 0;
                }
                Scanner ac = new Scanner(System.in);
                int choice3 = 1;


                System.out.print("Please select your type of berth:\n1.Upper Berth\n2.Lower Berth\n0.Exit.\n");
                choice3 = ac.nextInt();

                seatnumber = 0;


                if (choice3 == 1) {
                    seatnumber = bookUpper();
                    if (seatnumber == -1) {
                        seatnumber = bookLower();
                        if (seatnumber != -1) {
                            System.out.println("Sorry, there are no Upper Berths available. But we do have a Lower Berth.");
                            boardingPass(seatnumber);
                        }
                    } else {
                        System.out.println("Congratulations, we have a Upper Berth available!");
                        boardingPass(seatnumber);
                    }
                } else if (choice3 == 2) {
                    seatnumber = bookLower();
                    if (seatnumber == -1) {
                        seatnumber = bookUpper();
                        if (seatnumber != -1) {
                            System.out.println("Sorry, there are no Lower Berths available. But we do have a Upper Berth.");
                            boardingPass(seatnumber);
                        }
                    } else {

                        System.out.println("         Congratulations, we have a Lower berth available!");
                        boardingPass(seatnumber);
                    }
                } else {

                    System.out.println("Your choice is invalid. Please provide valid choice!");
                    choice3 = 0;
                }


                if (seatnumber == -1) {
                    System.out.println("Sorry, there are no Upper Berths or no Lower Berths available");
                    System.out.println();
                }



                break;
            case 5:
                System.out.println("Thank you for using the Train Reservation System.");
                System.exit(0);
        }


    }
    public int berthnumber;
    public int random;
    public void boardingPass(int berthnumber) {
        java.util.Date date = new java.util.Date();
        System.out.println("Date:" + date);
        System.out.println("Boarding pass for berth number: " + berthnumber);
        System.out.println("Your Booking Successful!!!");
//        int max=897897327;
//        int min=234565124;
//        int range=max-min+1;
//        for(int i=0;i<1;i++) {
//        	random=(int)(Math.random()*range) + min;
//        	System.out.println("Your PNR number")
//        }
//        System.out.println("This ticket is non-refundable.");
//        System.out.println("Please be polite,keep your place clean . Have a safe journey.");
//        System.out.println("!!Have a great day!!!");
//        System.out.println();
    }




    private static int bookUpper () {
        for (int i = 0; i < 6; i++) {
            if (berths[i] == 0) {
                berths[i] = 1;
                return i + 1;
            }
        }
        return -1;
    }


    private static int bookLower () {
        for (int i = 6; i < 12; i++) {
            if (berths[i] == 0) {
                berths[i] = 1;
                return i + 1;
            }
        }
        return -1;
    }
    private  int nextInt() {
        return 0;
    }

    public  void viewReservation(){
    }

    public  void cancelReservation(){
    }

    // Method to calculate cost
    public void calculateCost(int d){
        int cost = d;
        this.setCost(cost);
    }

    @Override
    void calculateCost() {

    }
}
class card{
    float chargepertransaction(int ticketprice){
        return ticketprice;
    }
}
class creditcard extends card{
    float chargepertransaction(int ticketprice){

        return 1.1f*ticketprice;
    }
}
class debitcard extends card{
    float chargepertransaction(int ticketprice){
        return 1.1f*ticketprice;
    }
}
class mobilebanking extends card{
    float chargepertransaction(int ticketprice)
    {
        return 1.1f*ticketprice;
    }
}
//interface
interface displayTicket{
    abstract int abstractticket();
    default int displayTick() {
        return 0;
    }
    static void getdetails() {
    }

}
class viewReservation extends Booking {

    public void displayticket() {
        System.out.println("Enter your PNR number to display your ticket:");
        Scanner sec=new Scanner(System.in);
        double abc=sec.nextDouble();
        System.out.println("Your recently booked ticket.....");
        for(int i=0;i<topa;i++) {
            System.out.println("Passenger_details     Age     Gender   Berth-number");
            System.out.println(ma[i]+"      " +na[i]+ "         "+la[i]+"     " + berthnumber);

//           System.out.println("Passenger"+ (i+1) + " name:" + ma[i]);
//           System.out.println("Passenger"+ (i+1) + " age:" + na[i]);
//           System.out.println("Passenger"+ (i+1) + " Gender:" + la[i]);
            System.out.println("Date of journey:"+dateofjourney);
            System.out.println("Have a Safe Journey...");

        }
    }

    public void cancel() {

    }
}
class cancelticket extends viewReservation{
    public void cancel(){
        System.out.println("ENter your PNR number to cancel your ticket");
        Scanner ab=new Scanner(System.in);
        String anan=ab.next();
        System.out.println("Successfully cancelled your ticket.");
        System.out.println("Your money will be refunned in 7 Working days");
        System.out.println("Incase any issue please call our customer Care No:139");

    }
}
public class team5{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        login l= new login();
        l.login();
        System.out.println("Welcome to the Train Reservation System");
        System.out.println("Please select an option:");
        System.out.println("1. Available Trains");
        System.out.println("2. Make a Reservation");
        System.out.println("3. View Reservation");
        System.out.println("4. Cancel Reservation");
        System.out.println("5. Exit");
        System.out.println("Enter your choice:");
        int input = scanner.nextInt();
        Booking b = new Booking();
        TrainDetails t= new TrainDetails();
        Persondetails p= new Persondetails();
        viewReservation v= new viewReservation();
        //upcasting
        viewReservation u = (cancelticket)new cancelticket();
        while(input!=6){
            if(input==1) {
                t.AvailableTrains();
            }
            if(input==2){
                p.Persondetail();
                int random;
                int max=897897327;
                int min=234565124;
                int range=max-min+1;
                for(int i=0;i<1;i++) {
                    random=(int)(Math.random()*range) + min;
                    System.out.println("Your PNR number:"+random);
                }
//                 int tickid;
//            	 int max=897897327;
//                 int min=234565124;
//                 int range2=max-min+1;
//                 for(int i=0;i<1;i++) {
//                 	tickid=(int)(Math.random()*range2) + min;
//                 	System.out.println("Your Ticket id:"+tickid);
//                 }
                System.out.println("Please be polite,keep your place clean . Have a safe journey.");
                System.out.println("!!Have a great day!!!");
                System.out.println();

            }
            else if(input==3) {
                b.viewReservation();
                v.displayticket();
            }
            else if(input==4) {
                b.cancelReservation();
                u.cancel();
            }
            else if(input==5) {
                System.out.println("Thank you for using the Train Reservation System.");
                System.exit(0);
            }
            System.out.println("Please select an option:");
            System.out.println("1. Available Trains");
            System.out.println("2. Make a Reservation");
            System.out.println("3. View Reservation");
            System.out.println("4. Cancel Reservation");
            System.out.println("5. Exit");
            System.out.println("Enter your choice:");
            input = scanner.nextInt();
        }
    }
}
