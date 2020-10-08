package cn.fudan.controller;

import cn.fudan.entity.User;
import cn.fudan.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("api/v1/student")
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("/findAll")
    public ModelAndView jspTest(ModelAndView modelAndView){
        List<User> users = userService.findAll();
        modelAndView.addObject("students", users);
        modelAndView.setViewName("student");
        return modelAndView;
    }
    @RequestMapping("deleteUser")

    public String deleteUser(@RequestParam("id") String studentId){
        userService.deleteUserById(studentId);
        return "redirect:findAll";
    }
    @RequestMapping(value = "saveUser" , method = RequestMethod.POST)
    public String saveUser(User user){
        userService.Save(user);
        return "redirect:findAll";
    }
    @RequestMapping("updateUser")
    public ModelAndView updateUser(@RequestParam("id") String id){
        ModelAndView md=new ModelAndView();
        User user = userService.selectOneById(id);
        md.addObject("user",user);
        md.setViewName("student-update");
        return md;
    }
    @RequestMapping("updateUserById")
    public String updateUserById(User user){
        userService.updateUserById(user);
        return "redirect:findAll";
    }
}
