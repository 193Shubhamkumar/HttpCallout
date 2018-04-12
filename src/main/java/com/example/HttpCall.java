package com.example;

import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HttpCall {
	 
	
	 @RequestMapping({"/"})
	  String index()
	  {
	    return "Hello From First Controller";
	  }
	
	  @RequestMapping({"/tiercall"})
	
	void Httpcallout() throws InterruptedException
	{
		 
		 // System.out.println("Username from URL is " + uname);  
		  String url = "http://10.10.30.29:17010/crs/storeus/browse/productDetailColorSizePicker.jsp?categoryNavIds=catMen%3acatMenPants&categoryNav=true&navAction=jump&navCount=0&productId=prod20002&categoryId=catMenPants";
		  
//		  while (true) {
//		    	for (int i=0; i < 4000; i++) {
//		    		//System.out.println("Sending Message" + i + "  " + message);
//		    		//Thread.sleep(60000);
		    		
					
					
		  
			HttpClient client = HttpClientBuilder.create().build();
			HttpGet get = new HttpGet(url);
		
			Nsecom m1 = new Nsecom(client, get);
			Thread t1 = new Thread(m1);
			 t1.start();
			
	}

	}

//	}
//}


