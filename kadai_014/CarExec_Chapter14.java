package kadai_014;

public class CarExec_Chapter14 {
	
   public static void main(String[] args) {
	   
	   //ギアデータを作成
	   Car_Chapter14 gear1 = new Car_Chapter14(1, 10);
	   
      //ギアを3に変える	   
	   gear1.gearChange(3);
	   
	   gear1.run();
   }


}
