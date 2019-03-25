import java.util.NoSuchElementException;

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
    String ans = "{";
    if (size == 0) {
      return ans + "}";
    }
    for (int i = 0;i < size;i += 1) {
      ans += data[(i + start) % data.length] + " ";
    }
    return ans + "}";
  }

  public void addFirst(E element) {
    if (element == null) {
      throw new NullPointerException();
    }
    if (size == data.length) {
      resize();
    }
    data[(start + data.length - 1) % data.length] = element;
    start = (start + data.length - 1) % data.length;
    size += 1;
  }

  public void addLast(E element) {
    //System.out.println(size);
    if (element == null) {
      throw new NullPointerException();
    }
    if (size == data.length) {
      resize();
    }
    //System.out.println(start + " " + end + " " + size);
    data[(end) % data.length] = element;
    end = (end + 1) % data.length;
    size += 1;
  }

  @SuppressWarnings("unchecked")
  private void resize() {
    E[] data2 = (E[])new Object[data.length * 2 + 1];
    for (int i = 0;i < size;i += 1) {
      data2[i] = data[(start + i) % data.length];
    }
    start = 0;
    end = size;
    data = data2;
  }

  public E removeFirst() {
    if (size == 0) {
      throw new NoSuchElementException();
    }
    E temp = data[start];
    data[start] = null;
    start = (start + 1) % data.length;
    size -= 1;
    return temp;
  }

  public E removeLast() {
    if (size == 0) {
      throw new NoSuchElementException();
    }
    E temp = data[end];
    data[(end - 1 + data.length) % data.length] = null;
    end = (end - 1 + data.length) % data.length;
    size -= 1;
    return temp;
  }

  public E getFirst() {
    if (size == 0) {
      throw new NoSuchElementException();
    }
    return data[start];
  }

  public E getLast() {
    if (size == 0) {
      throw new NoSuchElementException();
    }
    return data[(end - 1 + data.length) % data.length];
  }
}
