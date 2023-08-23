package click.pranjalonline.testspring;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/greet")
public class MyController {
    @GetMapping("/")
    public ResponseEntity<?> greet(){
        return new ResponseEntity<String>("Hellow", HttpStatus.OK);
    }
}
