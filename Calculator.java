import java.util.ArrayList;

public class Calculator{
  public static double eval(String s) {
    //ArrayList<String> a = new ArrayList<String>();
    MyDeque<String> m = new MyDeque<String>(s.length() / 3);
    int j = 0;
    for (int i = 0;i < s.length();i += 1) {
      if (s.charAt(i) == ' ') {
        //a.add(s.substring(j,i));
        if ("+-*/".contains(s.substring(j,i))) {
          double toAdd = process(s.charAt(j),m);
          m.addLast(toAdd + "");
        }
        else {
        m.addLast(s.substring(j,i));
        }
        j = i + 1;
      }
    }
    //a.add(s.substring(j,s.length()));
    return process(s.charAt(j),m);
    /*int r = m.size();
    for (int i = 0;i < r;i += 1) {
      System.out.print(m.removeFirst() + " ");
    }
    System.out.println();*/
  }

  public static void main(String[] args) {
    eval(args[0]);
  }

  public static double process(char c, MyDeque<String> m) {
    if (c == '+') {
      return 0.0 + Double.parseDouble(m.removeLast()) + Double.parseDouble(m.removeLast());
    }
    if (c == '*') {
      return 1.0 * Double.parseDouble(m.removeLast()) * Double.parseDouble(m.removeLast());
    }
    if (c == '-') {
      double temp = Double.parseDouble(m.removeLast()) + 0.0;
      return 0.0 + Double.parseDouble(m.removeLast()) - temp;
    }
    double temp = Double.parseDouble(m.removeLast()) + 0.0;
    return 1.0 * Double.parseDouble(m.removeLast()) / temp;
  }
}
