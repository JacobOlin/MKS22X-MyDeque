import java.util.ArrayList;

public class Calculator{
  public static double eval(String s) {
    ArrayList<String> a = new ArrayList<String>();
    int j = 0;
    for (int i = 0;i < s.length();i += 1) {
      if (s.charAt(i) == ' ') {
        a.add(s.substring(j,i));
        j = i + 1;
      }
    }
    a.add(s.substring(j,s.length()));
    /*for (int i = 0;i < a.size();i += 1) {
      System.out.print(a.get(i) + " ");
    }
    System.out.println();*/
    return 0.0;
  }

  public static void main(String[] args) {
    eval(args[0]);
  }
}
