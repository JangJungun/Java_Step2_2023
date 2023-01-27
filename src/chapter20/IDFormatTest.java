package chapter20;

public class IDFormatTest {

	private String userID;
	
	
	
	public String getUserID() {
		return userID;
	}



	public void setUserID(String userID) throws IDFormatException {

		if(userID==null) {
			throw new IDFormatException("아이디는 null일수 엇습니다.");
		}else if(userID.length() < 8 || userID.length()>20) {
			throw new IDFormatException("아이디는 8글자이상 20자 이하로 쓰세요");
		}
		this.userID=userID;
	}



	public static void main(String[] args) {
		IDFormatTest test = new IDFormatTest();
		/*
		String userID = null;
		
		try {
			test.setUserID(userID);
		} catch (IDFormatException e) {
			System.out.println(e);//코드와 메세지
			System.out.println(e.getMessage());//메세지만 출력
		}
		*/
		String userID = "1234567";
		
		try {
			test.setUserID(userID);
		} catch (IDFormatException e) { //개발자 만든 Exception
			//System.out.println(e);//코드와 메세지
			System.out.println(e.getMessage());//메세지만 출력
		}
		
	}

}