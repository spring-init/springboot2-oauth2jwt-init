package borrameref.demo.config.security;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@EnableWebSecurity
@EnableResourceServer
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

//    @Autowired
//    private UserDetailsService userDetailsService;
//@Bean
//public PasswordEncoder passwordEncoder() {
//    return new BCryptPasswordEncoder();
//}

//    @Override
//    protected void configure(AuthenticationManagerBuilder auth) throws
//            Exception {
//        auth.inMemoryAuthentication().withUser("user").password("{noop}password").roles("USER")
//                .and().withUser("admin").password("password").roles("USER", "ADMIN");
////        auth.userDetailsService(userDetailsService);
//    }
    @Bean
    public UserDetailsService userDetailsService() {
        InMemoryUserDetailsManager manager = new InMemoryUserDetailsManager();
        manager.createUser(User.withDefaultPasswordEncoder().username("user").password("password").roles("USER").build());
        return manager;
    }
//    @Override
//    @Bean
//    public AuthenticationManager authenticationManagerBean() throws
//            Exception {
//        return super.authenticationManagerBean();
//    }

//    @Override
//    public void configure(HttpSecurity http) throws Exception {
//        http.csrf().disable().exceptionHandling()
//                .authenticationEntryPoint(
//                        (request, response, authException) -> response.sendError(HttpServletResponse.SC_UNAUTHORIZED))
//                .and().authorizeRequests().antMatchers("/**").authenticated().and().httpBasic();
//    }

}
