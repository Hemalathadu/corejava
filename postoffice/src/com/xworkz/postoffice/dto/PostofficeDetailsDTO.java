package com.xworkz.postoffice.dto;


public class PostofficeDetailsDTO {
	 private String company;
		private String name;
    private int amount;
		private byte noofbranch ;
		private SizeDTO size;
		
		public void setCompany(String company) {
			this.company=company;
			}
		public String getCompany() {
			return company;
		}
		
		public void setAmount(int amount) {
			this.amount=amount;
		}
		public int getAmount() {
			return amount;
		}
		
		public void setName(String name) {
			this.name=name;
		}
		public String getName() {
			return name;
		}
		
		public void setNoofbranch(byte noofbranch) {
			this.noofbranch=noofbranch;
			
		}
		public byte getNoofbranch() {
			return noofbranch;
		}
		
		public void setSize(SizeDTO size) {
			this.size=size;
		}
		public SizeDTO getSize() {
			return size;
		}
		
		public String getAll() {
			return company +"\t" +amount +"\t" +name +"\t" +noofbranch +"\t" + size.getAll();
			
		}
		}
     
