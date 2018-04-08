package es.unileon.prg1.date;

public class Date {
	private int day;
	private int month;
	private int year;
	
	// Constructor mal programado: Permite crear fechas no validas
	public Date(){
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	public Date(int day, int month, int year){
		if(this.day<=0){
			System.out.println("El día introducido no es correcto");
		}if(this.month<=0){
			System.out.println("El mes introducido no es correcto");
		}else if(this.month>12){
			System.out.println("El mes introducido no es correcto");
		}else{
			if(this.day>this.daysOfMonth(month)){
			System.out.println("El valor de día y mes introducidos no es correcto");
			}
		}
		if(this.year<0){
			System.out.println("El año introducido no es correcto");
		}
	}

	public int daysOfMonth(int month){
		int numeroDeDias=0;
		switch(this.month){
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12: numeroDeDias=31;
			break;
	
			case 4:
			case 6:
			case 9:
			case 11: numeroDeDias=30;
			break;

			case 2: numeroDeDias=28;
			break;
		}
		return numeroDeDias;
	}

	public int getDay(){
		return this.day;
	}
	
	public void setDay(int nuevoDay){
		day=nuevoDay;
	}	

	public int getMonth(){
		return this.month;
	}
	
	public void setMonth(int nuevoMonth){
		month=nuevoMonth;
	}
	
	public int getYear(){
		return this.year;
	}

	public void setYear(int nuevoYear){
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

	boolean isSameMonth(Date another){
		this.month=another.getMonth();
		return true;
	}

	boolean isSameYearIf(Date another){
		if (this.year == another.getYear()){
			return true;
		}
		return false;
	}

	boolean isSameYear(Date another){
		this.year=another.getYear();
		return true;
	}

	boolean isSameIf(Date another){
		if((this.day == another.getDay()) && (this.month==another.getMonth()) && (this.year == another.getYear())){
			return true;
		}
		return false;
	}

	boolean isSame(Date another){
		this.day=another.getDay();
		this.month=another.getMonth();
		this.year=another.getYear();
		return true;
	}

	public String getMonthName(){
		String mes=null;
		switch(this.month){
			case 1: mes= "Enero";
				System.out.println("El mes es enero");
			break;

			case 2: mes="Febrero";
				System.out.println("El mes es febrero");
			break;

			case 3: mes="Marzo";
				System.out.println("El mes es marzo");
			break;

			case 4: mes="Abril";
				System.out.println("El mes es abril");
			break;

			case 5: mes="Mayo";
				System.out.println("El mes es mayo");
			break;
		
			case 6: mes="Junio";
				System.out.println("El mes es junio");
			break;
		
			case 7: mes="Julio";
				System.out.println("El mes es julio");
			break;
		
			case 8: mes="Agosto";
				System.out.println("El mes es agosto");
			break;
		
			case 9: mes="Septiembre";
				System.out.println("El mes es septiembre");
			break;
		
			case 10: mes="Octubre";
				System.out.println("El mes es octubre");
			break;

			case 11: mes="Noviembre";
				System.out.println("El mes es noviembre");
			break;
	
			case 12: mes="Diciembre";
				System.out.println("El mes es diciembre");
			break;
		}
		return mes;
	}

	public boolean isDayRight(int day){
		return (this.day>0) && (day<=this.daysOfMonth(this.month));
	}

	public String getMonthsLeft(){
		StringBuffer monthsLeft = new StringBuffer();
			for(int i=this.month+1;i<=12;i++){
			monthsLeft.append(this.getMonthName()+"\n");
			}
		return monthsLeft.toString();	
	}

	public int date(){
		return this.day + this.month + this.year;
	}

	public String getSeasonMonths(){
		String estacion = null;
		switch(this.month){
			case 1:	
			case 2:
			case 3: estacion="Invierno";
			break;
	
			case 4:
			case 5:
			case 6: estacion="Primavera";
			break;
	
			case 7:
			case 8:
			case 9: estacion="Verano";
			break;

			case 10:
			case 11:
			case 12: estacion="Otoño";
			break;
		}
		return estacion;
	}

	public String getDaysLeftOfMonth(){
		StringBuffer diasRestantes = new StringBuffer();
		for(int i=this.day+1;isDayRight(i);i++){
			diasRestantes.append(this.daysOfMonth(month)+" ");
		}
		return diasRestantes.toString();
	}

	public String getMonthsSameDays(){
		switch(this.month){
		case 1:
		case 3:
		case 5: 
		case 7:
		case 8:
	 	case 10:
		case 12: System.out.println("Los meses con los mismos días son: enero, marzo, mayo, julio, agosto, octubre, diciembre.");
		break;
		
		case 4:
		case 6:
		case 9:
		case 11: System.out.println("Los meses con los mismos días son: abril, junio, septiembre, noviembre");
		break;
		}	
	} 

//Este método no sabía a lo que se refería, si a contar los dias pasados hasta el 1 de enero, o contar los días que quedaban para acabar el año.
	public String getDaysOfNewYear(){
		for(int i=this.day+1;i<=daysOfMonth(this.month);i++){
		
		}
		return ;
	}

	public int numRandomTriesEqualsDateWhile(){
		int intentos=0, dia, mes, año;
			mes=(int)(Math.random()*12)+1;
			dia=(int)(Math.random()*this.daysOfMonth(mes))+1;
			año=this.year;
			intentos++;
		while(this.isSame(new Date(dia,mes,año)));
		return intentos;
	}

	public int numRandomTriesEqualsDateDoWhile(){
		int intentos=0, dia, mes, año;
		do{
			mes=(int)(Math.random()*12)+1;
			dia=(int)(Math.random()*this.daysOfMonth(mes))+1;
			año=this.year;
			intentos++;
		}while(this.isSame(new Date(dia,mes,año)));
		return intentos;
	}

	public String dayOfWeek(int diaSemana){
		int numeroDia;
		numeroDia = (daysPast() +diaSemana)%7;
		return nameOfDay(numeroDia);
	}	

	public String nameOfDay(int day){
		String diaDeLaSemana=null;
		switch(this.day){
			case 1: diaDeLaSemana="Lunes";
			break;
	
			case 2: diaDeLaSemana="Martes";
			break;

			case 3: diaDeLaSemana="Miércoles";
			break;

			case 4: diaDeLaSemana="Jueves";
			break;

			case 5: diaDeLaSemana="Viernes";
			break;

			case 6: diaDeLaSemana="Sábado";
			break;

			case 7: diaDeLaSemana="Domingo";
			break;
		}
	}

	public int daysPast(){
		int diasPasados=0;
		Date aux=new Date(1,1,this.year);
		for(int i=1;i<this.month;i++){
			aux.setMonth(i);
			diasPasados += aux.daysOfMonth(month);
		}
		return diasPasados + this.day -1;	
	}
	
	public String toString(){
		return this.day + "/" + this.month + "/" + this.year;
	}

}
