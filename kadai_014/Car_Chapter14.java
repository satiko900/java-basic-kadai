package kadai_014;

public class Car_Chapter14 {
	
	//フィールド
	private int gear = 1;
	private int speed = 10;
		
	 //コンストラクタ
	public Car_Chapter14( int gear, int speed ) {
		this.gear = gear;
		this.speed = speed;
	}
	
    //メソッド（ギアの値により速度を変える）	
	public void gearChange( final int afterGear ) {
		switch( afterGear ) {
		case 1 -> speed = 10;
		case 2 -> speed = 20;
		case 3 -> speed = 30;
		case 4 -> speed = 40;
		case 5 -> speed = 50;
		default -> speed = 10;
		}
		
		System.out.println( "ギア" + this.gear + "から" + afterGear + "に切り替えました" );
	}
	
    //メソッド（ギアチェンジ後の速度を表示）
	public void run() {
		
		System.out.println( "速度は時速" + this.speed + "です");
	}

}
