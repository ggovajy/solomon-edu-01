package com.tistory.offbyone.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tistory.offbyone.service.BoardService;
import com.tistory.offbyone.service.BoardVO;

@Service("boardService")
@Transactional
public class BoardServiceImpl implements BoardService {
	
	@Autowired
	private BoardDAO boardDao;

	@Override
	public List<BoardVO> selectBoardList() throws Exception {
		//boardDao.insertBoard(3);
		//boardDao.insertBoard(3);
		return boardDao.selectBoardList();
	}

}
