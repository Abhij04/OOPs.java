/**
 * pro1
 */

// objects ===> entities in the real world
// class ====> group of these entities

public class pro1 {

  public static void main(String[] args) {
    pen p1 = new pen(); // created pen object called p1
    p1.setColor("red");
    System.out.println(p1.color);

    p1.setTip(6);
    System.out.println(p1.tip);
  }
}

class pen {
  String color;
  int tip;

  void setColor(String newColor) {
    color = newColor;
  }

  void setTip(int newTip) {
    tip = newTip;
  }
}

class student {
  String name;
  int age;
  float percentage;

  void calculate(int math, int science, int ALML, int networking) {
    percentage = (math + science + ALML + networking) / 4;
  }
}
