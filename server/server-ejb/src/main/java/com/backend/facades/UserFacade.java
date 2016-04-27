package com.backend.facades;

import com.project.dto.UserDTO;
import com.backend.entities.User;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaQuery;
import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;
import com.project.interfaces.UserFacadeRemote;

/**
 *
 * @author ArmenArzumanyan
 */
@Stateless(mappedName = "userFacadeRemote", name = "userFacadeRemote")
@Remote(UserFacadeRemote.class)
public class UserFacade extends AbstractFacade<User> implements UserFacadeRemote {

    @PersistenceContext(unitName = "main_PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public UserFacade() {
        super(User.class);
    }

    @Override
    public List<UserDTO> getUserList(boolean all, int maxResults, int firstResult) {
        List<UserDTO> finalList = new ArrayList<>();
        try {
            CriteriaQuery cq = getEntityManager().getCriteriaBuilder().createQuery();
            cq.select(cq.from(User.class));
            Query q = getEntityManager().createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            List<User> retList = q.getResultList();
            Mapper mapper = new DozerBeanMapper();
            for (User u : retList) {
                UserDTO destObject
                        = mapper.map(u, UserDTO.class);
                finalList.add(destObject);
            }
            return finalList;
        } finally {
            //getEntityManager().close();
        }
    }

    @Override
    public UserDTO findUser(Long id) {
        try {
            User user = getEntityManager().find(User.class, id);
            Mapper mapper = new DozerBeanMapper();
            UserDTO destObject
                    = mapper.map(user, UserDTO.class);
            return destObject;
        } finally {

        }
    }
    
    @Override
    public void save(UserDTO user) {
        System.out.println("Received object " + user.getFirstname());
        try {
            Mapper mapper = new DozerBeanMapper();
            User destObject
                    = mapper.map(user, User.class);
            System.out.println("Saving object ");
            getEntityManager().persist(destObject);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Override
    public int count() {
        System.out.println("@@@@@Count in facade  ");
        javax.persistence.criteria.CriteriaQuery cq = getEntityManager().getCriteriaBuilder().createQuery();
        javax.persistence.criteria.Root<User> rt = cq.from(User.class);
        cq.select(getEntityManager().getCriteriaBuilder().count(rt));
        javax.persistence.Query q = getEntityManager().createQuery(cq);
        return ((Long) q.getSingleResult()).intValue();
    }
}
