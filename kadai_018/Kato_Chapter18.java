package kadai_018;
//抽象クラス //親クラス
abstract public class Kato_Chapter18 {

	//姓を表すフィールド
	public String familyName ="加藤";
	//名を表すフィールド
	public String givenName ="";
	//住所を表すフィールド
	public String address = "東京は中野区⚪×︎";
	
	//共通の紹介を出力するメソッド、コンストラクタ
	public void commonIntroduce () {
		System.out.println("名前は" + familyName + givenName + "です");
	    System.out.println("住所は" + address + "です");
	}
	
	//個別の紹介をするメソッド(抽象メソッド）
	abstract void eachIntroduce();
		
	//紹介を実行するメソッド
	public void execlntroduce() {
		commonIntroduce();
		eachIntroduce();
	   }	
}  