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
        }
        else {
        m.addLast(s.substring(j,i));
        }
        j = i + 1;
      }
    }
    //a.add(s.substring(j,s.length()));
    m.addLast(s.substring(j,s.length()));
    /*int r = m.size();
    for (int i = 0;i < r;i += 1) {
      System.out.print(m.removeFirst() + " ");
    }
    System.out.println();*/
    return 0.0;
  }

  public static void main(String[] args) {
    eval(args[0]);
  }

  public static double process(char c, MyDeque<String> m) {
    return 0.0;
  }
}
