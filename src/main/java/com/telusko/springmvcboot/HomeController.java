package com.telusko.springmvcboot;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.telusko.springmvcboot.Model.Alien;

@Controller
public class HomeController {
	@Autowired
	AlienRepo repo;
	
	@ModelAttribute
	public void modeldata(Model m) {
		m.addAttribute("name","Aliens");
	}
	
    @RequestMapping("/")
	public String home() {
		return "index";	
		
	}
    @RequestMapping("submit")
    public String add(@ModelAttribute("al") Alien a) {
    	
    	return "result";
    }
    
    
    
	@RequestMapping("addAlien")
	public String ali(@ModelAttribute("ali") Alien a) {	
		System.out.println("in alien method");
    	
    	
		return "result";
	}
	   
		@RequestMapping("getAlien")
		public String GetAliens(Model m) {	
			System.out.println("in alien method");
	    	
			m.addAttribute("result", repo.findAll());
			return "showaliens";
		}
	
		
		@RequestMapping("FindAlien")
		public String FindAliens(@RequestParam int aid,Model m) {	
			System.out.println("in alien method");
	    	
			m.addAttribute("result", repo.getOne(aid));
			return "showaliens";
		}
	 
		 @RequestMapping("dbadd")
		    public String adddb(@ModelAttribute("result") Alien a) {
		    	
			repo.save(a);
			 
		    	return "result";
		    }
		    
			@RequestMapping("DeleteAlien")
			public String DeleteAliens(@RequestParam int aid) {	
				System.out.println("in alien delete");
		    	
				repo.deleteById(aid);;
				return "showaliens";
			}
		
		/*@RequestMapping("findAlien")
		public String FindAliens(@RequestParam int aid,Model m) {	
			System.out.println("in alien method");
	    	
			m.addAttribute("result", repo.getOne(aid));
			return "Find";
		}
		*/
	
	
}
