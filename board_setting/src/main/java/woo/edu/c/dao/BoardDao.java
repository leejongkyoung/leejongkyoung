package woo.edu.c.dao;

import java.util.List;

import woo.edu.c.vo.boardVo;
import woo.edu.c.vo.testVo;

public interface BoardDao {

	List<testVo> test();
	List<boardVo> board();
	int insertContent(boardVo vo);
	List<boardVo> selectBoardList();
	boardVo selectBoardDetailByBoardNo(int boardNo);
	int deletedBoardByBN(int boardNo);
	int updateContent(boardVo vo);
	int checkDelete(int selNo);
	int mergeInto(boardVo vo);

}
