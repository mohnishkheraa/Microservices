package com.ltts.Team;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TeamController 
{
	@Autowired
	Teamdao td= new Teamdao();
	 @RequestMapping("/welcome")
	    public String wel()
	    {
	    	return "welcome";
	    }
	@GetMapping("/huy")
	public List<Team> show()
	{
		List<Team> li=td.getTeam();
		return li;
	}
}
