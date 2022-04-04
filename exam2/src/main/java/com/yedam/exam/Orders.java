package com.yedam.exam;

import org.springframework.format.annotation.DateTimeFormat;

public class Orders {
	private  Integer  ord_no;   	//주문번호
	private  String   customer; 	//주문고객
	
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private  String   ord_dttm;		//주문일자
	private  String   ord_goods;	//주문상품
	private  Integer  ord_cnt;		//수문수량
	private  Integer  price;		//단가
	private  Integer  ord_price;	//주문금액
	public final Integer getOrd_no() {
		return ord_no;
	}
	public final void setOrd_no(Integer ord_no) {
		this.ord_no = ord_no;
	}
	public final String getCustomer() {
		return customer;
	}
	public final void setCustomer(String customer) {
		this.customer = customer;
	}
	public final String getOrd_dttm() {
		return ord_dttm;
	}
	public final void setOrd_dttm(String ord_dttm) {
		this.ord_dttm = ord_dttm;
	}
	public final String getOrd_goods() {
		return ord_goods;
	}
	public final void setOrd_goods(String ord_goods) {
		this.ord_goods = ord_goods;
	}
	public final Integer getOrd_cnt() {
		return ord_cnt;
	}
	public final void setOrd_cnt(Integer ord_cnt) {
		this.ord_cnt = ord_cnt;
	}
	public final Integer getPrice() {
		return price;
	}
	public final void setPrice(Integer price) {
		this.price = price;
	}
	public final Integer getOrd_price() {
		return ord_price;
	}
	public final void setOrd_price(Integer ord_price) {
		this.ord_price = ord_price;
	}
	@Override
	public String toString() {
		return "Orders [ord_no=" + ord_no + ", customer=" + customer + ", ord_dttm=" + ord_dttm + ", ord_goods="
				+ ord_goods + ", ord_cnt=" + ord_cnt + ", price=" + price + ", ord_price=" + ord_price + "]";
	}
	
}
