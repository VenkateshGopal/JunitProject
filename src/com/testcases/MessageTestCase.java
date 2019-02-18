package com.testcases;
import org.junit.Test;

import com.comman.MessageUtil;

import static org.junit.Assert.assertEquals;

public class MessageTestCase {
	
   String message = "Hello World";	
   MessageUtil messageUtil = new MessageUtil(message);

   @Test
   public void testPrintMessage() {
      assertEquals(message,messageUtil.printMessage());
   }
}