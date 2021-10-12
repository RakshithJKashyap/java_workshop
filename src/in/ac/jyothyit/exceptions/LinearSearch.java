package in.ac.jyothyit.exceptions;

public class LinearSearch {
	public static void search(int[] a,int x) throws KeyNotFoundException{
		boolean flag = false;
		for (int i=0;i<a.length;i++) {
			if (a[i] == x) {
				flag = true;
				break;
			}
		}
		if (flag == false) {
			throw new KeyNotFoundException();
		}
	}

}
