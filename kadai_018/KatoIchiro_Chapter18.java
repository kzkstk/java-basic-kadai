package kadai_018;

public class KatoIchiro_Chapter18 extends Kato_Chapter18 {
	//名前を表すフィールドをセットする
		public void setGivenName(String givenName) {
			this.givenName = givenName;
		}
	
	//抽象メソッドに具体的な処理を記述する
		void eachIntroduce() {
			System.out.println("好きな食べ物はリンゴです");
		}
}