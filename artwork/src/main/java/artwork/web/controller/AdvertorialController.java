package artwork.web.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import artwork.service.AdvertorialService;

@Controller
@RequestMapping("/advertorial")
public class AdvertorialController {
	@Resource
	AdvertorialService advertorialService;
	
	@RequestMapping(value="/add",params={"id"})
	public String addAdvertorial(int id)
	{
		advertorialService.addAdvertorial(id);
		return "success"; 
	}
}
