import java.util.*;
import java.util.ArrayList;

public class BusDemo {
    public static void main(String[] args) throws NoSuchElementException {

        ArrayList<Bus> buses = new ArrayList<Bus>();   //Actually we need to use database for Bus, this approach is for framming the design and logic of the project
        ArrayList<Booking> bookings = new ArrayList<Booking>();

        buses.add(new Bus(1, true, 2));
        buses.add(new Bus(2, true, 3));
        buses.add(new Bus(3, false, 4));

        for(Bus b:buses){
            b.displayBusInfo(); 
        }
        
        int userOpt = 1;
        Scanner scanner = new Scanner(System.in);
        while(userOpt == 1){
            System.out.print("Enter 1 to Book and 2 to exit: ");
            userOpt = scanner.nextInt();
            if(userOpt == 1){
                Booking booking = new Booking();
                if(booking.isAvailable(bookings, buses)){
                    bookings.add(booking);
                    System.out.println("Your Booking is confirmed");
                }
                else{
                    System.out.println("Booking is not confirmed, try another bus with alternate date ");
                }
            }
        }
        scanner.close();
    }    
}
