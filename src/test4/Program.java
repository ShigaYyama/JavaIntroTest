package test4;

public class Program {
	
	private String Result;
	public Boolean Finish;

	public void Start() {
		Finish = false;
		System.out.println("じゃんけんを開始します。");
		System.out.println("あなたの手を選んでください。");
		System.out.println("0 : グー");
		System.out.println("1 : チョキ");
		System.out.println("2 ： パー");
	}

	public void Battle(String userHand, String comHand) {
		
		System.out.println("最初はグー、じゃんけん");

		System.out.println("あなた：" + userHand);
		System.out.println("コンピュータ：" + comHand);
			
		switch (userHand) {
		case "グー":
			switch (comHand) {
			case "グー":
				Result = "あいこ";
				break;
			case "チョキ":
				Result = "勝ち";
				break;	
			case "パー":
				Result = "負け";
				break;
			}
			break;
		case  "チョキ":
			switch (comHand) {
			case "グー":
				Result = "負け";
				break;
			case "チョキ":
				Result = "あいこ";
				break;	
			case "パー":
				Result = "勝ち";
				break;
			}
			break;
		case  "パー":
			switch (comHand) {
			case "グー":
				Result = "勝ち";
				break;
			case "チョキ":
				Result = "負け";
				break;	
			case "パー":
				Result = "あいこ";
				break;
			}
			break;
		}
		
		switch (Result) {
		case "勝ち":
		case "負け":
			Finish = true;
			break;	
		case "あいこ":
			Finish = false;
			break;
		}
		
	}
	
	public void end() {

		if(Finish) {
			System.out.println("あなたの" + Result + "です！");
		}else {
			System.out.println(Result + "です。やり直します。");
		}

	}
	
}
