public class employeeWageComp {

	public static void main(String[] args) {
		int full_Time = 1;
		int part_Time = 20;
		int full_Day_Wage = 160;
		int totalEmpHrs=0;
		int totalWorkingDays=0;
		int empHrs=0;

while (totalEmpHrs <= MAX_HRS_IN_MONTH && totalWorkingDays < NUM_OF_WORKING_DAYS){

		double empCheck = Math.floor(Math.random()*10)%3;
		int partTimeCheck = (int)Math.floor(Math.random()*10)%4;
		totalWorkingDays++;
		if (empCheck == 0)
			totalEmpHrs=totalEmpHrs+8;
			System.out.println("Employee is Present, Daily Wage = " + full_Day_Wage);

                else if (empCheck == 1) 
                        System.out.println("Employee is Absent, Daily Wage = 0");

		else
			switch (partTimeCheck) {
			case 1:
			empHrs=1;
			System.out.println("Employee is Present Part Time, Daily Wage = " + part_Time);
                        case 2:
			empHrs=2;
 			System.out.println("Employee is Present Part Time, Daily Wage = " + part_Time*2);
                        case 3:
			empHrs=3;
                        System.out.println("Employee is Present Part Time, Daily Wage = " + part_Time*3);
                        case 0:
			empHrs=4;
                        System.out.println("Employee is Present Part Time, Daily Wage = " + part_Time*4);
			}
		}
	totalEmpHrs = totalEmpHrs + empHrs;
   }
}
