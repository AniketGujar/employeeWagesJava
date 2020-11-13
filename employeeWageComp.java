class EmployeeWage{

        public void monthlyWages(String a,int dw,int hdw,int hw){
                int DailyWage=dw;
                int HalfDayWage=hdw;
                int HourlyWage=hw;
                int OverTimeWage=0;
                int OverTime;
                int TotalWage=0;
                String CompanyName=a;

                 System.out.println("Employee Wage Computatuion For "+ CompanyName + " Company");
                for(int i=1; i<=20;i++){

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
  public static void main(String[] args) {
    System.out.println("Welcome to Employee Wage Computation Program");
         EmployeeWage c1 = new EmployeeWage();
         c1.monthlyWages("Wipro",160,80,20);
         EmployeeWage c2 = new EmployeeWage();
         c2.monthlyWages("TCS",170,70,35);
         EmployeeWage c3 = new EmployeeWage();
         c3.monthlyWages("LNT",190,90,35);
  }
}
