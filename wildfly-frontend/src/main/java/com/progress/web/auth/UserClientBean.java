package com.progress.web.auth;

import com.progress.backend.connections.BackendConnectionManager;

import com.project.dto.UserDTO;
import com.project.interfaces.UserFacadeRemote;
import java.io.Serializable;
import java.util.Date;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author armena
 */
@ManagedBean(name = "userClientBean")
@ViewScoped
public class UserClientBean implements Serializable {

   

    private static final long serialVersionUID = 1L;

    
    
    @ManagedProperty("#{backendConnectionManager}")
    private BackendConnectionManager backendConnectionManager = null;
  
    public UserClientBean() {
    }
  

    public String doCall() {
        try {
            UserDTO user = new UserDTO();
            user.setEmail("mail@" + System.currentTimeMillis() + ".com");
            user.setFirstname("fname" + System.currentTimeMillis());
            user.setLastname("lname" + System.currentTimeMillis());
            user.setPassword("password");
            user.setRegisteredDate(new Date(System.currentTimeMillis()));
            user.setStatus(1);
            backendConnectionManager.getUserFacadeRemote().save(user);
            System.out.println("count after save is " + backendConnectionManager.getUserFacadeRemote().count());
           
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

  
    public void setBackendConnectionManager(BackendConnectionManager backendConnectionManager) {
        this.backendConnectionManager = backendConnectionManager;
    }

}
