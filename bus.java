package BusResev;
public class Bus 
{
	private int BusNo;
	private boolean Ac;
	private int Capacity;						// get method & set method
	Bus(int no,boolean Ac ,int cap)
	{
		this.BusNo=no;
		this.Ac=Ac;
		this.Capacity=cap;
	}
	public int getBusNo(){					//accesser method
		 return BusNo;
	 }
	public boolean getAC(){					//accesser method
		 return Ac;
	 }
	public int getCapacity(){				//accesser method
		 return Capacity;
	 }
	public void setBusNo(int no) {				   //mutator
		 BusNo = no;
		}	
	public void setAc(boolean val) {				//mutator
		 Ac = val;
		}
	public void setCapacity(int cap) {			//mutator
	 Capacity = cap;
	}
	public void displayBusInfo() {
		System.out.println("Bus No:" + BusNo + " AC: " + Ac + " Capacity: " + Capacity);
	}
}


