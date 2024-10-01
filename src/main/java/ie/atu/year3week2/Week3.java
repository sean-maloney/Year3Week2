package ie.atu.year3week2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/person")
public class Week3 {

    @GetMapping("/message")
    public String getMessage() {

        return "Some Message";
    }
    @GetMapping("/details")
    public String getDetails() {

        return "Some other Message";
    }
}
