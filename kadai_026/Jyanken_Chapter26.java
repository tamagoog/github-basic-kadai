package kadai_026;
import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter26 {
	
	
	//getMyChoiceメソッド：自分のじゃんけんの手を入力する
	public static String getMyChoice() {
		
		System.out.println("自分のじゃんけんの手を入力しましょう");
		//Scannerクラスのオブジェクトを生成する
		Scanner scanner = new Scanner(System.in);
		
		//入力した内容を取得する
		String input = scanner.next();
				
		//正しいじゃんけんの手であるか判定する
		if (input.equals("r") || input.equals("s") || input.equals("p")) {
			//自分のじゃんけんの手を返す
			return input;
			
		}else {
			System.out.println("入力値がエラーです。正しい手 (r, s, p) を入力してください。");
			return getMyChoice(); // 再帰的に自分自身を呼び出す
			
			}}

	//getRandomメソッド：対戦相手のじゃんけんの手を乱数で選ぶ
		public static String getRandom() {
			//配列にじゃんけんの手をセットする
			String[] JankenArray = {"r","s","p"};
			//乱数で対戦相手のじゃんけんの手を選ぶ
			int i=(int) Math.floor(Math.random() * 3);
			//対戦相手のじゃんけんの手を返す
			return JankenArray[i];
		}
		
	////playGameメソッド：じゃんけんを行う
		public static void playGame(String myjanken,String youjanken) {
			//自分と対戦相手のじゃんけんの手を出力する
			HashMap<String,String> janken=new HashMap<String,String> ();
			janken.put("r","グー");
			janken.put("s","チョキ");
			janken.put("p","パー");
			//自分と対戦相手のじゃんけんの手を比較する
			String henkangomyjanken=janken.get(myjanken);
			String henkangoyoujanken=janken.get(youjanken);
			
			if ((henkangomyjanken.equals("グー")||henkangoyoujanken.equals("グー")) && (henkangomyjanken.equals("チョキ")||henkangoyoujanken.equals("チョキ")) && (henkangomyjanken.equals("パー")||henkangoyoujanken.equals("パー"))){
				System.out.println("あいこです");
			}else if ((henkangomyjanken.equals("グー")||henkangoyoujanken.equals("チョキ")) && (henkangomyjanken.equals("チョキ")||henkangoyoujanken.equals("パー")) && (henkangomyjanken.equals("パー")||henkangoyoujanken.equals("グー"))){
				System.out.println("自分の勝ちです");
				
			}else {
				System.out.println("自分の負けです");
			}
		}
}
