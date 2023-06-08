package com.javaex.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaex.dao.GalleryDao;
import com.javaex.vo.GalleryVo;



@Service
public class GalleryService {
	
	@Autowired
	private GalleryDao galleryDao;
	
	public void list() {
		System.out.println("GalleryService.list()");
		
		galleryDao.selectlist();
			
	}
	
	public int insert(GalleryVo galleryVo) {
		System.out.println("GalleryService.insert()");
		int count = galleryDao.insert(galleryVo);
		System.out.println(galleryVo);
		return count;
		
	}
}
