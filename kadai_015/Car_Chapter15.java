package kadai_015;

//車クラス
public class Car_Chapter15 {

	//フィールド（内部データ）
	private int gear  = 1;  //1速から5速のギアを表す
	private int speed = 10; //10~50のスピードが出せる
	
	//【メソッド run】最初のギア値を表示する
	public void run() {
	 System.out.println("速度は時速" + this.speed + "kmです");
	}
	
	//【メソッド gearChange】ギアの値により速度を変える
	public void gearChange(int afterGear) {
		System.out.println("ギア" + this.gear + "から" + afterGear + "に切り替えました");
		 this.gear=afterGear;
         this.speed = switch(this.gear){
			case 1 -> 10;
			case 2 -> 20;
			case 3 -> 30;
			case 4 -> 40;
			case 5 -> 50;
			default -> 10;
		};
    }
}