package com.ljh.ems.controller;

import com.ljh.ems.entity.Emp;
import com.ljh.ems.entity.User;
import com.ljh.ems.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.UUID;

@Controller
@RequestMapping("emp")
public class EmpController {

    @Autowired
    EmpService empService;

    @GetMapping("findAll")
    String findAll(Model model)
    {
        model.addAttribute("empList",empService.findAll());
        return "ems/emplist";  //不是重定向前面不加/ 后面不加jsp
    }

    @GetMapping("add")
    String add(Emp emp)
    {
        emp.setId(UUID.randomUUID().toString());
        empService.add(emp);
        return "redirect:/emp/findAll";  //重定向要把地址给全
    }

    @GetMapping("delete")
    String delete(String id)
    {
        empService.delete(id);
        return "redirect:/emp/findAll";
    }

}
