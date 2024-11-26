//  get :to return the value
//  set :to modify the value

// this : this keyword is used to refer to current object 
// Encapsulation is defined as the wrapping up of data & methods under a single unit. It also implements data hiding

public class program3 {
  public static void main(String[] args) {
    pen p1 = new pen();
    p1.setColor("red");
    p1.setTip(5);
    System.out.println(p1.getTip());
    System.out.println(p1.getColor());
  }
}

class pen {
  private String color;
  private int tip;

  String getColor() {
    return this.color;
  }

  int getTip() {
    return this.tip;
  }

  void setColor(String newColor) {
    this.color = newColor;
  }

  void setTip(int tip) {
    this.tip = tip;
  }
}
