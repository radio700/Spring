package sj.artificial.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/get-api")

public class GetController {
    
    //http://localhost:8080/api/v1/get-api

    @GetMapping(value = "/name")//쌩 맵으로 받을 때
    public String gethello(){ 
        return "namememe";
    }

    


}
