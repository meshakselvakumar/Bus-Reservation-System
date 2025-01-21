package BusResev;
import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
public class Booking 
{
	String PassengerName;
	int BusNo;
	Date Date;
	Booking(){
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the passenger Name : ");
		PassengerName = scanner.nextLine();
		
		System.out.println(" Enter the bus no : ");
		BusNo = scanner.nextInt();
		
		System.out.println(" Enter the dd-mm-yyyy : ");
		String dateInput = scanner.next();       	// string to date convention
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		try {
			Date = dateFormat.parse(dateInput);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}      
	}
	}
	
	public boolean isAvailable(ArrayList<Booking> bookings, ArrayList<Bus> Buses) {
		int Capacity = 0;
		for(Bus bus:Buses) {
			if(bus.getBusNo() == BusNo)
				Capacity = bus.getCapacity();
		}
		
		int booked = 0;
		for(Booking b:bookings) {
			if(b.BusNo == BusNo && b.Date.equals(Date)) {
				booked++;
			}
		}
		
		return booked<Capacity?true:false;


}
	}
