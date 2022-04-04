package com.yedam.exam;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class OrdersDAO {

	@Autowired private SqlSessionTemplate mybatis;
	
	public int insertOrders(Orders orders) {
		return mybatis.insert("OrdersDAO.insertOrders", orders);
	}
}
