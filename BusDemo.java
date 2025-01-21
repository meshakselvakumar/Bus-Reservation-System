package BusResev;
import java.util.Scanner;
import java.util.ArrayList;

public class BusDemo 
{
	public static void main(String args[])
	{
		
	    ArrayList<Bus> Buses = new ArrayList<Bus>();
	    ArrayList<Booking> Bookings = new ArrayList<Booking>();
	    
	    Buses.add(new Bus(1,true,2));
	    Buses.add(new Bus(2,false,50));
	    Buses.add(new Bus(3,true,48));

	    
	    
		int userOpt = 1;
		Scanner scanner =new Scanner(System.in);
		
		for(Bus b:Buses) {
			b.displayBusInfo();			
		}
		
		while(userOpt==1) 
		{
		System.out.println("Enter 1 to Book and 2 to exit");
		userOpt = scanner.nextInt();
		if (userOpt==1) {
			Booking booking = new Booking();
            
			if(booking.isAvailable(Bookings,Buses))
			{
				Bookings.add(booking);
				System.out.println("Your booking is Confirmed");
			}
			else
				System.out.println("Sorry, Bus is Full... Try another Bus or Date !");
		                  } 
		}
			
	}
}





