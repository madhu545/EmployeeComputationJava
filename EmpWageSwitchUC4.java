 public class EmpWageSwitchUC4 {

      public static final int IS_PART_TIME = 1;
      public static final int IS_FULL_TIME = 2;
      public static final int EMP_RATE_PER_HOUR =20;

      public static void main(String[] args) {

      int empHrs = 0;
      int empwage = 0;

      double empcheck = Math.floor(Math.random() * 10) % 3;
      switch ((int)empcheck) {

       case IS_FULL_TIME:
            empHrs = 16;
            break;
       case IS_PART_TIME:
            empHrs = 8;
            break;
       default :
            empHrs = 0;
      }
      empwage = empHrs * EMP_RATE_PER_HOUR;
      System.out.println( "Emp Wage: " + empwage);

      }
}

