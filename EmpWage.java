public class EmpWage {
	static final int PART_TIME = 1;
	static final int FULL_TIME = 2;
	static int EMP_RATE_PER_HR = 20;
	static int WORK_MONTH = 20;
	
	public static void main(String[] args) {
		// Variale
		int emp_hr = 8;
		int empwage = 0;
		int total_month = 0; 
		double empcheck = Math.floor(Math.random() * 10) % 3;
		// check Present or absent
		switch((int)empcheck)
		{
		case FULL_TIME: emp_hr = 8;
			break;
		case PART_TIME: emp_hr = 4;
			break;
		default: emp_hr = 0;
		}
		empwage = emp_hr * EMP_RATE_PER_HR;
		total_month = empwage * WORK_MONTH;
		System.out.println("Employee Wage per day: "+empwage);
		System.out.println("Employee wage per month: "+total_month);
	}
}
