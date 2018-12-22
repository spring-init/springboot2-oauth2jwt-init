package borrameref.demo.config.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;

@Configuration
@EnableAuthorizationServer
public class AuthorizationServerConfig {
//        extends AuthorizationServerConfigurerAdapter {
//    @Autowired
//    private AuthenticationManager authenticationManagerBean;
//
//    @Override
//    public void configure(ClientDetailsServiceConfigurer clients)
//            throws Exception {
//        clients.inMemory().withClient("angularjsapp").secret("{noop}angularjs123").authorizedGrantTypes("password").
//        scopes("read,write");
//    }

//    @Override
//    public void configure(AuthorizationServerEndpointsConfigurer
//                                  endpoints) throws Exception {
//        endpoints.authenticationManager(authenticationManagerBean);
//    }
}
