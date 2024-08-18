package lms_mikroservis.controller;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;
import com.netflix.discovery.shared.Application;

import lms_mikroservis.dto.FakultetDTO;
import lms_mikroservis.dto.NastavniMaterijalDTO;

@Controller
public class TestController {
	@Autowired
	private EurekaClient discoveryClient;

	@RequestMapping(path = "/mikroservis", method = RequestMethod.GET)
	public ResponseEntity<String> test() {
		return new ResponseEntity<String>("MikroServis 1 novo", HttpStatus.OK);
	}

	@RequestMapping(path = "/mikroJelisej", method = RequestMethod.GET)
	public ResponseEntity<NastavniMaterijalDTO> test1() {
		try {
		String ur = discoveryClient.getNextServerFromEureka("NEREG2", false).getHomePageUrl();
		ur += "api/j/nastavniMaterijali/1";
		RestTemplate restTemplate = new RestTemplate();

		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));

		HttpEntity<String> entity = new HttpEntity<>("parameters", headers);
		ResponseEntity<NastavniMaterijalDTO> result = restTemplate.exchange(ur, HttpMethod.GET, entity,
				NastavniMaterijalDTO.class);

		System.out.println(result.getBody().toString());
		System.out.println(result.getBody().getNaziv());
		System.out.println("radi preko get getnext server-a");

		return new ResponseEntity<NastavniMaterijalDTO>(result.getBody(), HttpStatus.OK);
		} catch (Exception e) {
			System.out.println("ne radi preko get getnext server-a: " + e);
			return new ResponseEntity<NastavniMaterijalDTO>(HttpStatus.BAD_REQUEST);
	}

	}

	@RequestMapping(path = "/mikroNatasa", method = RequestMethod.GET)
	public ResponseEntity<FakultetDTO> test2() {

//		List<Application> applications = discoveryClient.getApplications().getRegisteredApplications();
//
//	    for (Application application : applications) {
//	        List<InstanceInfo> applicationsInstances = application.getInstances();
//	        for (InstanceInfo applicationsInstance : applicationsInstances) {
//
//	            String name = applicationsInstance.getAppName();
//	            String url = applicationsInstance.getHomePageUrl();
////	            System.out.println("host name: " + applicationsInstance.getHostName());
////	            System.out.println(name + ": " + url);
//	            
//	        }
//	    }

		try {
			String ur = discoveryClient.getNextServerFromEureka("NEREG1", false).getHomePageUrl();
			ur += "api/n/fakulteti/1";
			RestTemplate restTemplate = new RestTemplate();

			HttpHeaders headers = new HttpHeaders();
			headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
//			headers.add("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/54.0.2840.99 Safari/537.36");

			HttpEntity<String> entity = new HttpEntity<>("parameters", headers);
			ResponseEntity<FakultetDTO> result = restTemplate.exchange(ur, HttpMethod.GET, entity, FakultetDTO.class);

			System.out.println(result.getBody().toString());
			System.out.println(result.getBody().getDekan());
			System.out.println(result.getBody().getNaziv());
			System.out.println("radi preko get getnext server-a");

			return new ResponseEntity<FakultetDTO>(result.getBody(), HttpStatus.OK);
		} catch (Exception e) {
			System.out.println("ne radi preko get getnext server-a: " + e);
		}

		return new ResponseEntity<FakultetDTO>(HttpStatus.BAD_REQUEST);
	}

}
