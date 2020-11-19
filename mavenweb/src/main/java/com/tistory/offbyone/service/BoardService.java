package com.tistory.offbyone.service;

import java.util.List;

public interface BoardService {
	List<BoardVO> selectBoardList() throws Exception;
}
