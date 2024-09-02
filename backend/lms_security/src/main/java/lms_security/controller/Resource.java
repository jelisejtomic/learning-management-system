package lms_security.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Resource {
	@Secured("ROLE_ADMIN")
	@GetMapping(path = "/api/resource")
	public ResponseEntity<String> secured() {
		return new ResponseEntity<String>("OK!", HttpStatus.OK);
	}
}
