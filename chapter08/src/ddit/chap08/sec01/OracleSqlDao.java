package ddit.chap08.sec01;

import java.util.List;

public class OracleSqlDao implements DataAccessObject {
	JDBCUtil jdbc = JDBCUtil.getInstance();

	@Override
	public void select(String sql) {
		List<String> res = jdbc.selectOne(sql);
		
	}

	@Override
	public int insert(String sql, List<String> param) {
		return jdbc.update(sql, param);
	}
	
}
