public class Test4{
	public static void main(String[] args) {
		gaburi gb = new gaburi();
		gb.anigab();
	}
}

class Animals{
	public  String dd(String name,int num) {
		return name + num + "匹";
	}
}

class gaburi extends Animals{
	String msg = dd("Hamster",3) + "がガブリ";
	void anigab() {
		System.out.println(msg);
	}
}