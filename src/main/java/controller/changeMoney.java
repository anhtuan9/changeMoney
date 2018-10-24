package controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class changeMoney {
    @GetMapping("/")
    public String home(){
        return "index";
    }
    @PostMapping
    public String change(@RequestParam("vnd") Double vnd, Model model){
        double usd = vnd / 22000;
        model.addAttribute("usd", usd);
        return "changed";
    }
}
