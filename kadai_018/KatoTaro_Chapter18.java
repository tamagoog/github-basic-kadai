package kadai_018;

public class KatoTaro_Chapter18 extends Kato_Chapter18 {


	//親クラスの抽象メソッドであるeachIntroduceを次のように実装
	void eachIntroduce() {
	    System.out.println("Javaが得意です");
	   }
	
	//名を表すフィールドの値をセットする
	public void setGivenName() {
		super.givenName ="太郎";
	}

}
