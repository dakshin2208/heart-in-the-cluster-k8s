package k8n_cluster.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class App_Controller {

    @GetMapping("/works")
    public String WorksSucessfull() {
        return "Congratulations!!! we successfully deployed! appilication in kubernetes...!❤️";
    }
}
