package com.demo.eureka_client.controller;

import com.demo.eureka_client.vo.SawonVo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class ClientController {

    public static ArrayList<SawonVo> sawonList;

    static {
        sawonList = new ArrayList<>();
        sawonList.add(new SawonVo(1, "hong", "010-1231-2999", "안녕!!!"));
        sawonList.add(new SawonVo(1, "choi", "010-4432-1234", "굿모닝!!!"));
        sawonList.add(new SawonVo(1, "kim", "010-1631-6694", "반가워용~!!!"));
        sawonList.add(new SawonVo(1, "lee", "010-9917-2886", "ㅎㅇ!"));
    }

    @GetMapping("/kaja")
    public ArrayList<SawonVo> getAllSawons() {
        return sawonList;
    }

}
