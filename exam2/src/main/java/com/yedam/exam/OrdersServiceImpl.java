package com.yedam.exam;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrdersServiceImpl implements OrdersService{

	@Autowired	OrdersDAO dao;
	
	@Override
	public Map<String, Object> insertOrders(List<Orders> orders) {
		Map<String, Object> result = new HashMap<String, Object>();
		List<String> errList = new ArrayList<String>();
		int cnt = 0;
		
		//테이블 입력
		for (Orders order : orders) {
			if (order.getOrd_cnt() * order.getPrice() != order.getOrd_price()) {
				errList.add(order.getCustomer());
			} else {
				int r = dao.insertOrders(order);
				if (r == 0) {
					errList.add(order.getCustomer());
				} else {
					cnt++;
				}
			}
		}
		result.put("total", orders.size());
		result.put("success", cnt);
		result.put("errList", errList);
		
		System.out.println(result.get("total"));
		
		return result; // 처리 건수 리턴;
	}

}
