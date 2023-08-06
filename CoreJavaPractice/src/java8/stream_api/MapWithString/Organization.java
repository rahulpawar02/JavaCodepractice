package java8.stream_api.MapWithString;

public class Organization {

	private Long orgId;
	private String orgName;
	private String userIds;

	public Organization() {
		super();
	}

	public Organization(Long orgId, String orgName, String userIds) {
		super();
		this.orgId = orgId;
		this.orgName = orgName;
		this.userIds = userIds;
	}

	public Long getOrgId() {
		return orgId;
	}

	public void setOrgId(Long orgId) {
		this.orgId = orgId;
	}

	public String getOrgName() {
		return orgName;
	}

	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}

	public String getUserIds() {
		return userIds;
	}

	public void setUserIds(String userIds) {
		this.userIds = userIds;
	}

	@Override
	public String toString() {
		return "Organization [orgId=" + orgId + ", orgName=" + orgName + ", userIds=" + userIds + "]";
	}

}
