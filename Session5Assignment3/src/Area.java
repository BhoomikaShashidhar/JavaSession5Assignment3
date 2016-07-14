
public class Area {
	
	public void Area(int l){
		System.out.println("The area of Square is " + l*l);
	}
	
	public void Area(int l,int b)
	{
		System.out.println("The area of Rectangle is "+l*b);
	}

	public static void main(String[] args) {
		Area ar= new Area();
		ar.Area(5);
		ar.Area(5, 6);
}
}
