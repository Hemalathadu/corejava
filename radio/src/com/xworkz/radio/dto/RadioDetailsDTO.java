package com.xworkz.radio.dto;

public class RadioDetailsDTO {

        private String company;
		private String color;
       private int price;
		private byte noofstations  ;
		private SizeDTO size;
		
		public void setCompany(String company) {
			this.company=company;
			}
		public String getCompany() {
			return company;
		}
		
		public void setPrice(int price) {
			this.price=price;
		}
		public int getPrice() {
			return price;
		}
		
		public void setcolor(String color) {
			this.color=color;
		}
		public String getColor() {
			return color;
		}
		
		public void setNoofstations(byte noofstations) {
			this.noofstations=noofstations;
			
		}
		public byte getNoofstations() {
			return noofstations;
		}
		
		public void setSize(SizeDTO size) {
			this.size=size;
		}
		public SizeDTO getSize() {
			return size;
		}
		
		public String getAll() {
			return company +"\t" +price +"\t" +color +"\t" +noofstations +"\t" + size.getAll();
			
		}
		}
        