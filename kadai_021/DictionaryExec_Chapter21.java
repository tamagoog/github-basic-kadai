package kadai_021;

public class DictionaryExec_Chapter21 {

	public static void main(String[] args) {
		// 辞書クラスのインスタンス生成
		Dictionary_Chapter21 Dictionary =new Dictionary_Chapter21();
		
		//調べる英単語を配列にセットする
		String[] SearchWord = {"apple","banana","grape","orange"};
		
		//辞書を調べるメソッドを引数指定で呼び出す
		for(String Keyword : SearchWord) {
			Dictionary.Search(Keyword);
		}
		
	}

}
