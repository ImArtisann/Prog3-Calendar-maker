//
//Class

public class ClassDay {
	private int month;
	private int day;
	private int year;
	private int meetingsPerWeek;
	private char dayOfTheWeek;

	//Get Methods
	public int getMonth () {
		return month;
	}
	public int getDay () {
		return day;
	}
	public int getYear () {
		return year;
	}
	public int getMeetings () {
		return meetingsPerWeek;
	}

	public ClassDay(int month, int day, int year, char DayOfWeek, int perWeek){
		this.month = month;
		this.day = day;
		this.year = year;
		dayOfTheWeek = DayOfWeek;
		meetingsPerWeek = perWeek;
	}

	public ClassDay nextDay(){
		if (meetingsPerWeek == 2){
			if (dayOfTheWeek == 'T'){
				day = day + 2;
				dayOfTheWeek = 'R';
			}
			else{
				day = day + 4;
				dayOfTheWeek = 'T';
			}
		}
		else if (meetingsPerWeek == 3){
			if (dayOfTheWeek == 'M'){
				day = day + 2;
				dayOfTheWeek = 'W';
			}
			else if (dayOfTheWeek == 'W'){
				day = day + 2;
				dayOfTheWeek = 'F';
			}
			else {
				day = day + 3;
				dayOfTheWeek = 'M';
			}
		}
		else if ( meetingsPerWeek == 4){
			if (dayOfTheWeek == 'R'){
				day = day + 4;
				dayOfTheWeek = 'M';
			}
			else if (dayOfTheWeek == 'M'){
				day++;
				dayOfTheWeek = 'T';
			}
			else if (dayOfTheWeek == 'T'){
				day++;
				dayOfTheWeek = 'W';
			}
			else {
				day++;
				dayOfTheWeek = 'R';
			}
		}
		else if (meetingsPerWeek == 5){
			if (dayOfTheWeek == 'F'){
				day = day + 3;
				dayOfTheWeek = 'M';
			}
			else if (dayOfTheWeek == 'M'){
				day++;
				dayOfTheWeek = 'T';
			}
			else if (dayOfTheWeek == 'T'){
				day++;
				dayOfTheWeek = 'W';
			}
			else if (dayOfTheWeek == 'W'){
				day++;
				dayOfTheWeek = 'R';
			}
			else{
				day++;
				dayOfTheWeek = 'F';
			}
		}
		return new ClassDay(month, day, year, dayOfTheWeek, meetingsPerWeek);
	}
	public String topBar(int meetings){
		String topBar;
		if (meetings == 2){
			topBar = "wk\t\t T\t\t\t R";
		}
		else if (meetings == 3){
			topBar = "wk\t\t M\t\t\t W\t\t\t F";
		}
		else if (meetings == 4){
			topBar = "wk\t\t M\t\t\t T\t\t\t W\t\t\t R";
		}
		else{
			topBar = "wk\t\t M\t\t\t T\t\t\t W\t\t\t R\t\t\t F";
		}
		return topBar;		
	}
    public boolean isLeapYear (int year) {
        if  ((year % 4 == 0) && (year % 100 != 0)){
        	return true;
        } 
        else if  (year % 400 == 0){ 
        	return true;
        }
        else{
        	return false;
        }
    }
    private int findMaxDays(int month, int year){
    	int maxDays;
    	if (month == 1 || month == 8 || month == 3 || month == 10){
    		maxDays = 31;
    	}
    	else if (month == 2 && isLeapYear(year)){
    		maxDays = 29;
    	}
    	else if (month == 2){
    		maxDays = 28;
    	}
    	else {
    		maxDays = 30;
    	}
    	return maxDays;
    }
    public String toString(){ 
      topBar(meetingsPerWeek);
    	int maxDays = findMaxDays(month, year);
    	if (day >= maxDays){
    		day = 1;
    		month++;
    	}
    	String dateString = String.format ( "\t\t%2d/%02d", month, day);
    	nextDay();
    	return dateString;
    }
}//
//Class

public class ClassDay {
	private int month;
	private int day;
	private int year;
	private int meetingsPerWeek;
	private char dayOfTheWeek;

	//Get Methods
	public int getMonth () {
		return month;
	}
	public int getDay () {
		return day;
	}
	public int getYear () {
		return year;
	}
	public int getMeetings () {
		return meetingsPerWeek;
	}

	public ClassDay(int month, int day, int year, char DayOfWeek, int perWeek){
		this.month = month;
		this.day = day;
		this.year = year;
		dayOfTheWeek = DayOfWeek;
		meetingsPerWeek = perWeek;
	}

	public ClassDay nextDay(){
		if (meetingsPerWeek == 2){
			if (dayOfTheWeek == 'T'){
				day = day + 2;
				dayOfTheWeek = 'R';
			}
			else{
				day = day + 4;
				dayOfTheWeek = 'T';
			}
		}
		else if (meetingsPerWeek == 3){
			if (dayOfTheWeek == 'M'){
				day = day + 2;
				dayOfTheWeek = 'W';
			}
			else if (dayOfTheWeek == 'W'){
				day = day + 2;
				dayOfTheWeek = 'F';
			}
			else {
				day = day + 3;
				dayOfTheWeek = 'M';
			}
		}
		else if ( meetingsPerWeek == 4){
			if (dayOfTheWeek == 'R'){
				day = day + 4;
				dayOfTheWeek = 'M';
			}
			else if (dayOfTheWeek == 'M'){
				day++;
				dayOfTheWeek = 'T';
			}
			else if (dayOfTheWeek == 'T'){
				day++;
				dayOfTheWeek = 'W';
			}
			else {
				day++;
				dayOfTheWeek = 'R';
			}
		}
		else if (meetingsPerWeek == 5){
			if (dayOfTheWeek == 'F'){
				day = day + 3;
				dayOfTheWeek = 'M';
			}
			else if (dayOfTheWeek == 'M'){
				day++;
				dayOfTheWeek = 'T';
			}
			else if (dayOfTheWeek == 'T'){
				day++;
				dayOfTheWeek = 'W';
			}
			else if (dayOfTheWeek == 'W'){
				day++;
				dayOfTheWeek = 'R';
			}
			else{
				day++;
				dayOfTheWeek = 'F';
			}
		}
		return new ClassDay(month, day, year, dayOfTheWeek, meetingsPerWeek);
	}
	public String topBar(int meetings){
		String topBar;
		if (meetings == 2){
			topBar = "wk\t\t T\t\t\t R";
		}
		else if (meetings == 3){
			topBar = "wk\t\t M\t\t\t W\t\t\t F";
		}
		else if (meetings == 4){
			topBar = "wk\t\t M\t\t\t T\t\t\t W\t\t\t R";
		}
		else{
			topBar = "wk\t\t M\t\t\t T\t\t\t W\t\t\t R\t\t\t F";
		}
		return topBar;		
	}
    public boolean isLeapYear (int year) {
        if  ((year % 4 == 0) && (year % 100 != 0)){
        	return true;
        } 
        else if  (year % 400 == 0){ 
        	return true;
        }
        else{
        	return false;
        }
    }
    private int findMaxDays(int month, int year){
    	int maxDays;
    	if (month == 1 || month == 8 || month == 3 || month == 10){
    		maxDays = 31;
    	}
    	else if (month == 2 && isLeapYear(year)){
    		maxDays = 29;
    	}
    	else if (month == 2){
    		maxDays = 28;
    	}
    	else {
    		maxDays = 30;
    	}
    	return maxDays;
    }
    public String toString(){ 
      topBar(meetingsPerWeek);
    	int maxDays = findMaxDays(month, year);
    	if (day >= maxDays){
    		day = 1;
    		month++;
    	}
    	String dateString = String.format ( "\t\t%2d/%02d", month, day);
    	nextDay();
    	return dateString;
    }
}
