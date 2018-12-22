package borrameref.demo.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("demo")
public class DemoController {

    @RequestMapping("service")
    public Date service() {
        return new Date();
    }
}
