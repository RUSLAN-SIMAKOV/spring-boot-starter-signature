package ruslan.simakov.signature.starter.autoconfigure;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("ruslan.simakov.signature.starter")
@ConditionalOnProperty(value = "signature.enable", havingValue = "true", matchIfMissing = true)
//could switch on property, ifTrue or doesn't exist - would be switch on
public class SignatureAutoConfiguration {
}
