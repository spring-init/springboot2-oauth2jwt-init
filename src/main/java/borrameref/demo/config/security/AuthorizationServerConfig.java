//package borrameref.demo.config.security;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
//import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
//import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
//import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerEndpointsConfigurer;
//import org.springframework.stereotype.Component;
//
//@Component
//public class AuthorizationServerConfig extends AuthorizationServerConfigurerAdapter {
////    @Autowired
////    private AuthenticationManager authenticationManagerBean;
//
//    @Override
//    public void configure(ClientDetailsServiceConfigurer clients)
//            throws Exception {
//        clients.inMemory().withClient("angularjsapp").secret("{noop}angularjs123").authorizedGrantTypes("password").
//        scopes("read,write");
//    }
//
////    @Override
////    public void configure(AuthorizationServerEndpointsConfigurer
////                                  endpoints) throws Exception {
////        endpoints.authenticationManager(authenticationManagerBean);
////    }
//}
