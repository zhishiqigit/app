package com.dao;

import java.util.HashMap;
import java.util.List;

public interface BaseDao<T> {
	int insert(T obj);
	T find(int i);
	List<T> find_by_sql(String sql);
	List<T> find_by_params(HashMap<String,String> hashParams);
	int destory(T obj);
	int destory(int i);
	int destory_by_params(HashMap<String,String> hashParams);
	int update(T obj);
	int update(List<T> obj_list);
	int update(HashMap<String,String> setVal,HashMap<String,String> hashParams);
}
