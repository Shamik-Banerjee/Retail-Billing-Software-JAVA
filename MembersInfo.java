package p1;

public class MembersInfo {
	int cardNo;
	String memberName,validity,contactNo;
	public MembersInfo(int cdno,String nm,String val,String con) 
	{
		cardNo=cdno;
		memberName=nm;
		validity=val;
		contactNo=con;
	}
	public int getCardNo() {
		return cardNo;
	}
	public void setCardNo(int cardNo) {
		this.cardNo = cardNo;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public String getValidity() {
		return validity;
	}
	public void setValidity(String validity) {
		this.validity = validity;
	}
	public String getContactNo() {
		return contactNo;
	}
	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}
	
}
