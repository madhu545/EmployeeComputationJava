 public class EmpWageForUC5 {

      public static final int IS_PART_TIME = 1;
      public static final int IS_FULL_TIME = 2;
      public static final int EMP_RATE_PER_HOUR = 50;
      public static final int NUM_OF_WORKING_DAYS = 20;

      public static void main(String[] args) {

      int empHrs = 0, empwage = 0, totalEmpWage = 0;
      for (int day = 0; day < NUM_OF_WORKING_DAYS; day++) {

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
      empwage = empHrs * EMP_RATE_PER_HOUR;
      totalEmpWage += empwage;
      System.out.println( "Emp Wage: " + empwage);

      }
      System.out.println("Total Emp Wage: " + totalEmpWage);
}
}