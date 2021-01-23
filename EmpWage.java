public class EmpWage {

	public static void main(String[] args) {
		// Constant
		int FULL_TIME = 1;
		double empcheck = Math.floor(Math.random() * 10) % 2;
		// check Present or absent
		if (empcheck == FULL_TIME)
			System.out.println("Employee is present");
		else
			System.out.println("Emploee is absent");
	}

}
