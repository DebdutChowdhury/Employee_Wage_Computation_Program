class EmpDetail{
	final int PART_TIME = 1;
	final int FULL_TIME = 2;
	int EMP_RATE_PER_HR = 20;
	int MAX_WORK_MONTH = 20;
	int MAX_WORK_HR = 100;
	
	public void calculate() {
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
			case FULL_TIME: emp_hr = 8; // case statement for full time employe
				break;
			case PART_TIME: emp_hr = 4; // case statement for part time employe
				break;
			default: emp_hr = 0;
			}
			total_emp_hr += emp_hr; 
			System.out.println("Total Employee Hours: "+total_emp_hr);
			System.out.println("Total Employee Days: "+total_emp_days);
			
		}
		total_wage = total_emp_hr * EMP_RATE_PER_HR; // calculate total employe wage
		System.out.println("Total Employee Wage: "+total_wage);
	}
}


public class EmpWage {
	
	
	public static void main(String[] args) {
		
		EmpDetail ed = new EmpDetail(); 
		ed.calculate();
	}
	
}








