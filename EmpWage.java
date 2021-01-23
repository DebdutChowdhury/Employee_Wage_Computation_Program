public class EmpWage {

	public static void main(String[] args) {
		// Constant
		int FULL_TIME = 1;
		int EMP_RATE_PER_HR = 20;
		// Variale
		int emp_hr = 8;
		int empwage = 0;
		double empcheck = Math.floor(Math.random() * 10) % 2;
		// check Present or absent
		if (empcheck == FULL_TIME)
			emp_hr = 8;
		else
			emp_hr = 0;
		empwage = emp_hr * EMP_RATE_PER_HR;
		System.out.println("Employee Wage: "+empwage);
	}

}
