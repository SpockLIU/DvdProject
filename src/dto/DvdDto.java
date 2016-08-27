package dto;

public class DvdDto {
	private String dvdIDs;
	private String dvdName;
	private Integer dvdStatus;
	private Integer dvdType;
	
	
	public DvdDto() {
	}
	
	public String getDvdIDs() {
		return dvdIDs;
	}
	public void setDvdIDs(String dvdIDs) {
		this.dvdIDs = dvdIDs;
	}
	public String getDvdName() {
		return dvdName;
	}
	public void setDvdName(String dvdName) {
		this.dvdName = dvdName;
	}
	public Integer getDvdStatus() {
		return dvdStatus;
	}
	public void setDvdStatus(Integer dvdStatus) {
		this.dvdStatus = dvdStatus;
	}
	public Integer getDvdType() {
		return dvdType;
	}
	public void setDvdType(Integer dvdType) {
		this.dvdType = dvdType;
	}

	@Override
	public String toString() {
		return "DvdDto [dvdIDs=" + dvdIDs + ", dvdName=" + dvdName
				+ ", dvdStatus=" + dvdStatus + ", dvdType=" + dvdType + "]";
	}
	
	

}
