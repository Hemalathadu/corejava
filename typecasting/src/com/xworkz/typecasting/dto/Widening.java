package com.xworkz.typecasting.dto;

public class Widening {
	
	  //Converting from byte;
	public byte a=3;
	public short b=a;
	
	public byte x=55;
	public int y=x;
	
	public byte x1=65;
	public float y1=x1;
	
	public byte x2=72;
	public float y2=x2;
	
	public byte x3=40;
	public double y3=x3;
	
	public boolean x4= (a==b);
	
	//Converting from short;
	public short c= 4;
	public int d = c;
	
	public short c1= 5;
	public long d1 = c1;
	
	public short c2 = 51;
	public float d2 =c2;
	
	public short c3 = 31;
	public double d3 = c3;
	
	public boolean d4 = (c==d);
	
	//Converting from char;
	public char r='A';
	public int s=r;
	
	public char r1= 'b';
	public int s1= r;
	
	public char r2= 'E';
	public float s2 = r2;

	public char r3= 'I';
	public double s3 = r3;

	public boolean r4= (r1==r2);

	//converting from integer;
	public int i = 120;
	public long j = i;

	public int ii = 24;
	public float j1 = ii;

	public int iw = 66;
	public double j2 = iw;

	public boolean i3 = (i==j1);

	//converting from long;
	public long m = 350;
	public float n = m;

	public long m1 = 46;
	public double n1 = m1;

	public boolean m2 = (m==n);

	//converting from float;
	public float rv = 355;
	public double rv1 = rv;

	public boolean res = (rv!=rv1);

	}


	
	
	
	
	


