package guru.springframework.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping({"", "/", "index", "index.html"})//Bu dördünden bir URL de match olursa buraya girer
    public String index(){
        return "index";
    }

    @RequestMapping({"/oups"})
    public String oupsHandler(){
        return "notimplemented";
    }
}
