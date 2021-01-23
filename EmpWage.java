public class EmpWage {

	public static void main(String[] args) {
		// Constant
		int FULL_TIME = 1;
		int PART_TIME = 2;
		int EMP_RATE_PER_HR = 20;
		// Variale
		int emp_hr = 8;
		int empwage = 0;
		double empcheck = Math.floor(Math.random() * 10) % 3;
		// check Present or absent
		if (empcheck == FULL_TIME)
			emp_hr = 8;
		else if (empcheck == PART_TIME)
			emp_hr = 4;
		else
			emp_hr = 0;
		empwage = emp_hr * EMP_RATE_PER_HR;
		System.out.println("Employee Wage: "+empwage);
	}

}
