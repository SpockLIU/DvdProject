package biz;

import java.util.List;

import org.apache.struts2.interceptor.RequestAware;

import com.opensymphony.xwork2.ActionSupport;

import dao.DvdDao;
import entity.Dvd;

public class DvdBiz extends ActionSupport{
	
	private List<Dvd> dvds;

	public String addDvd(){
		DvdDao dDao = new DvdDao();
		for(Dvd d : dvds){
			dDao.insertDvd(d);
		}
		return SUCCESS;
		/*DvdDao dDao = new DvdDao();
		boolean flag = dDao.insertDvd(dvd);
		if(flag){
			return SUCCESS;
		}
		return ERROR;*/
		
	}
	
	public List<Dvd> getDvds() {
		return dvds;
	}

	public void setDvds(List<Dvd> dvds) {
		this.dvds = dvds;
	}

}
