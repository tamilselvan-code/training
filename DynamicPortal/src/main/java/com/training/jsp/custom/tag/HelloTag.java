package com.training.jsp.custom.tag;
import javax.servlet.jsp.tagext.*;
import javax.servlet.jsp.*;
import java.io.*;

public class HelloTag extends SimpleTagSupport {
	
   public void doTag() throws JspException, IOException {
	   
      JspWriter out = getJspContext().getOut();
      //output html generation
      out.println("Hello Custom Tag!");
      
   }
   
}