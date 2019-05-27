package Main.Home;

import org.springframework.web.bind.annotation.GetMapping;

public class Home {

    @GetMapping("/")
    public String getIndex() {
        return "index";
    }
}
