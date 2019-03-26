package cn.justin.ring;

public class IntRingArray {
	private int[] a;
	private int i;
	public IntRingArray(int[] a) {
		this.a=a;
	}
	public int ring() {
		if(i==a.length) {
			i=0;
		}
		return a[i++];
	}
}
