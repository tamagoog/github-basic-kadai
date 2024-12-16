package kadai_018;

public class KatoIchiro_Chapter18 extends Kato_Chapter18 {


	//親クラスの抽象メソッドであるeachIntroduceを次のように実装
	void eachIntroduce() {
	      System.out.println("好きな食べ物はリンゴです");
	   }
	
	//名を表すフィールドの値をセットする
	public void setGivenName() {
		super.givenName ="一郎";
	}
	
}