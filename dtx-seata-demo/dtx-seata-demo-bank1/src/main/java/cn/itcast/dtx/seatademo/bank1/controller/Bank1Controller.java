package cn.itcast.dtx.seatademo.bank1.controller;

import cn.itcast.dtx.seatademo.bank1.service.AccountInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Bank1Controller {

    @Autowired
    AccountInfoService accountInfoService;

    //张三转账
    @GetMapping("/transfer")
    public String taransfer(Double amount){
        accountInfoService.updateAccountInfo("1",amount);
        return "bank1: "+amount;
    }
}
