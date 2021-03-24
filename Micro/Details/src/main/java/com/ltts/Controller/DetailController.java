package com.ltts.Controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.ltts.Models.Team;
@RestController
public class DetailController 
{
	@Autowired
	RestTemplate rt;
	
	@RequestMapping("/welcome")
    public String wel()
    {
    	return "welcome";
    }
	
	@GetMapping("/detail")
	public List<Team> getTeam()
	{
		ResponseEntity<Team> response = rt.getForEntity("http://localhost:8084/huy",Team.class);
				Team teams = response.getBody();
				List<Team> lt=Arrays.asList(teams);
				return lt;
	}

}
