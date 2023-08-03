package practice;


class Nodes<T extends Comparable<T>> {
    T data;
    Nodes<T> next;
    Nodes<T> prev;

    public Nodes(T data, Nodes<T> next, Nodes<T> prev) {
	super();
	this.data = data;
	this.next = next;
	this.prev = prev;
    }

    public T getData() {
	return data;
    }

    public void setData(T data) {
	this.data = data;
    }

    public Nodes<T> getNext() {
	return next;
    }

    public void setNext(Nodes<T> next) {
	this.next = next;
    }

    public Nodes<T> getPrev() {
	return prev;
    }

    public void setPrev(Nodes<T> prev) {
	this.prev = prev;
    }

    @Override
    public String toString() {
	return "Nodes [data=" + data + ", next=" + next + ", prev=" + prev + "]";
    }

}

class DoubleLink<T extends Comparable<T>> {
    private Nodes<T> first = null;

    void add(T data) {
	Nodes<T> newnode = new Nodes<T>(data, null, null);
	if (first == null)
	    first = newnode;
	else {
	    Nodes temp = first;
	    while (temp.getNext() != null)
		temp = temp.getNext();

	    temp.setNext(newnode);
	    newnode.setPrev(temp);
	}
    }

    public void DisplayForward() {
	Nodes<T> temp = first;
	if (first == null) {
	    System.out.println("No data to Display");
	}
	System.out.println("\nData in Forward direction");
	while (temp != null) {
	    System.out.print("\t" + temp.getData());
	    temp = temp.getNext();
	}

    }

    public void DisplayBackward() {
	Nodes<T> temp = first;
	if (first == null) {
	    System.out.println("No data to Display");
	    return;
	}
	while (temp.getNext() != null) {
	    temp = temp.getNext();
	}
	System.out.println("\nData in Backward direction");
	while (temp != null) {
	    System.out.print("\t" + temp.getData());
	    temp = temp.getPrev();
	}

    }

    public void Delete(T data) {
	Nodes<T> temp = first;
	Nodes<T> tpre = first;
	Nodes<T> tnext = first;

	if (first == null) {
	    System.out.println("No Data to Display");
	    return;
	}
	if (first.getData() == data) {
	    first = first.getNext();
	    first.setPrev(null);
	    return;
	}
	while (temp.getNext() != null) {
	    tnext = temp.getNext();
	    tpre = temp.getPrev();
	    if (temp.getData() == data) {
		tpre.setNext(temp.getNext());
		tnext.setPrev(temp.getPrev());
	    }
	    temp = temp.getNext();
	}
	return;
    }
}

public class comR {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	DoubleLink<Integer> x = new DoubleLink<Integer>();

	x.add(10);
	x.add(20);
	x.add(30);
	x.add(40);
	// System.out.println(x);
	x.DisplayForward();
	x.DisplayBackward();
	x.Delete(10);
	x.DisplayForward();
    }

}