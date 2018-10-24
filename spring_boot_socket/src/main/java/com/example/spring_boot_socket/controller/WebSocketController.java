package com.example.spring_boot_socket.controller;

import com.example.spring_boot_socket.config.WebSocketServer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
@RestController
public class WebSocketController {
     @RequestMapping("/socket/push")//推送数据接口
     public String pushMsg(HttpServletRequest request) {
         String message = request.getParameter("fuwu");
         try {
             WebSocketServer.sendInfo(message);
         } catch (IOException e) {
             e.printStackTrace();
         }
         return "success";
     }
}
