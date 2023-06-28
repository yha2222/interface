package ddit.chap08.sec01;

import java.util.ArrayList;
import java.util.List;

public class JDBCUtil {
	private static JDBCUtil instance = null;
	private JDBCUtil() {}
	public static JDBCUtil getInstance() {
		if(instance == null) instance = new JDBCUtil();
		return instance;
	}
	
	List<String> selectOne(String sql){
		List<String> list = new ArrayList<String>();
		return list;
	}
	
	int update(String sql, List<String> param) {
		int res = 0;
		return res;
	}
}
