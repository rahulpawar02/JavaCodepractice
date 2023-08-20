package java8.stream_api.MapWithString;

public class User {

	private Long userId;
	private String userName;
	private String userPhoneNo;

	public User() {
		super();
	}

	public User(Long userId, String userName, String userPhoneNo) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userPhoneNo = userPhoneNo;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPhoneNo() {
		return userPhoneNo;
	}

	public void setUserPhoneNo(String userPhoneNo) {
		this.userPhoneNo = userPhoneNo;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", userPhoneNo=" + userPhoneNo + "]";
	}
}
