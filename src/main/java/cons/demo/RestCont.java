package cons.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestCont {
	
	@GetMapping("/hi")
	public String msg() {
		return "Hi Vivek.. This is your world.";
	}

}
