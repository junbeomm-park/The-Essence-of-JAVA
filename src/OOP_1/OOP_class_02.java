package OOP_1;

public class OOP_class_02 {
	public static void main (String[] arge) {
		
		Tv t1 = new Tv();
		Tv t2 = new Tv();
		
		System.out.println("t1의 channel값은 " + t1.channel + "입니다.  ");
		System.out.println("t2의 channel값은 " + t2.channel + "입니다.  ");
		
		t1.channel = 7;
		
		System.out.println("t1의 channel1값을 7로 변경하였습니다. ");
		
	    System.out.println("t1의 channel값은 "+t1.channel + "입니다. " );
	    System.out.println("t2의 channel값은 "+t2.channel + "입니다. " );
		
	}

}