package com.testcases;
import org.junit.Test;

import com.comman.MessageUtil;

import static org.junit.Assert.assertEquals;

public class MessageFailTestCase {
	
   String message = "Hello World";	
   MessageUtil messageUtil = new MessageUtil(message);

   @Test
   public void testPrintMessage() {
      message = "New Word";
      assertEquals(message,messageUtil.printMessage());
   }
}