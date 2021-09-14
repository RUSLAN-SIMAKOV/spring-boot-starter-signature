package ruslan.simakov.signature.starter.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ruslan.simakov.signature.starter.autoconfigure.SignatureProperties;

import java.time.Duration;

@RestController
public class SignatureController {

    private static final Logger LOG = LoggerFactory.getLogger(SignatureController.class);

    private final String username;
    private final Duration retentionPeriod;

    SignatureController(//@Value("${signature.username:NONAME}") String username,
                        //@Value("${signature.extra.retention-period:5m}") Duration retentionPeriod){
                        SignatureProperties properties
    ) {
        this.username = properties.getUsername();
        this.retentionPeriod = properties.getExtra().getRetentionPeriod();
        LOG.info("Using following configuration: username - {}, retention period - {}", username, retentionPeriod);
    }

    @GetMapping("signature")
    public String getSignature() {
        return "Best regards";
    }
}
