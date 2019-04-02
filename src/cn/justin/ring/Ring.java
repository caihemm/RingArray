package cn.justin.ring;

public class Ring<T> {
	private T[] a;
	private int i;
	public Ring(T[] a) {
		this.a=a;
	}

	public T forward() {
		if(i==a.length) {
			i=0;
		}
		return a[i++];
	}
	public T backward() {
		if(i==-1) {
			i=a.length-1;
		}
		return a[i--];
	}
}
