package com.javaex.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaex.dao.BoardDao;
import com.javaex.vo.BoardVo;

@Service
public class BoardService {

	@Autowired
	private BoardDao boardDao;
	
	/* 페이징 게시판 */
	public Map<String , Object> getList3(int crtPage) {
		System.out.println("BoardService.getList()");
		System.out.println(crtPage);
		
		crtPage = (crtPage>=1) ? crtPage : (crtPage=1);
	
		//페이지 당 글 갯수
		int listCnt =10;
		int totalCount = boardDao.totalCount();
		
		//시작 페이지
		int startRnum = ((crtPage-1) * listCnt) +1;
		
		int endRnum = (startRnum +listCnt)-1;
		List<BoardVo> boardList = boardDao.selectList3(startRnum , endRnum);
		
		int pageBtnCount =5;
		int endPageBtnNo = (int)Math.ceil(crtPage / (double)pageBtnCount) * pageBtnCount;		
		
		int startPageBtnNo = (endPageBtnNo - pageBtnCount) +1;
		
		//다음 화살표
		boolean next =false;
		if((endPageBtnNo * listCnt)< totalCount) {
			next= true;
		}else {
			next = false;
			endPageBtnNo = (int)Math.ceil(totalCount/(double)listCnt);
		}
		
		boolean prev = false;
		if (startPageBtnNo!=1) {
			prev = true;
		}
		Map<String , Object> pMap = new HashMap<String , Object>();
		pMap.put("prev", prev);
		pMap.put("startPageBtnNo", startPageBtnNo);
		pMap.put("endPageBtnNo", endPageBtnNo);
		pMap.put("next", next);
		pMap.put("boardList", boardList);
		
		return pMap;
	}
	
	/* 게시판 리스트: 검색기능 포함 */
	public List<BoardVo> getList2(String keyword) {
		System.out.println("BoardService.getList2()");
		
		List<BoardVo> boardList = boardDao.selectList2(keyword);
		
		return boardList;
	}
	
	
	/* 게시판 리스트: 검색기능 X */
	public List<BoardVo> getList() {
		System.out.println("BoardService.getList()");
		
		List<BoardVo> boardList = boardDao.selectList();
		
		return boardList;
	}
	
	
	
	
	// 글쓰기
	public int addBoard(BoardVo boardVo) {
		System.out.println("BoardService.addBoard()");

		int count = boardDao.insertBoard(boardVo);
		return count;
	}
	
	
}
