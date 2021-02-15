package org.pojo;

public class PageObjectManager {
	 private PageObjectManager()
	 {		 
		 
	 }
	  private static PageObjectManager PageObjectManager;
	   private static LoginPOJO LoginPOJO;
	    private static ForgotPojo ForgotPojo;
	     private static LoginAZPojo LoginAZPojo;
		public static PageObjectManager getPageObjectManager() {
			return (PageObjectManager==null)?PageObjectManager=new PageObjectManager():PageObjectManager;
		}
		public static LoginPOJO getLoginPOJO() {
			return (LoginPOJO==null)?LoginPOJO=new LoginPOJO():LoginPOJO;
		}
		public static ForgotPojo getForgotPojo() {
			return (ForgotPojo==null)?ForgotPojo=new ForgotPojo():ForgotPojo;
		}
		public static LoginAZPojo getLoginAZPojo() {
			return (LoginAZPojo==null)?LoginAZPojo=new LoginAZPojo():LoginAZPojo;
		}
	  

}
