public class program2 {
  public static void main(String[] args) {
    
    BankAccount MyAcc = new BankAccount();
    MyAcc.username="abhiji0022";
    MyAcc.password="osjefn"; // error  becau it is private
  }
}


 class BankAccount  {
  public String username;
  private String password;
  
}
