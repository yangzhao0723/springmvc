package com.shinowit.web;

import com.shinowit.entity.UserEntity;
import com.shinowit.framework.dao.BaseDAO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * Created by Administrator on 2014/12/17.
 */
@Controller
public class LoginController {
    @Resource
    private BaseDAO<UserEntity> dao;

    @RequestMapping(value = "/test2")
    @ResponseBody
    public String login (UserEntity user ,Map map){
      List<UserEntity> userlist= dao.findByHql1("from UserEntity where username=? and userpass=?", user.getUsername(), user.getUserpass());
        if(userlist.size()>0){

        }else {

        }
        return "";
        }

@RequestMapping(value = "/test3")
    public ModelAndView test3(String username,String userpass ){
        ModelAndView result=new ModelAndView("/test3");
         result.addObject("username",username);
         result.addObject("userpass",userpass);
          return result;
    }
    @RequestMapping(value="t1")
    public ModelAndView   t1(){
        List<UserEntity> user_list= dao.listAll(UserEntity.class);
        ModelAndView result=new ModelAndView("/test3");
        result.addObject("stu_data_list",user_list);
        return result;
    }
}
