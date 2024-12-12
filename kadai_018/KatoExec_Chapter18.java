package kadai_018;

public class KatoExec_Chapter18 {

	public static void main(String[] args) {
		
		//各子クラスのインスタンス生成
		KatoTaro_Chapter18 Kato1 = new KatoTaro_Chapter18();
		KatoIchiro_Chapter18 Kato2 = new KatoIchiro_Chapter18();
		KatoHanako_Chapter18 Kato3 = new KatoHanako_Chapter18();
		
		//setGivenNameメソッドの実行
		Kato1.setGivenName();
		Kato2.setGivenName();	
		Kato3.setGivenName();		
		
		//commonIntroduce・execlntroduceメソッドの実行
		Kato1.commonIntroduce();
		Kato1.execIntroduce();
		
		Kato2.commonIntroduce();
		Kato2.execIntroduce();
		
		Kato3.commonIntroduce();
		Kato2.execIntroduce();
	}

}
