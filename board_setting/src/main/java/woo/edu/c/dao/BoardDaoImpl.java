package woo.edu.c.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import woo.edu.c.controller.HomeController;
import woo.edu.c.vo.boardVo;
import woo.edu.c.vo.testVo;

@Repository
public class BoardDaoImpl implements BoardDao {
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	// mybatis
	@Inject
	private SqlSession sql;
	
	private static String namespace = "boardMapper";

	@Override
	public List<testVo> test() {
		return sql.selectList(namespace + ".test");
	}
	
	@Override
	public List<boardVo> board() {
		return sql.selectList(namespace + ".board"); 
	}
	

	@Override
	public int insertContent(boardVo vo) {
		return sql.insert(namespace + ".boardInsert", vo);
		
	}
	
	@Override
	public List<boardVo> selectBoardList() {
		return sql.selectList(namespace + ".board"); 
	}

	@Override
	public boardVo selectBoardDetailByBoardNo(int boardNo) {
		return sql.selectOne(namespace + ".selectBoardDetailByBoardNo", boardNo); 
	}

	@Override
	public int deletedBoardByBN(int boardNo) {
		return sql.delete(namespace + ".deletedBoard", boardNo);
		
	}

	@Override
	public int updateContent(boardVo vo) {
		return sql.update(namespace + ".updateContent", vo);
	}

	@Override
	public int checkDelete(int selNo) {
		return sql.delete(namespace + ".checkDelete", selNo);
	}

	@Override
	public int mergeInto(boardVo vo) {
		return sql.update(namespace + ".merge", vo);
	}



	
}
