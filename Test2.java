public class Test2{
	public static void main(String[] args) {
		int val = 0;
		if(val<5) {
			val += 1;
			System.out.println("Answer is" + val);
		}
		switch(val) {
		case 1:
			System.out.println("1");
			break;
		case 2:
			System.out.print("2");
			break;
		default:
			System.out.print("others");
			break;
		}
		
	Animal a = new Animal()	;
	a.name  = "peko";
	a.color = "white";
	System.out.print(a.getinfo("%sは%s"));
	}
			
		}
		


class Animal{
	String name = "peko";
	String color= "white";
	public String getinfo(String format) {
		return String.format(format, this.name,this.color);
	}
}

