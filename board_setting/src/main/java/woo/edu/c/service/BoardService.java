package woo.edu.c.service;

import java.util.List;

import woo.edu.c.vo.boardVo;
import woo.edu.c.vo.testVo;

public interface BoardService {

	List<testVo> test();
	List<boardVo> board();
	int insertContent(boardVo vo);
	int updateContent(boardVo vo);
	List<boardVo> selectBoardList();
	boardVo selectBoardDetailByBoardNo(int boardNo);
	int deletedBoardByBN(int boardNo);
	int checkDelete(int selNo);
	
	int mergeInto(boardVo vo);
	
}
