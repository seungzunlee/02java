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
		System.out.printf("%s����  %s�Կ��� %s��� �޼��� ����\n", sendName, getName, msg);
	}
	public void sendCallInput(String getName, String getNum) {
		this.getName = getName;
		this.getNum = getNum;
		
	}
	public void callButton() {
		System.out.printf("%s���� %s�Կ��� ��ȭ �߽�", sendName, getName);
	}
	
	public static void main(String[] args) {
		CellPhone phone = new CellPhone("ȫ�浿", "010-1111-1111");
		
		phone.sendMsgInput("ȫ�泲", "010-2222-2222", "�ȳ�");
		phone.sendMsgButton();
		phone.sendCallInput("ȫ�泲", "010-2222-2222");
		phone.callButton();

	}

}
