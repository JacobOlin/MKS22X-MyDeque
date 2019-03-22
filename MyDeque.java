public class MyDeque<E>{
  private E[] data;
  private int size;
  private int start;
  private int end;

  @SuppressWarnings("unchecked")
  public MyDeque() {
    data = (E[])new Object[10];
    size = 0;
    start = 0;
    end = 0;
  }

  @SuppressWarnings("unchecked")
  public MyDeque(int initialCapacity) {
    data = (E[])new Object[initialCapacity];
    size = 0;
    start = 0;
    end = 0;
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

  public void addFirst(E element) {
    if (size == data.length) {
      resize();
    }
    data[(start + data.length - 1) % data.length] = element;
    start = (start + data.length - 1) % data.length;
    size += 1;
  }

  public void addLast(E element) {
    if (size == data.length) {
      resize();
    }
    data[(end + 1) % data.length] = element;
    end = (end + 1) % data.length;
    size -= 1;
  }

  private void resize() {

  }
}
