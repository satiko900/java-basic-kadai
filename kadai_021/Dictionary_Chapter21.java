package kadai_021;
import java.util.HashMap;

public class Dictionary_Chapter21 {

	private HashMap<String,String> dictionary;
	public Dictionary_Chapter21() {
		this.dictionary = new HashMap<>();
	
	dictionary.put("apple","りんご");
	dictionary.put("peach","桃");
	dictionary.put("banana","バナナ");
	dictionary.put("lemon","レモン");
	dictionary.put("pear","梨");
	dictionary.put("kiwi","キウイ");
	dictionary.put("strawberry","いちご");
	dictionary.put("grape","ぶどう");
	dictionary.put("muscat","マスカット");
	dictionary.put("cherry","さくらんぼ");
	}

	public void checkwords(String[] words) {
		for( int i = 0; i < words.length; i++) {
			if(dictionary.containsKey(words[i])) {
				System.out.println(words[i] + "の意味は" + dictionary.get(words[i]) + "です");
			}else {System.out.println(words[i] + "は辞書に存在しません");
		}
		}
	}
	}
