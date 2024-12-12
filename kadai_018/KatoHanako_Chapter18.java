package kadai_018;

public class KatoHanako_Chapter18 extends Kato_Chapter18 {

	public static void main(String[] args) {
		//KatoHanakoクラスのオブジェクトを作る
		KatoHanako_Chapter18 KatoHanako = new KatoHanako_Chapter18();
		KatoHanako.eachIntroduce();
	   }

	//親クラスの抽象メソッドであるeachIntroduceを次のように実装
	void eachIntroduce() {
	      System.out.println("趣味は読書です");
	   }
	
	//名を表すフィールドの値をセットする
	public void setGivenName() {
		super.givenName ="花子";
	}

}