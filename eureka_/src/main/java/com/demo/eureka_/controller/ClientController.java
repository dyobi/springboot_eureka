package com.demo.eureka_.controller;

import com.demo.eureka_.vo.SawonVo;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;

@Controller
public class ClientController {

    @Setter(onMethod = @__({@Autowired}))
    private RestTemplate restTemplate;

    @GetMapping("/")
    public String getAllSawon(Model model) {
        ResponseEntity<ArrayList<SawonVo>> response =
                restTemplate.exchange("http://insa-service/kaja", HttpMethod.GET, null, new
                        ParameterizedTypeReference<ArrayList<SawonVo>>() {});
        ArrayList<SawonVo> alist = response.getBody();

        assert alist != null;
        System.out.println(alist.get(0).getGreeting());
        model.addAttribute("malist", alist);
        return "index";
    }

}
