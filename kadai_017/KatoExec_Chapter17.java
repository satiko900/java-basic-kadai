package kadai_017;

public class KatoExec_Chapter17 {
	
	public static void main(String[] args) {
		
		KatoTaro_Chapter17 taro = new KatoTaro_Chapter17();
		KatoIchiro_Chapter17 ichiro = new KatoIchiro_Chapter17();
		KatoHanako_Chapter17 hanako = new KatoHanako_Chapter17();
		
		taro.setGivenName();
		taro.execIntroduce();
		
		ichiro.setGivenName();
		ichiro.execIntroduce();
		
		hanako.setGivenName();
		hanako.execIntroduce();
	}

}
