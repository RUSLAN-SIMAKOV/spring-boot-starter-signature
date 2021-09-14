package ruslan.simakov.signature.starter.autoconfigure;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("ruslan.simakov.signature.starter")
@EnableConfigurationProperties(SignatureProperties.class)
@ConditionalOnProperty(value = "signature.enable", havingValue = "true", matchIfMissing = true)
//could switch on property, ifTrue or doesn't exist - would be switch on
public class SignatureAutoConfiguration {
}
