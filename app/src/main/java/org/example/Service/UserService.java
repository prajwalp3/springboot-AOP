package org.example.Service;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.SneakyThrows;
import org.springframework.stereotype.Service;


@Service
public class UserService {

    @Getter
    @Setter
    @AllArgsConstructor
    public class User {
        private String name;
        private int age;
        private String address;
//  public UserService(String name,int age,String address)
//  {
//
//      this.age=age;
//      this.name=name;
//      this.address=address;
    }
    private User user;
    public UserService(){
        user=new User("huyywgy",23, "udeyggegy");


    }
    public void logIn(){
        System.out.println("logginguser in");
    }
    @SneakyThrows
    public void logOut(){
       try{ System.out.println("logginguser out");}
        catch(Exception ex){throw new Exception("unable to logout the user");}
    }


}
