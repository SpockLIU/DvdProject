package biz;

import com.opensymphony.xwork2.ActionSupport;
import dao.ManagerDao;
import entity.Manager;
import entity.User;
import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;

import java.util.Map;

/**
 * Created by Spock on 8/21/2016.
 */
public class ManagerBiz extends ActionSupport implements RequestAware, SessionAware{
    private Manager manager = new Manager();
    private Map<String, Object> request;
    private Map<String, Object> session;

    public String loginManager(){
        ManagerDao mDao = new ManagerDao();
        Manager mQuery = mDao.loginManager(manager);
        if(mQuery != null){
            session.put("manager", mQuery);
            return SUCCESS;
        }else {
            return ERROR;
        }
    }

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    @Override
    public void setRequest(Map<String, Object> request) {
        this.request = request;
    }

    @Override
    public void setSession(Map<String, Object> session) {
        this.session = session;
    }
}
