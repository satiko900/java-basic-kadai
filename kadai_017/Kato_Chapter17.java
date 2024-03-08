package kadai_017;

abstract public class Kato_Chapter17 {
    //フィールド	
	public String familyName = "加藤";
	public String givenName;
	public String address = "住所は東京都中野区〇×です";
	

	//メソッド（共通の紹介を出力）	
	public void commonIntroduce() {
		System.out.println("名前は" + familyName + givenName + "です");
		System.out.println("住所は" + address);
	}
	
	//抽象メソッド（個別の紹介を出力）	
	abstract public void eachIntroduce();
	
	//メソッド（紹介を実行）
	public void execIntroduce() {
		commonIntroduce();
		eachIntroduce();
	}
}