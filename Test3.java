import myapp.Test3_package ;


public class Test3{
	public static void main(String[] args) {
		hikisuu h = new hikisuu();
		double K = h.sum(4,5);
		System.out.println(K);
		
		
		Test3_package.main(args); // package宣言をしたmyappの中のファイルを呼び出す
		
		new student();
		
		
	}
}

class hikisuu{
	public  double sum(double A,double B) { //引数の復習。Pythonと特に変わらないから分かりやすい。
		return A + B;
	}
}

class student{
	String name = "ふぁれん";
	int score = 0;
	
	public  student() {
		String name = "ケロ";
		int score = 100;
		System.out.println(this.name + "は"+ this.score + "点"); //thisキーワードを使用
		System.out.println(name + "は" + score + "点");// メソッド内変数が出てくる
		
	}
}
