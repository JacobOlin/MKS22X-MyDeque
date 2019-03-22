public class MyDeque<E>{
  private E[] data;
  private int size;
  private int start;
  private int end;

  @SuppressWarnings("unchecked")
  public MyDeque() {
    data = (E[])new Object[10];
  }

  @SuppressWarnings("unchecked")
  public MyDeque(int initialCapacity) {
    data = (E[])new Object[10];
  }

  public int size() {
    return size;
  }

  public String toString() {
    String ans = "";
    if (size == 0) {
      return ans;
    }
    for (int i = 0;i < size;i += 1) {
      ans += data[i % data.length] + ", ";
    }
    return ans.substring(0,ans.length() - 2);
  }
}
