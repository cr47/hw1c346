
public class MyLinkedList<T> implements ILinkedList<T> {

    private ILinkedList next;
    T data;

    public MyLinkedList() {
        this.next = null;
        this.data = null;
    }

    public MyLinkedList(T inputData) {
        this.next = null;
        this.data = inputData;
    }

    public ILinkedList<T> next() {
        return next;
    }


    public ILinkedList<T> last()
    {
        if (next == null)

        {
            return next;
        }
        return last();
    }


    public ILinkedList<T> after(int n) {
        ILinkedList<T> temp = next;
        for (int i = 0; i < (n-1); i++)
            temp = next;
        return temp;

    }



    public ILinkedList<T> detach() {
        ILinkedList<T> remove = next;
        next = null;
        return remove;
    }


    public T get() {
        return this.data;
    }


    public void set(T value) {
        this.data = value;
    }


    public void setNext(ILinkedList<T> next) {
        this.next = next;
    }


    public void append(ILinkedList<T> next) {
        next = next;
    }


    public void insert(ILinkedList<T> newFirst) {
        ILinkedList<T> temp = newFirst;
        newFirst = next;
    }




}

