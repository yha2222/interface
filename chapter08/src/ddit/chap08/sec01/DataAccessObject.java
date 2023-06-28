package ddit.chap08.sec01;

import java.util.List;

public interface DataAccessObject {
	public abstract void select(String sql);
	int insert(String sql, List<String> param);
}
