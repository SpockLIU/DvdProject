package entity;

public class Dvd {
	
	private int dvdId;
	private String dvdName;
	private double dvdPrice;
	private int dvdStatus;
	private int dvdType;
	private int dvdRentTime;
	private double dvdRentPrice;
	
	public Dvd() {
	}
	
	public int getDvdId() {
		return dvdId;
	}
	public void setDvdId(int dvdId) {
		this.dvdId = dvdId;
	}
	public String getDvdName() {
		return dvdName;
	}
	public void setDvdName(String dvdName) {
		this.dvdName = dvdName;
	}
	public double getDvdPrice() {
		return dvdPrice;
	}
	public void setDvdPrice(double dvdPrice) {
		this.dvdPrice = dvdPrice;
	}
	public int getDvdStatus() {
		return dvdStatus;
	}
	public void setDvdStatus(int dvdStatus) {
		this.dvdStatus = dvdStatus;
	}
	public int getDvdType() {
		return dvdType;
	}
	public void setDvdType(int dvdType) {
		this.dvdType = dvdType;
	}
	public int getDvdRentTime() {
		return dvdRentTime;
	}
	public void setDvdRentTime(int dvdRentTime) {
		this.dvdRentTime = dvdRentTime;
	}
	public double getDvdRentPrice() {
		return dvdRentPrice;
	}
	public void setDvdRentPrice(double dvdRentPrice) {
		this.dvdRentPrice = dvdRentPrice;
	}

	@Override
	public String toString() {
		return "Dvd [dvdId=" + dvdId + ", dvdName=" + dvdName + ", dvdPrice="
				+ dvdPrice + ", dvdStatus=" + dvdStatus + ", dvdType="
				+ dvdType + ", dvdRentTime=" + dvdRentTime + ", dvdRentPrice="
				+ dvdRentPrice + "]";
	}
	
	
	
	

}
