package com.ljh.ems.controller;

import com.ljh.ems.entity.User;
import com.ljh.ems.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;
import java.util.UUID;

@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("getCheckCodeImg")
    public void getCheckCode(HttpSession session, HttpServletResponse response) throws IOException {
        BufferedImage image = new BufferedImage(100,50,BufferedImage.TYPE_INT_RGB);
        //画验证码
        Graphics g = image.getGraphics();
        g.setColor(Color.GRAY);
        g.fillRect(0,0,100,50);
        g.setColor(Color.BLUE);
        g.drawRect(0,0,100-1,50-1);

        //add word
        String charset = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        Random random = new Random();
        String s1,s2,s3,s4;
        s1 = charset.charAt(random.nextInt(charset.length()))+"";
        s2 = charset.charAt(random.nextInt(charset.length()))+"";
        s3 = charset.charAt(random.nextInt(charset.length()))+"";
        s4 = charset.charAt(random.nextInt(charset.length()))+"";

        session.setAttribute("checkCode",s1+s2+s3+s4);

        g.drawString(s1,20,25);
        g.drawString(s2,40,25);
        g.drawString(s3,60,25);
        g.drawString(s4,80,25);

        //draw some lines
        g.setColor(Color.RED);
        for(int i=0;i<10;i++)
        {
            g.drawLine(random.nextInt(100),random.nextInt(50),random.nextInt(100),random.nextInt(50));
        }

        ImageIO.write(image,"jpg",response.getOutputStream());
    }

    @GetMapping("register")
    public String register(User user,String checkCode, HttpSession session)
    {
        //如果要跳转的话，这里的返回值貌似要是string
        //这里的user居然直接就给我赋值了，太叼了吧

        if(checkCode.equalsIgnoreCase((String) session.getAttribute("checkCode")))
        {
            //验证成功
            userService.save(user);
            return "redirect:/ems/login.jsp";
        }
        else
        {
            return "redirect:/ems/register.jsp";
        }
    }

    @GetMapping("login")
    public String login(User loginUser,HttpSession session)
    {
        User user = userService.login(loginUser);
        if(user == null)
        {
            return "redirect:/ems/login.jsp";
        }
        else
        {
            session.setAttribute("user",user);
            System.out.println("登陆成功，username is:"+user.getUsername());
            return "redirect:/ems/emplist.jsp";
        }

}


}
