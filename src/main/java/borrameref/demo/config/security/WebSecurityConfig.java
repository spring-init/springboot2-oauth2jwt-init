//package borrameref.demo.config.security;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
//
//import javax.servlet.http.HttpServletResponse;
//
//@Configuration
//@EnableWebSecurity
//@EnableAuthorizationServer
//public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
//
////    @Autowired
////    private UserDetailsService userDetailsService;
////@Bean
////public PasswordEncoder passwordEncoder() {
////    return new BCryptPasswordEncoder();
////}
//
//    @Override
//    protected void configure(AuthenticationManagerBuilder auth) throws
//            Exception {
//        auth.inMemoryAuthentication().withUser("user").password("{noop}password").roles("USER")
//                .and().withUser("admin").password("password").roles("USER", "ADMIN");
////        auth.userDetailsService(userDetailsService);
//    }
//
//    @Override
//    @Bean
//    public AuthenticationManager authenticationManagerBean() throws
//            Exception {
//        return super.authenticationManagerBean();
//    }
//
////    @Override
////    public void configure(HttpSecurity http) throws Exception {
////        http.csrf().disable().exceptionHandling()
////                .authenticationEntryPoint(
////                        (request, response, authException) -> response.sendError(HttpServletResponse.SC_UNAUTHORIZED))
////                .and().authorizeRequests().antMatchers("/**").authenticated().and().httpBasic();
////    }
//
//}
