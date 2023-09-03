import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Booking {
    String passengerName;
    int busNo;
    Date date; //Date is the inbuilt class in the util package so the we're creating a object for it

    Booking(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the passenger name: ");
        passengerName = scanner.next();

        System.out.println("Enter Bus No: ");
        busNo = scanner.nextInt();

        System.out.println("Enter Date (dd-mm-yyyy): ");
        String dateInput = scanner.next();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

        try{
            date = dateFormat.parse(dateInput);
        } 
        catch(ParseException e){
            System.out.println("Invalid Date");
        }

        scanner.close();
    }

    public boolean isAvailable(ArrayList<Booking> bookings, ArrayList<Bus> buses) {

    int capacity = 0;
    for(Bus bus:buses){
        if(bus.getbusNo() == busNo){
            capacity = bus.getcapacity();
        }
    }
    int booked = 0;
    for(Booking b:bookings){
        if(b.busNo == busNo && b.date.equals(date)){
            booked++;
        }
    }
    return booked<capacity?true:false;
    }
}
