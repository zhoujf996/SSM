package com.atguigu.ssm.service;

import java.util.List;

import com.atguigu.ssm.bean.Dept;
import com.atguigu.ssm.bean.Emp;

public interface EmpService {
	//获取所有的员工信息
		List<Emp> getAllEmp();

		//根据eid获取员工信息
		Emp getEmpByEid(String eid);

		//修改员工信息
		void updateEmp(Emp emp);
		
		//获取所有的部门信息
		List<Dept> getAllDept();
}
