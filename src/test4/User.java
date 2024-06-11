package test4;

public class User {
	public String Hand;
	
	public User(String user) {
		
	}

	public void SetHand(String handNum) {
		
		switch (handNum) {
		case "0":
			Hand = "グー";
			break;
		case "1":
			Hand = "チョキ";
			break;
		case "2":
			Hand = "パー";
			break;
		default:
			System.out.println("正しい値が入力されませんでした。システムを終了します");
			System.exit(0);
		}			
	}
}
