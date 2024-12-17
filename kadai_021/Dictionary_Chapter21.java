package kadai_021;
import java.util.HashMap;

public class Dictionary_Chapter21 {
	
	//HashMapの宣言
	HashMap<String,String> Jisho;
	
	// コンストラクタ内で初期化と要素の追加
	public Dictionary_Chapter21() {
		Jisho =new HashMap<>();
		Jisho.put("apple","りんご");
		Jisho.put("peach","桃");
		Jisho.put("banana","バナナ");
		Jisho.put("lemon","レモン");
		Jisho.put("pear	","梨");
		Jisho.put("kiwi","キウィ");
		Jisho.put("strawberry","いちご");
		Jisho.put("grape","ぶどう");
		Jisho.put("muscat","マスカット");
		Jisho.put("cherry","さくらんぼ");
	  }
	  
	 //辞書検索メソッド
	  public void Search(String key) {
		  // キーのマッチングフラグ
	        boolean found = false;
	        
	        // Jishoのキーセットを取得してループを回す
	        for (String currentKey : Jisho.keySet()) {
	            if (currentKey.equals(key)) {
	                System.out.println(key + "の意味は" + Jisho.get(key));
	                found = true;
	                break;  // 一致するキーが見つかったらループを抜ける
	            }
	        }
	        
	        // キーが見つからなかった場合のメッセージ
	        if (!found) {
	            System.out.println(key + "は辞書に存在しません");
	        }
			  
		  }

}

