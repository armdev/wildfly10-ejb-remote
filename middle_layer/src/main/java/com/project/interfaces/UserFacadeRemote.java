package com.project.interfaces;

import com.project.dto.UserDTO;
import java.util.List;

/**
 *
 * @author Home
 */
public interface UserFacadeRemote {
     public List<UserDTO> getUserList(boolean all, int maxResults, int firstResult);   
     public UserDTO findUser(Long id);
     public void save(UserDTO user);
     public int count();
}
