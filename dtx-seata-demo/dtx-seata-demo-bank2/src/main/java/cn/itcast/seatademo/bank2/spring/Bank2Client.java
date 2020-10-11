package cn.itcast.seatademo.bank2.spring;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value="seata-demo-bank2")
public interface Bank2Client {

    //远程调用李四的微服务
    @GetMapping("/bank2/transfer")
    public String transfer(@RequestParam("amount") Double amount);
}
