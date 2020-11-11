class EmployeeWages{

        static final int DailyWage=160;
        static final int HalfDayWage=80;
        int TotalWage=0;
        static final int HourlyWage=20;
        int OverTimeWage;


        public void  monthlyWages(){
                int OverTime;
                for(int i=1; i<=20;i++){

                int Attendance = (int)Math.floor(Math.random()*10)%7;
                int OverTimeHours = (int)Math.floor(Math.random()*10)%4;

        switch (Attendance){
        case 1:
                System.out.println( "Day        " + i   + "         00          "    +  TotalWage);

        case 6:
                TotalWage=TotalWage+HalfDayWage;
                System.out.println( "Day        "+ i + "                "+ HalfDayWage + "              "+ TotalWage);

        case 5:
                switch (OverTimeHours){
                case 4: OverTimeWage=(4*20);
                TotalWage=TotalWage+OverTimeWage;
                System.out.println( "Day        " + i  +"               "+ OverTimeWage + "           "  +  TotalWage);
                break;
                case 1:
                OverTime=(3*20);
                TotalWage=TotalWage+OverTimeWage;
                System.out.println( "Day        " + i  +"               "+ OverTimeWage + "           "  +  TotalWage);
                break;
                case 2:
                OverTime=(2*20);
                TotalWage=TotalWage+OverTimeWage;
                System.out.println( "Day        " + i  +"               "+ OverTimeWage  + "           " +  TotalWage);
                break;
                case 3:
                OverTime=20;
                TotalWage=TotalWage+OverTimeWage;
                System.out.println( "Day        " + i  +"               "+OverTimeWage + "           "  +  TotalWage);
                break;
                }

        default:
                TotalWage=TotalWage+DailyWage;
                System.out.println( "Day        " + i  + "           "+ DailyWage  + "           "+  TotalWage);
              }
        }
        }
  public static void main(String[] args) {
    System.out.println("Welcome to Employee Wage Computation Program on Master Branch");
    EmployeeWages obj = new EmployeeWages();
    obj.monthlyWages();
  }
}
