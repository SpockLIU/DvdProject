package biz;

import java.util.ArrayList;
import java.util.List;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.RequestAware;

import com.opensymphony.xwork2.ActionSupport;

import dao.DvdDao;
import dto.DvdDto;
import entity.Dvd;

public class DvdBiz extends ActionSupport{
	
	private List<Dvd> dvds;
	private DvdDto dvdDto;

	public String addDvd() throws Exception{
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
	
	public String queryDvd() throws Exception{
		Dvd dvd = null;
		DvdDao dDao = new DvdDao();
		List<Dvd> dvdsNew = new ArrayList<>();
		if(dvdDto.getDvdIDs() == null || dvdDto.getDvdIDs().equals("")){
			dvd = new Dvd();
			dvd.setDvdName(dvdDto.getDvdName());
			dvd.setDvdStatus(dvdDto.getDvdStatus());
			dvd.setDvdType(dvdDto.getDvdType());
			dvds =  dDao.queryDvd(dvd);
		}else{
			dvd = new Dvd();
			String[] ids = dvdDto.getDvdIDs().split(",");
			dvds = new ArrayList<>();
			for(String str : ids){
				dvds.add(dDao.queryByID(Integer.parseInt(str)));
			}
			
		}
//		System.out.println(dvd.toString());
//		dvdsNew = dDao.queryDvd(dvd);
//		ServletActionContext.getRequest().getSession().setAttribute("dvds", dvdsNew);
		return SUCCESS;
	}
	
	public List<Dvd> getDvds() {
		return dvds;
	}

	public void setDvds(List<Dvd> dvds) {
		this.dvds = dvds;
	}

	public DvdDto getDvdDto() {
		return dvdDto;
	}

	public void setDvdDto(DvdDto dvdDto) {
		this.dvdDto = dvdDto;
	}
	
	

}
