package biz;

import com.opensymphony.xwork2.ActionSupport;
import dao.UserDao;
import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;
import entity.User;

import java.util.Map;

/**
 * Created by Spock on 8/21/2016.
 */
public class UserBiz extends ActionSupport implements RequestAware, SessionAware{

    User user = new User();
    private Map<String, Object> request;
    private Map<String, Object> session;

    public String loginUser(){
        UserDao userDao = new UserDao();
        User userQuery = userDao.Login(user);
        if(userQuery != null){
            session.put("user", userQuery);
            return SUCCESS;
        }else {
            return ERROR;
        }
    }



    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
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
