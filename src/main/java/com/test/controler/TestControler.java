package com.test.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RestController;

import com.test.model.Test;
import com.test.service.TestRepoService;

@Controller
public class TestControler {
	@Autowired 
	private TestRepoService testRepoService = new TestRepoService();
	
	@GetMapping("/init")
    public void init() {
		testRepoService.init();
    }
	
	
	
	@GetMapping("/testsT")
    public String getTests(Model model,
            @PageableDefault(size = 100, sort = "tcCount", direction = Sort.Direction.DESC) Pageable pageable) {
        model.addAttribute("testst", testRepoService.getAllTest(pageable));
        return "testsT";
	}
	
	@GetMapping("/")
	    String home() {
	        return "index";
	    }
	    
}
