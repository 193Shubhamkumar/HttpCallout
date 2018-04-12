package com.example;

import java.io.IOException;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.util.EntityUtils;

public class MultiTiercallout implements Runnable {
	
	private HttpClient client;
	private HttpGet get;
	public static boolean endLoop = false;
	
	
	public MultiTiercallout(HttpClient client, HttpGet get) {
		// TODO Auto-generated constructor stub
		this.client = client;
		this.get = get;
	}
	
	public void run() {
		System.out.println("Thread callout");
		
		HttpResponse response = null;
		try {
			response = client.execute(get);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//System.out.println("Response Code : " + response.getStatusLine().getStatusCode());

		System.out.println("Header  " + response.getAllHeaders());

}
}

