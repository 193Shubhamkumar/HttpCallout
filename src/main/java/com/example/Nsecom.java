package com.example;

import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;

public class Nsecom implements Runnable {
//	public static boolean endLoop = false;
	private HttpClient client;
	private HttpGet get;
	
	public Nsecom(HttpClient client, HttpGet get) {
		System.out.println("Hello !! cavisson");
		// TODO Auto-generated constructor stub
		this.client = client;
		this.get = get;
	}
	
	public void run() {
		
		
		
		System.out.println("call run method");
		Httpcallout();
	
		
		try {
	         //   Thread.sleep(5000);
			MultiTiercallout m2 = new MultiTiercallout(client, get);
				Thread t2 = new Thread(m2);
			//	App.endLoop = false;
				t2.start();
				
			   System.out.println("checking Thread callout");

			} catch (Exception ex) {
				System.out.println(ex);
			}
		}

	private void Httpcallout() {
		// TODO Auto-generated method stub
		
	}
	}
