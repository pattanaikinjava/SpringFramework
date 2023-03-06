package in.dev.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

@ComponentScan(basePackages = "in.dev")
@PropertySource({"classpath:myapp.properties","classpath:dbapp.yml"})
public class ConfigPackage
{

}
