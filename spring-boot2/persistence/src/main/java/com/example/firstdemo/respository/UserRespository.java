package com.example.firstdemo.respository;

/*
*
*
* */

import com.example.firstdemo.domain.User;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;


/*
* {@link User}{@link Repository}
* */
@Repository
public class UserRespository {

    private final ConcurrentMap<Integer,User>  respository=new ConcurrentHashMap<Integer, User>() ;
    private final static AtomicInteger ai=new AtomicInteger();
    /*
    * @param user{@link User}对象
    * @return
     * */
    public boolean save(User user){
        Integer id =ai.incrementAndGet();
        user.setId(id);
        return respository.put(id,user)==null;
    }
    public Collection<User> finAll(){
        return respository.values();
    }
    public boolean deleteById(User user){
        return respository.remove(user.getId(),user.getName());
    }
}