package kadai_026;

public class JyankenExec_Chapter26 {

	public static void main(String[] args) {
		//じゃんけんクラスのインスタンスを生成する
		Jyanken_Chapter26 jankenInstance= new Jyanken_Chapter26();
		
		//自分のじゃんけんの手を入力する
		String myjanken=jankenInstance.getMyChoice();
		
		//対戦相手のじゃんけんの手が乱数で選ばれる
		String youjanken=jankenInstance.getRandom();
		
		//じゃんけんの結果を示す
		jankenInstance.playGame(myjanken,youjanken);
	}

}
