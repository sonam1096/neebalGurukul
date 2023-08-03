package com.gurukul.day11;

class Node<T extends Comparable> {
    private T data;
    private Node<T> next;

    public T getData() {
	return data;
    }

    public void setData(T data) {
	this.data = data;
    }

    public Node<T> getNext() {
	return next;
    }

    public void setNext(Node<T> next) {
	this.next = next;
    }

    public Node(T data) {
	super();
	this.data = data;
    }

    @Override
    public String toString() {
	return "Node [data=" + data + "]";
    }

}

class PolyData implements Comparable<PolyData> {
    double coeff;
    int pow;

    @Override
    public String toString() {
	return Math.abs(coeff) + (pow != 0 ? "x^" : "") + pow;
    }

    public PolyData(double coeff, int pow) {
	super();
	this.coeff = coeff;
	this.pow = pow;
    }

    public double getCoeff() {
	return coeff;
    }

    public void setCoeff(double coeff) {
	this.coeff = coeff;
    }

    public int getPow() {
	return pow;
    }

    public void setPow(int pow) {
	this.pow = pow;
    }

    @Override
    public int compareTo(PolyData o) {
	// TODO Auto-generated method stub

	return pow - o.pow;
    }

    public PolyData calcMulti(PolyData t) {
	PolyData res = new PolyData(this.getCoeff() * t.getCoeff(), this.getPow() + t.getPow());
	return res;

    }

}

class PolyExpression {
    Node<PolyData> first = null;

    public void add(double c, int pow) {
	// PolyData p=new PolyData(c,pow);
	Node<PolyData> temp = first;
	Node<PolyData> prev = null;
	while (temp != null) {

	    if (temp.getData().pow <= pow) {
		break;
	    }

	    prev = temp;
	    temp = temp.getNext();

	}

	if (temp != null && temp.getData().getPow() == pow) {
	    temp.getData().setCoeff(temp.getData().getCoeff() + c);
	} else {
	    Node<PolyData> newnode = new Node<PolyData>(new PolyData(c, pow));
	    if (temp == first) {
		newnode.setNext(first);
		first = newnode;
	    } else {
		newnode.setNext(temp);
		prev.setNext(newnode);
	    }
	}
    }

    @Override
    public String toString() {

	String msg = "";
	Node<PolyData> temp = first;
	while (temp.getNext() != null) {

	    msg += temp.getData() + (temp.getNext().getData().getCoeff() < 0 ? " - " : " + ");
	    temp = temp.getNext();
	}
	msg += temp.getData();
	return msg;
    }

    PolyExpression add(PolyExpression t) {
	PolyExpression res = new PolyExpression();
	Node<PolyData> p1 = first;
	Node<PolyData> p2 = t.first;

	while (p1 != null) {
	    res.add(p1.getData().getCoeff(), p1.getData().getPow());
	    p1 = p1.getNext();
	}
	p1 = p2;
	while (p1 != null) {
	    res.add(p1.getData().getCoeff(), p1.getData().getPow());
	    p1 = p1.getNext();
	}
	return res;
    }

    PolyExpression mult(PolyExpression t) {
	PolyExpression res = new PolyExpression();
	Node<PolyData> p1 = first;
	Node<PolyData> p2 = t.first;

	while (p1 != null) {
	    while (p2 != null) {
		res.add(p1.getData().getCoeff() * p2.getData().getCoeff(),
			p1.getData().getPow() + p2.getData().getPow());
		p2 = p2.getNext();
	    }
	    p1 = p1.getNext();
	    p2 = t.first;
	}
	return res;
    }

}

public class Polynomial {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	PolyExpression p1 = new PolyExpression();
	p1.add(7, 4);
	p1.add(-2, 5);
	p1.add(5, 9);
	p1.add(10, 3);

	PolyExpression p2 = new PolyExpression();
	p2.add(7, 2);
	p2.add(8, 3);
	p2.add(5, 4);
	p2.add(-10, 0);
	System.out.println(p1);
	System.out.println(p2);
	PolyExpression p3 = p1.add(p2);
	PolyExpression p4 = p1.mult(p2);

	System.out.println(p4);

    }
}