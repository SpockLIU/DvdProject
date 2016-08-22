package biz;

import org.apache.struts2.interceptor.RequestAware;

import com.opensymphony.xwork2.ActionSupport;

import dao.DvdDao;
import entity.Dvd;

public class DvdBiz extends ActionSupport{
	
	Dvd dvd = new Dvd();

	public String addDvd(){
		DvdDao dDao = new DvdDao();
		boolean flag = dDao.insertDvd(dvd);
		if(flag){
			return SUCCESS;
		}
		return ERROR;
		
	}

	public Dvd getDvd() {
		return dvd;
	}

	public void setDvd(Dvd dvd) {
		this.dvd = dvd;
	}
	
	

}
