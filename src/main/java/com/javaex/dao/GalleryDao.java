package com.javaex.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.javaex.vo.GalleryVo;

@Repository
public class GalleryDao {

	@Autowired
	private SqlSession sqlSession;
	
	public void selectlist() {
		System.out.println("GalleryDao.selectlist()");
		
	}
	public int insert(GalleryVo galleryVo) {
		System.out.println("GalleryDao.insert()");
		
		int count =  sqlSession.insert("gallery.insert", galleryVo);
		System.out.println(galleryVo);
	
		return count;
	}
	
}
