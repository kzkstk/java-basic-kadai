package kadai_015;

public class CarExec_Chapter15 {

	public static void main(String[] args) {
	
	//ギアのデータを生成
		Car_Chapter15 car1 = new Car_Chapter15(1,10,1);
	
	//車クラスのgearChangeメソッドを実行
		car1.gearChange(3);
		car1.run();
		
	}
}