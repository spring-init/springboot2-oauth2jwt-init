package borrameref.demo.config.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.oauth2.common.DefaultOAuth2AccessToken;
import org.springframework.security.oauth2.common.OAuth2AccessToken;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.security.oauth2.provider.token.TokenStore;
import org.springframework.security.oauth2.provider.token.store.JwtAccessTokenConverter;
import org.springframework.security.oauth2.provider.token.store.JwtTokenStore;

import java.util.LinkedHashMap;
import java.util.Map;

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

    @Bean
    public TokenStore tokenStore() {
        return new JwtTokenStore(accessTokenConverter());
    }

    @Bean
    public JwtAccessTokenConverter accessTokenConverter() {
        JwtAccessTokenConverter converter = new JwtAccessTokenConverter(){
            @Override
            public OAuth2AccessToken enhance(OAuth2AccessToken accessToken, OAuth2Authentication authentication) {
                User user = (User) authentication.getPrincipal();

                Map<String, Object> info = new LinkedHashMap<String, Object>(accessToken.getAdditionalInformation());

                info.put("role",user.getAuthorities().iterator().next());
                info.put("expired",user.isAccountNonExpired());

                DefaultOAuth2AccessToken customAccessToken = new DefaultOAuth2AccessToken(accessToken);
                customAccessToken.setAdditionalInformation(info);
                return super.enhance(customAccessToken, authentication);
            }
        };
        converter.setSigningKey("123");
        return converter;
    }
}
