package com.xworkz.java_programs.apti.apti_string;

public final class CustomImmutable {

	//public static void main(String[] args) {
		private final String str;
		private final StringBuffer sb;
		
		public CustomImmutable(String str, StringBuffer sb) {
			this.str=str;
			this.sb= new StringBuffer(sb.toString());
		}
		public String getStr() {
			return str;
		}
		public StringBuffer getSb() {
			return new StringBuffer(sb.toString());
		}

	}

//}
