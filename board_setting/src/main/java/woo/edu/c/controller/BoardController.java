package woo.edu.c.controller;

import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import woo.edu.c.service.BoardService;
import woo.edu.c.vo.boardVo;

@Controller
public class BoardController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Inject
	private BoardService boardService;
	
	@RequestMapping(value = "/board/home")
	public String home(Model model, HttpServletRequest req, HttpServletResponse res) throws Exception {
		logger.info("/board/home");
		return "home";
	}
	
	// test
	@RequestMapping(value = "/board/test", method = RequestMethod.GET)
	public String boardList(Model model) throws Exception {
		logger.info("/board/test");
		return "/board/test";
	}
	
	@RequestMapping(value = "/board/calc", method = RequestMethod.GET)
	public String calc(Model model) throws Exception {
		logger.info("/board/calc");
		return "/board/calc";
	}
	
	@RequestMapping(value = "/board/sked", method = RequestMethod.GET)
	public String sked(Model model) throws Exception {
		logger.info("/board/sked");
		return "/board/sked";
	}
	
	@RequestMapping(value = "/board/boardList", method = RequestMethod.GET)
	public String showBoardList(Model model) throws Exception {
		logger.info("/board/boardList");
		List<boardVo> boardList = boardService.selectBoardList();
		model.addAttribute("boardList", boardList);
		return "/board/boardList";
	}

	@RequestMapping(value = "/board/boardDetail", method = RequestMethod.GET)
	public String showBoardDetail(@RequestParam(name = "boardNo", defaultValue = "-1")int boardNo,
								  Model model) throws Exception {
		logger.info("/board/boardDetail");
		if (boardNo == -1) {
			return "redirect:/board/boardList";
		}
		boardVo boardDetail = boardService.selectBoardDetailByBoardNo(boardNo);
		System.out.println("boardDetail==="+boardDetail);
		model.addAttribute("boardDetail", boardDetail);
		return "/board/boardDetail";
	}
	
	@GetMapping(path = {"/board/writeContent"})
	public String writeForm() {
		return "/board/writeContent";
		
	}
	
	@PostMapping(path = {"/board/writeContent"})
	public String write(boardVo vo) {
		System.out.println("vo====="+vo);
		boardService.mergeInto(vo);
//		boardService.insertContent(vo);
		return "redirect:/board/boardList";
	}
	
//	@PostMapping(path = { "/remove-post" }, produces = {"application/json;charset=utf-8"})
//	@ResponseBody
//	public String deletedBoard(@RequestParam(name = "boardNo", defaultValue = "-1")int boardNo) {
//		if (boardNo == -1) {
//			return "redirect:/board/boardList";
//		}
//		System.out.println("boardNo==="+boardNo);
//		boardService.deletedBoardByBN(boardNo);
//		return "success";
//	}
	
	@RequestMapping(value = "/board/boardDelete")
	public String deletedBoard(@RequestParam(name = "boardNo")int boardNo) {
		boardService.deletedBoardByBN(boardNo);
		return "redirect:/board/boardList";
	}
	
	
	@GetMapping(path = {"/board/editBoard"})
	public String editForm(@RequestParam(name = "boardNo", defaultValue = "-1")int boardNo, 
						   Model model) {
		//System.out.println("vo====="+vo);
		System.out.println("boardNo===" + boardNo);
		if (boardNo == -1) {
			return "redirect:/board/boardList";
		}
		boardVo boardList = boardService.selectBoardDetailByBoardNo(boardNo);
		model.addAttribute("boardList", boardList);
		return "/board/editBoard";
		
	}
	
	@PostMapping(path = {"/board/editContent"})
	public String editContent(boardVo vo) {
		System.out.println("vo====="+vo);
		boardService.mergeInto(vo);
//		boardService.updateContent(vo);
		return "redirect:/board/boardList";
	}
	
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	// Ajax 게시판
	
	@RequestMapping(value = "/board/ajaxBoard", method = RequestMethod.GET)
	public String ajaxBoardListForm(Model model) {
		List<boardVo> list = boardService.selectBoardList();
		model.addAttribute("list", list);
		return "/board/ajaxBoard";
	}
	
	@ResponseBody
	@RequestMapping(value = "/board/ajaxBoardList", method = RequestMethod.GET)
	public List<boardVo> ajaxBoardList() {
		List<boardVo> list = boardService.selectBoardList();
		System.out.println("list==="+list);
		return list;
	}
	
	@ResponseBody
	@RequestMapping(value = "/board/deletedPost", method = RequestMethod.GET)
	public String ajaxBoardDeleted(@RequestParam(name = "boardNo")int boardNo) {
		boardService.deletedBoardByBN(boardNo);
		return "success";
	}
	
	@ResponseBody
	@RequestMapping(value = "/board/ajaxBoardDetail", method = RequestMethod.GET)
	public boardVo ajaxBoardDetail(@RequestParam(name = "boardNo")int boardNo) {
		boardVo boardDetail = boardService.selectBoardDetailByBoardNo(boardNo);
		System.out.println("boardNo===="+boardNo);
		System.out.println("boardDetail==="+ boardDetail);
		return boardDetail;
	}
	
//	@ResponseBody
//	@PostMapping(path = {"/board/ajaxWriteContent"}, produces = {"application/json;charset=utf-8"})
//	public String ajaxWrite(boardVo vo) {
//		System.out.println("vo====="+vo);
//		boardService.insertContent(vo);
//		return "success";
//	}
	
	@ResponseBody
	@PostMapping(path = {"/board/ajaxWriteContent"}, produces = {"application/json;charset=utf-8"})
	public Object ajaxWrite(@RequestBody boardVo vo) {
		System.out.println("vo====="+vo);
		boardService.insertContent(vo);
		return vo;
	}


//	@ResponseBody
//	@PostMapping(path = {"/board/ajaxWriteContent"}, produces = {"application/json;charset=utf-8"})
//	public String checkDelete(@RequestParam(name = "sel-no")String selNo) {	
//		String[] checkList = selNo.split(",");
//		System.out.println("selNo===="+selNo);
//		for (String no : checkList) {
//			boardService.checkDelete(Integer.parseInt(no));
//		}		
//		return selNo;
//	}
	
//	@ResponseBody
//	@RequestMapping(value="/board/checkDelete", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
//	public String checkDelete(HttpServletRequest request, @RequestParam(value="selNos", required=false)String selNos) {
//		String[] checkList = selNos.split(",");
//	    for(String selNo : checkList){
//	    	boardService.checkDelete(Integer.parseInt(selNo));
//	    }
//	    System.out.println("select Number === " + checkList);
//	  return "success";
//	}
	
	@ResponseBody
	@RequestMapping(value = "/board/checkDelete", method = RequestMethod.GET)
	public String checkDelete(@RequestParam(value = "selNos[]")	List<Integer> selNos) {
		System.out.println("selNos==="+selNos);
		for(int bNo : selNos) {
			System.out.println(bNo);
			boardService.checkDelete(bNo);
		}
//		public String checkDelete(@RequestParam(name = "selNos")String selNos) {
//		String[] checkList = selNos.split(",");
//		for(String selNo : checkList) {
//			boardService.checkDelete(Integer.parseInt(selNo));
//		}
//		  System.out.println("select Number === " + checkList);
		return "success";
	}
	
}




