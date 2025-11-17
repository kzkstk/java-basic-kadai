package kadai_015;

//車クラス
public class Car_Chapter15 {

	//フィールド（内部データ）
	private int gear  = 1;  //1速から5速のギアを表す
	private int speed = 10; //10~50のスピードが出せる

	//コンストラクタ（初期化処理）
	public  Car_Chapter15(int gear,int speed) {
		
	}
	
	//【メソッド run】最初のギア値を表示する
	public void run(int gear) {
		this.gear=gear;
	}
	
	//【メソッド gearChange】ギアの値により速度を変える
	public void gearChange(int afterGear) {
         speed = switch(afterGear){
			case 1 -> 10;
			case 2 -> 20;
			case 3 -> 30;
			case 4 -> 40;
			case 5 -> 50;
			default -> 10;
		};
	
		System.out.println("ギア" + gear + "から" + afterGear + "に切り替えました");
		System.out.println("速度は時速" + speed + "kmです");
    }
}