public class FooCorporation {
  double basePay;
  double hoursWorked;

  public FooCorporation(double pay, double hours){
    basePay = pay;
    hoursWorked = hours;
  }

  public String CalculatePay(){
    if (basePay <= 8.0 && hoursWorked < 60){
      double extraHours = hoursWorked % 40;
      double payment = basePay * (hoursWorked - extraHours) + (basePay * 1.5 *extraHours);
      String message = "The pay : " + payment;
      return message;
    }else{
      String message = "Error";
      return message;
    }
  }

  public static void main(String[] args){
    FooCorporation payDay = new FooCorporation(9.0,19.0);
    String finalmessage = payDay.CalculatePay();
    System.out.println(finalmessage);
  }
}