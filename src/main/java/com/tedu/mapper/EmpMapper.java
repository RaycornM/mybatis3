package com.tedu.mapper;

import java.util.List;

import com.tedu.bean.EmpBean;

//dao mapper的接口类
public interface EmpMapper {
	//查询所有数据
	public List<EmpBean> selectAllEmp();
	//查询单个数据，依据一个唯一id
	public EmpBean selectEmpById(int id);
	//插入语句
	public int insertEmp(EmpBean bean);
}
