package com.example.firstdemo.configuration;

import com.example.firstdemo.domain.User;
import com.example.firstdemo.respository.UserRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Flux;

import javax.jws.soap.SOAPBinding;
import java.util.Collection;
@RestController
public class RouterFunctionConfigration {


    private UserRespository userRespository;
    @Autowired
    public RouterFunctionConfigration(UserRespository userRespository){
        this.userRespository=userRespository;
    }
    /*
    *
    * Flux是0-N个对象集合
    * Mono是0-1个对象集合
    * Reactive中的Flux或者Mono它是异步处理（非阻塞）
    * 集合对象基本上是同步处理（阻塞）
    * */
    @Bean
    @Autowired
    public RouterFunction<ServerResponse> personFinAll(UserRespository userRespository){
        //返回所用的用户对象
        Collection<User> users= this.userRespository.finAll();

        return RouterFunctions.route(RequestPredicates.GET("/person/find/all"), request->{
            Flux<User> userFlux=Flux.fromIterable(users);
            return ServerResponse.ok().body(userFlux,User.class);
        }).and(RouterFunctions.route(RequestPredicates.GET("/person/find/delete"),request->{
            Flux<User> userFlux=Flux.fromIterable(users);
            return ServerResponse.ok().body(userFlux,User.class);
        }));
    }
}
