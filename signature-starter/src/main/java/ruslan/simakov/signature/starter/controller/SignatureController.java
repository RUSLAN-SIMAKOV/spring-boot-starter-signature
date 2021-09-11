package ruslan.simakov.signature.starter.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SignatureController {

    @GetMapping("signature")
    public String getSignature() {
        return "Best regards";
    }
}
