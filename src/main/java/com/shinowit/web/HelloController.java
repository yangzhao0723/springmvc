package com.shinowit.web;

import com.shinowit.entity.UserEntity;
import com.shinowit.framework.dao.BaseDAO;
import org.hibernate.engine.spi.Mapping;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2014/12/17.
 */
@Controller
public class HelloController {
@Resource
private BaseDAO<UserEntity> dao;
  @RequestMapping(value="/test")
    public String test( Model model){
        model.addAttribute("name","张三");
        return "success";
    }

    @RequestMapping(value = "/testjson")
    @ResponseBody
    public List<UserEntity> testjson(){
        return dao.listAll(UserEntity.class);
    }

}
