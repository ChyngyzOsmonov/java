public class Store<T, E> {
    private T data;
    private E data2;

    public Store(T data, E data2) {
        this.data = data;
        this.data2 = data2;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public E getData2() {
        return data2;
    }

    public void setData2(E data2) {
        this.data2 = data2;
    }


    @Override
    public String toString() {
        return "Store{" +
                "data=" + data +
                ", data2=" + data2 +
                '}';
    }
}
