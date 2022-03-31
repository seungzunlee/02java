package com.human.ex5;

public class CellPhone {
	public String sendName = "";
	public String sendNum = "";
	public String getName = "";
	public String getNum = "";
	public String msg = "";
	public CellPhone(String sendName, String sendNum ) {
		this.sendName = sendName;
		this.sendNum = sendNum;
	}
	
	public void sendMsgInput(String getName, String getNum, String msg) {
		this.getName = getName;
		this.getNum = getNum;
		this.msg = msg;
	}
	public void sendMsgButton() {
		System.out.printf("%s´ÔÀÌ  %s´Ô¿¡°Ô %s¶ó´Â ¸Þ¼¼Áö Àü¼Û\n", sendName, getName, msg);
	}
	public void sendCallInput(String getName, String getNum) {
		this.getName = getName;
		this.getNum = getNum;
		
	}
	public void callButton() {
		System.out.printf("%s´ÔÀÌ %s´Ô¿¡°Ô ÀüÈ­ ¹ß½Å", sendName, getName);
	}
	
	public static void main(String[] args) {
		CellPhone phone = new CellPhone("È«±æµ¿", "010-1111-1111");
		
		phone.sendMsgInput("È«±æ³²", "010-2222-2222", "¾È³ç");
		phone.sendMsgButton();
		phone.sendCallInput("È«±æ³²", "010-2222-2222");
		phone.callButton();

	}

}
