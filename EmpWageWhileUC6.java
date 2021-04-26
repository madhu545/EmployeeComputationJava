 public class EmpWageWhileUC6 {

      public static final int IS_PART_TIME = 1;
      public static final int IS_FULL_TIME = 2;
      public static final int EMP_RATE_PER_HOUR = 50;
      public static final int NUM_OF_WORKING_DAYS = 20;
      public static final int MAX_HRS_IN_MONTH = 100;

      public static void main(String[] args) {

      int  totalEmpHrs =0, totalEmpWage = 0, totalWorkingDays = 0;
      while (totalEmpHrs <= MAX_HRS_IN_MONTH &&
             totalWorkingDays < NUM_OF_WORKING_DAYS) {
        int empHrs = 0;
        totalWorkingDays++;
        int empcheck = (int) Math.floor(Math.random() * 10) % 3;
      switch (empcheck) {

       case IS_FULL_TIME:
            empHrs = 8;
            break;
       case IS_PART_TIME:
            empHrs = 4;
            break;
       default :
            empHrs = 0;
      }
      totalEmpHrs += empHrs;
      int empwage = empHrs * EMP_RATE_PER_HOUR;
      totalEmpWage += empwage;
      System.out.println( "Emp Wage: " + empwage);

      }
      System.out.println("Total Emp Wage: " + totalEmpWage);
}
}
