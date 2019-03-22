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
}
