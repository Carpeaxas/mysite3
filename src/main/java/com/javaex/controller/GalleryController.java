package com.javaex.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.javaex.service.GalleryService;
import com.javaex.vo.GalleryVo;

@Controller
@RequestMapping(value="/gallery")
public class GalleryController {
	
	@Autowired
	private GalleryService galleryService;
	
	@RequestMapping(value="/list" , method= {RequestMethod.GET , RequestMethod.POST})	
	public String list(Model model) {
		
		System.out.println("GalleryController.list()");
		galleryService.list();
		
		return "/gallery/list";
	}
	
	@RequestMapping(value="/insert" , method= {RequestMethod.GET , RequestMethod.POST})
	public String insert(@ModelAttribute GalleryVo galleryVo) {
		galleryService.insert(galleryVo);
		
		return "redirect:/gallery/list";
	}

}
