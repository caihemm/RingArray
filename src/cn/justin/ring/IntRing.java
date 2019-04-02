package cn.justin.ring;

public class IntRing {
	private int[] a;
	private int i;
	public IntRing(int[] a) {
		this.a=a;
	}
	public int forward() {
		if(i==a.length) {
			i=0;
		}
		return a[i++];
	}
	public int backward() {
		if(i==-1) {
			i=a.length-1;
		}
		return a[i--];
	}
}
