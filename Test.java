public class Test {
	public static void main(String[] args ) {
		int num = 8;
		if(num >5) {
			num +=1;
			System.out.println(num);}
		
		if(modorichi(80)) {
			System.out.println("Yes!もっこりす");
		}else {System.out.println("そうじゃない");
		
		}
		
		int hikinum = kurasusousa.hikizan(7, 2);
		int tasinum = kurasusousa.tasizan(7, 2);
		System.out.println("足し算は"+tasinum);
		System.out.println("引き算は"+hikinum);
		
		String A = switchnituite.swntit("ふぁれん君");
		String B = switchnituite.swntit("HIKAKIN");
		String C = switchnituite.swntit("Mr.Beast");
		
		System.out.println( "ふぁれん君は" + A);
		System.out.println("HIKAKINは" + B );
		System.out.println("Mr.Beastは" + C );
		
		int valwhile = 0;
		while(valwhile < 4) {
			System.out.println("It's " + valwhile);
			valwhile++;}
			
		for (int i = 0 ; i<9; i++) {
			if(i%3 == 0) {continue;}
			System.out.print(i * 2 + "/" );
		};
		String[] Fordata = { "HIKAKIN" ,"HAJIME" , "PHALEN" };
		for (String valfor :Fordata) {
			System.out.println(valfor + "/");
		}
		}
	
	public static boolean  modorichi(int args) {
		if(args>10) {
			return true;}
		else {
			return false;}
			
		}
}

class kurasusousa{
	public static int tasizan(int a , int b) {
		return a + b;
	}
	public static int hikizan(int a , int b) {
		return a-b;
	}
}
class switchnituite{
	public static String swntit(String args) {
		String category = switch(args) {
		case "ふぁれん君"-> "インフルエンサー";
		case "HIKAKIN" -> "親分";
		default -> "それ以外";
		};
		
	return  category;
	}
}