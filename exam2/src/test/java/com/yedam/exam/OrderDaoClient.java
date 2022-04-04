package com.yedam.exam;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:config/*-context.xml")
public class OrderDaoClient {
	
	@Autowired OrdersDAO dao;
	@Autowired OrdersService service;
	
	@Test
	public void test() {
		Orders orders = new Orders();
		orders.setOrd_no(1);
		orders.setCustomer("james");
		orders.setOrd_goods("g1");
		orders.setOrd_cnt(5);
		orders.setOrd_price(2500);
		int r = dao.insertOrders(orders);
		System.out.println(r+"건 처리됨");
    }
	
	@Test
	public void resultTest() {
		List<Orders> list = new ArrayList<Orders>();
		Orders orders = new Orders();
		Orders orders2 = new Orders();
		Orders orders3 = new Orders();
		orders.setOrd_no(1);
		orders.setCustomer("10");
		orders.setOrd_goods("g1");
		orders.setOrd_cnt(0);
		orders.setPrice(100);
		orders.setOrd_price(2500);
		list.add(orders);
		orders2.setOrd_no(0);
		orders2.setCustomer("105");
		orders2.setOrd_goods("g2");
		orders2.setOrd_cnt(4);
		orders2.setPrice(100);
		orders2.setOrd_price(2500);
		list.add(orders2);
		orders3.setOrd_no(0);
		orders3.setCustomer("99");
		orders3.setOrd_goods("g1");
		orders3.setOrd_cnt(4);
		orders3.setPrice(200);
		orders3.setOrd_price(800);
		list.add(orders3);
		System.out.println(list);
		Map<String, Object> result = service.insertOrders(list);
		System.out.println(result);
	}
}
