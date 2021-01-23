public class EmpWage {
	static final int PART_TIME = 1;
	static final int FULL_TIME = 2;
	static int EMP_RATE_PER_HR = 20;
	static int MAX_WORK_MONTH = 20;
	static int MAX_WORK_HR = 100;
	
	public static void main(String[] args) {
		// Variale
		int emp_hr = 8;
		int total_emp_hr = 0; 
		int total_emp_days = 0;
		int total_wage = 0;
		// check Present or absent
		while (total_emp_days < MAX_WORK_MONTH && total_emp_hr <= MAX_WORK_HR)
		{
			
			double empcheck = Math.floor(Math.random()*10)%3;
			total_emp_days++;
			switch ((int)empcheck)
			{
			case FULL_TIME: emp_hr = 8;
				break;
			case PART_TIME: emp_hr = 4;
				break;
			default: emp_hr = 0;
			}
			total_emp_hr += emp_hr;
			System.out.println("Total Employee Hours: "+total_emp_hr);
			System.out.println("Total Employee Days: "+total_emp_days);
			
		}
		total_wage = total_emp_hr * EMP_RATE_PER_HR;
		System.out.println("Total Employee Wage: "+total_wage);
	}

}
