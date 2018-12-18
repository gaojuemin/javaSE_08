package com.dj;
	public class TestLinkList {
	    public static void main(String[] args) {  
	        SLinklist linkList = new SLinklist();  
	        linkList.addfirstnode(12);  
	        linkList.addfirstnode(13);  
	        linkList.addfirstnode(14);  
	      
	        linkList.add(1, 17);   
	        linkList.add(2, 18);  
	        linkList.add(3, 19);
	        linkList.showNodes();
	        //单项链表的反转，1用栈实现依次入站，再出站。2网上的方法。
	        
	      
	}
	}

