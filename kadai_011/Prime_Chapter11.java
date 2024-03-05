package kadai_011;

public class Prime_Chapter11 {

	public static void main(String[] args) {
		
//		素数判定用の配列を用意する
		boolean[] array;
		array = new boolean[101];	
		
		for(int i = 0; i < array.length; i++) {
			array[i] = true;
		}
		
//		素数がどうか調べる
		for(int i = 3; i < array.length; i++) {
			for(int j = 2; j < array.length; j++) {
				if((i != j) && (i % j == 0)){
					array[i] = false;
					break;
				}
			}
		}
		
//		素数だけ表示させる
		for(int i = 2; i < array.length; i++) {
			if(array[i] == true) {
				System.out.println(i);
			}
		}

	}
	

}
