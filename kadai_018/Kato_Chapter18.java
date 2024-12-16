package kadai_018;

abstract class Kato_Chapter18 {

	//抽象メソッド：個別の紹介を出力する
	abstract void eachIntroduce();

	//フィールド変数の定義
	public String givenName;
	public String familyName="加藤";
	public String address = "東京都中野区○×";
	
	//メソッド:共通の紹介を出力する
	public void commonIntroduce() {
		System.out.println("名前は"+ familyName +givenName +"です");
		System.out.println("住所は" + address + "です");	
	}
	//メソッド:紹介を実行する
	public void execIntroduce() {
		commonIntroduce();
		eachIntroduce();
	}
			
		
}
