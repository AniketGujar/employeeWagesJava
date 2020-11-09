public class employeeWageComp {

	public static void main(String[] args) {
		int full_Time = 1;
		int full_Day_Wage = 160;
		double empCheck = Math.floor(Math.random()*10)%2;
		if (empCheck == full_Time)
			System.out.println("Employee is Present, Daily Wage = " + full_Day_Wage);
		else
			System.out.println("Employee is Absent, Daily Wage = 0");
	}
}
