package es.unileon.prg1.date;

public class Date {
	private int day;
	private int month;
	private int year;
	
	// Constructor mal programado: Permite crear fechas no validas
	public Date(int day, int month, int year){
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public int getDay(){
		return this.day;
	}
	
	void setDay(int nuevoDay){
		day=nuevoDay;
	}	

	public int getMonth(){
		return this.month;
	}
	
	void setMonth(int nuevoMonth){
		month=nuevoMonth;
	}
	
	public int getYear(){
		return this.year;
	}

	void setYear(int nuevoYear){
		year=nuevoYear;
	}

	boolean isSameDayIf(Date another){
		if(this.day == another.getDay()){
			return true;
		}
		return false;
	}

	boolean isSameDay(Date another){
		this.day=another.getDay();
		return true;
	}

	boolean isSameMonthIf(Date another){
		if(this.month==another.getMonth()){
			return true;
		}
		return false;
	}

	boolean isSameYearIf(Date another){
		if (this.year == another.getYear() ){
			return true;
		}
		return false;
	}

	boolean isSame(Date another){
		if((this.day == another.getDay()) && (this.month==another.getMonth()) && (this.year == another.getYear())){
			return true;
		}
		return false;
	}

	
	public String toString(){
		return this.day + "/" + this.month + "/" + this.year;
	}

}
