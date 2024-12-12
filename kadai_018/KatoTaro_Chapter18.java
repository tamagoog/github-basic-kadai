package kadai_018;

public class KatoTaro_Chapter18 extends Kato_Chapter18 {

	public static void main(String[] args) {
		//KatoTaroクラスのオブジェクトを作る
		KatoTaro_Chapter18 KatoTaro = new KatoTaro_Chapter18();
		KatoTaro.eachIntroduce();
	   }

	//親クラスの抽象メソッドであるeachIntroduceを次のように実装
	void eachIntroduce() {
	    System.out.println("私はJavaが得意です");
	   }
	
	//名を表すフィールドの値をセットする
	public void setGivenName() {
		super.givenName ="太郎";
	}

}
