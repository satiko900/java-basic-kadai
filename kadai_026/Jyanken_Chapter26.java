package kadai_026;
import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter26 {
	//じゃんけんの手を作成		
	HashMap<String,String> hand = new HashMap<>();
		//じゃんけんの手を追加		
		 public Jyanken_Chapter26() { 
			 hand.put("r","グー");
			 hand.put("s" ,"チョキ");
			 hand.put("p","パー");
		 }
		
	//自分のじゃんけんの手を入力するメソッド
	public String getMyChoice() {
		//入力できるようにする		
		Scanner choiceInput = new Scanner(System.in);
		//最初の説明		
		System.out.println("自分のじゃんけんの手を入力しましょう");
		System.out.println("グーはrockのrを入力しましょう\n"
				+ "チョキはscissorsのsを入力しましょう\n"
				+ "パーはpaperのpを入力しましょう");
		//エラーが起きた時の繰り返し処理		
		while(true) {
			//入力したデータを取得する変数を設定			
			String mychoice = choiceInput.next(); 
			//mychoice(入力データ)がhandの中に入ってい無い場合、エラーメッセージを出力
			//再度説明を出力し、continue文で取得を繰り返し	
			//以外はScannerを終了し、playGameメソッドに値を返す			
			if(!hand.containsKey(mychoice)) {
				System.out.println("入力が正しくありません\n"
						+ "グーはrockのrを入力しましょう\n"
						+ "チョキはscissorsのsを入力しましょう\n"
						+ "パーはpaperのpを入力しましょう");
				continue;
			}else {
				choiceInput.close();
				return mychoice;
			}
		}	
	}
	
	//相手側のじゃんけんの手をランダムに出力するメソッド	
	public String getRandom() {
		//配列にじゃんけんの値をセット		
		String[] pc = {"r", "s", "p"};
		//ランダムにじゃんけんの手を選択		
		String random = pc[(int)(Math.floor(Math.random() * 3))];
		//playGameメソッドに返す		
		return random;
	}
	
	//実行メソッド	
	public void playGame() {
		//getMyChoiceとgetRandomの戻り値を受け取る		
		String myhand = getMyChoice();
		String pchand = getRandom();
		
		System.out.println("自分の手は" + hand.get(myhand) + "相手の手は" + hand.get(pchand));
		
		//じゃんけんの手を比較する		
		if(hand.get(myhand).equals(hand.get(pchand))) {
			System.out.println("あいこです");
		}else if((hand.get(myhand).equals("グー")) && (hand.get(pchand).equals("チョキ"))) {
			System.out.println("自分の勝ちです");
		}else if((hand.get(myhand).equals("グー")) && (hand.get(pchand).equals("パー"))) {
			System.out.println("自分の負けです");
		}else if((hand.get(myhand).equals("チョキ")) && (hand.get(pchand).equals("グー"))) {
			System.out.println("自分の負けです");
		}else if((hand.get(myhand).equals("チョキ")) && (hand.get(pchand).equals("パー"))) {
			System.out.println("自分の勝ちです");
		}else if((hand.get(myhand).equals("パー")) && (hand.get(pchand).equals("グー"))) {
			System.out.println("自分の勝ちです");
		}else {
			System.out.println("自分の負けです");
		}
	}
	}
	
	
	
