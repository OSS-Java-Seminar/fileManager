package com.example.seminar.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.seminar.model.DBFile;
import com.example.seminar.service.DBFileStorageService;

@Controller
public class MainController {
	
	@Autowired
    private DBFileStorageService dbFileStorageService;

    @GetMapping("/")
    public String root() {
        return "index";
    }

    @GetMapping("/login")
    public String login(Model model) {
        return "login";
    }

    @GetMapping("/user")
    public String userIndex() {
        return "user/index";
    }
    
    @GetMapping("/listFiles")
    public String listFiles(Model model) {
        List<DBFile> listFiles = dbFileStorageService.findAll();
        model.addAttribute("listFiles", listFiles);
         
        return "listFiles";
    }
    
    @GetMapping("/files/delete")
	public String deleteFiles(@RequestParam String id) {
		
    	dbFileStorageService.deleteById(id);
		
		return "redirect:/listFiles";
	}
}