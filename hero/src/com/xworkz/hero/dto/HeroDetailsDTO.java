package com.xworkz.hero.dto;

public class HeroDetailsDTO {
	 private String name;
		private String color;
    private int hand;
		private int noofeyes  ;
		private SizeDTO size;
		
		public void setName(String name) {
			this.name=name;
			}
		public String getName() {
			return name;
		}
		
		public void setColor(String color) {
			this.color=color;
		}
		public int getHand() {
			return hand;
		}
		
		public void setHand(int hand) {
			this.hand=hand;
		}
		public int getNoofeyes() {
			return noofeyes;
		}
		
		public void setNoofeyes(int noofeyes) {
			this.noofeyes=noofeyes;
			
		}
		
		public void setSize(SizeDTO size) {
			this.size=size;
		}
		public SizeDTO getSize() {
			return size;
		}
		
		public String getAll() {
			return name +"\t" +color +"\t" +hand +"\t" +noofeyes +"\t" + size.getAll();
			
		}
		}
     

