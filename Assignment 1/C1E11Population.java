
public class C1E11Population {

	public static void main(String[] args) {
		int current_pop = 312032486;
		int seconds_in_year = 60*60*24*365; //1 yr = 365 days, 1 day = 24 hr, 1hr = 60 min, 1 min = 60 sec
		int birth_every_year = seconds_in_year/7;
		int death_every_year = seconds_in_year/13;
		int immig_every_year = seconds_in_year/45;
		int total_add = (birth_every_year + immig_every_year) - death_every_year;
		int pop_yr1 = current_pop + total_add;
		int pop_yr2 = pop_yr1 + total_add;
		int pop_yr3 = pop_yr2 + total_add;
		int pop_yr4 = pop_yr3 + total_add;
		int pop_yr5 = pop_yr4 + total_add;
		
		System.out.println("Current Population: "+current_pop);
		System.out.println("1st Year Population is: "+pop_yr1);
		System.out.println("2nd Year Population is: "+pop_yr2);
		System.out.println("3rd Year Population is: "+pop_yr3);
		System.out.println("4th Year Population is: "+pop_yr4);
		System.out.println("5th Year Population is: "+pop_yr5);
	}

}
