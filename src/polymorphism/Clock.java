package polymorphism;

public class Clock {
	
	int hr,min,sec;
	
	public Clock()
	{
		System.out.println("your entered throught constructor....");
	}
	
	public void setClock(int hr)
	{
		this.hr=hr;
		
	}
	public void setClock(int min,int sec)
	{
		this.min=min;
		this.sec=sec;
		
		
	}
	public void setClock(int hr,int min,int sec)
	{
		this.hr=hr;
		this.min=min;
		this.sec=sec;
		
		
	}
	public void getClock()
	{
		System.out.format("%02d:%02d:%02d",hr,min,sec);
		System.out.println();
	}
}
