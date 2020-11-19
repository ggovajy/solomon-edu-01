package com.tistory.offbyone.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tistory.offbyone.service.BoardService;
import com.tistory.offbyone.service.BoardVO;

@Controller
public class MainController {
	
	@Resource(name = "boardService")
	private BoardService boardService;

	@RequestMapping("/main/home.do")
	public String home() {
		return "main/home";
	}
	
	@RequestMapping(value = "/board/boardList.do")
	public String boardList(Model model) throws Exception {

	    List<BoardVO> list = boardService.selectBoardList();

	    model.addAttribute("list", list);

	    return "board/boardList";
	}
}
