package kadai_015;

//車クラス
public class Car_Chapter15 {

	//フィールド（内部データ）
	private int gear  = 1;  //1速から5速のギアを表す
	private int speed = 10; //10~50のスピードが出せる
	private int afterGear = 1; //ギアチェンジ後の１速から５速のギアを表す
	
	//コンストラクタ（初期化処理）
	public  Car_Chapter15(int gear,int speed,int afterGear) {
		this.gear = gear;
		this.speed = speed;
		this.afterGear = afterGear; 
	}
	
	//【メソッド gearChange】ギアの値により速度を変える
	public void gearChange(int afterGear) {
		 this.afterGear=afterGear;
         this.speed = switch(afterGear){
			case 1 -> 10;
			case 2 -> 20;
			case 3 -> 30;
			case 4 -> 40;
			case 5 -> 50;
			default -> 10;
		};
		System.out.println("ギア" + this.gear + "から" + this.afterGear + "に切り替えました");
	}
	public void run(){
		
		System.out.println("速度は時速" + this.speed + "kmです");
	}
	
}