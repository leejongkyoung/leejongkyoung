package woo.edu.c.service;

import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import woo.edu.c.controller.HomeController;
import woo.edu.c.dao.BoardDao;
import woo.edu.c.vo.boardVo;
import woo.edu.c.vo.testVo;


@Service
public class BoardServiceImpl implements BoardService{
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Resource
	private BoardDao boardDao;

	@Override
	public List<testVo> test() {
		return boardDao.test();
	}
	
	@Override
	public List<boardVo> board() {
		return boardDao.board();
	}

	@Override
	public int insertContent(boardVo vo) {
		return boardDao.insertContent(vo);
	}

	@Override
	public List<boardVo> selectBoardList() {
		List<boardVo> boardList = boardDao.selectBoardList();
		return boardList;
	}

	
	@Override
	public boardVo selectBoardDetailByBoardNo(int boardNo) {
		boardVo boardDetail = boardDao.selectBoardDetailByBoardNo(boardNo);
		return boardDetail;
	}

	@Override
	public int deletedBoardByBN(int boardNo) {
		return boardDao.deletedBoardByBN(boardNo);
		
	}

	@Override
	public int updateContent(boardVo vo) {
		return boardDao.updateContent(vo);
	}

	@Override
	public int checkDelete(int selNo) {
		return boardDao.checkDelete(selNo);
	}

	@Override
	public int mergeInto(boardVo vo) {
		return boardDao.mergeInto(vo);
	}



}
