package dio_springboot.spring_ioc_di_beans_autowired.app;

import com.google.gson.Gson;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Beans {
    @Bean
    public Gson gson(){
        return new Gson();
    }
}