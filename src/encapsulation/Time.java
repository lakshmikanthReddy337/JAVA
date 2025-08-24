package encapsulation;

public class Time {
	
	private int hr,min,sec;

	public int getHr() {
		return hr;
	}

	public void setHr(int hr) {
		this.hr = hr;
	}

	public int getMin() {
		return min;
	}

	public void setMin(int min) {
		this.min = min;
	}

	public int getSec() {
		return sec;
	}

	public void setSec(int sec) {
		this.sec = sec;
	}
	public void getTime()
	{
		System.out.println(hr+":"+min+":"+sec);
	}
}
