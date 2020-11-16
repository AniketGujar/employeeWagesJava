import java.util.Scanner;

class EmployeeWage{
	public static void main(String[] args) {
    	System.out.println("Welcome to Employee Wage Computation Program");
        EmployeeWage b =new EmployeeWage();
        b.addCompany("LNT",30,2,10);
        b.addCompany("Wipro",20,4,20);
        b.compEmpWage();
        }

	int numOfCompany;
        CompanyEmpWage[] Arr;
        CompanyEmpWage Arr= new CompanyEmpWage[5];

       static void addCompany(String company,int empRatePerHour,int numOfWorkingDays, int maxHoursPerMonth) {
                Arr[numOfCompany]=new CompanyEmpWage(company,empRatePerHour,numOfWorkingDays,maxHoursPerMonth);
                numOfCompany++;
        }

        public void compEmpWage(){
                for (int i=0;i< numOfCompany; i++) {
                        Arr[i].setTotalEmpWage(this.compEmpWage(Arr[i]));
                        System.out.println(Arr[i]);
                }
        }

        public void monthlyWages(String a,int dw,int hdw,int hw){
                int DailyWage=dw;
                int HalfDayWage=hdw;
                int HourlyWage=hw;
                int OverTimeWage=0;
                int OverTime;
                int TotalWage=0;


                String CompanyName=a;
		int numOfCompany=0;
                System.out.println("Employee Wage Computatuion For "+ CompanyName + " Company");


	for(int j=1;j<=20;j++){

                int Attendance = (int)Math.floor(Math.random()*10)%7;
                int OverTimeHours = (int)Math.floor(Math.random()*10)%4;

        switch (Attendance){
        case 1:
                System.out.println( "Day " + i   + "\t\t00\t\t"    +  TotalWage);
                break;
        case 6:
                TotalWage+=HalfDayWage;
                System.out.println( "Day "+ i + "\t\t"+ HalfDayWage + "\t\t"+ TotalWage);
                break;
        case 5:
                switch (OverTimeHours){
                case 4: OverTimeWage=(4*20);
                TotalWage+=OverTimeWage;
                System.out.println( "Day " + i  +"\t\t"+ OverTimeWage + "\t\t"  +  TotalWage);
                break;
                case 1:
                OverTime=(3*20);
                TotalWage+=OverTimeWage;
                System.out.println( "Day " + i  +"\t\t"+ OverTimeWage + "\t\t"  +  TotalWage);
                break;
                case 2:
                OverTime=(2*20);
                TotalWage+=OverTimeWage;
                System.out.println( "Day " + i  +"\t\t"+ OverTimeWage  + "\t\t" +  TotalWage);
                break;
                case 3:
                OverTime=20;
                TotalWage+=OverTimeWage;
                System.out.println( "Day " + i  +"\t\t"+OverTimeWage + "\t\t"  +  TotalWage);
                break;
                }
                break;
        default:
                TotalWage=TotalWage+DailyWage;
                System.out.println( "Day " + i  + "\t\t"+ DailyWage  + "\t\t"+  TotalWage);
                break;
                }
        }
                }
        }

	}
}
}
}
