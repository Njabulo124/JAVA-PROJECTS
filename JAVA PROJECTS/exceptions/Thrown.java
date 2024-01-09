package exceptions;

public class Thrown {
	public int expect (int a, int b) throws Exception{
		if (a<0 || b<0) {
			throw new Exception("EXPECTED STUFF");
		}else if(a==0 && b==0) {
			throw new Exception("wow what a nice exception");
		}
		else {
			return a+b;
		}
	}
	public static void main(String[] args) throws Exception {
		Thrown n = new Thrown();
		n.expect(0, 0);

	}

}
