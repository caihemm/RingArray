package cn.justin.ring;

public class RingArray<T> {
	private T[] a;
	private int i;
	public RingArray(T[] a) {
		this.a=a;
	}
	public T ring() {
		if(i==a.length) {
			i=0;
		}
		return a[i++];
	}
}
