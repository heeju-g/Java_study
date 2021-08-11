package com.test01;

import java.net.URI;
import java.net.URISyntaxException;

public class MTest01 {
	public static void main(String[] args) throws URISyntaxException {
		URI uri = new URI("http://localhost:8787/Java19_URI_WEB/res.jsp?name=%EC%8B%AC%ED%9D%AC%EC%A3%BC&addr=%EA%B2%BD%EA%B8%B0");
		System.out.println(uri.getScheme());
		System.out.println(uri.getHost());
		System.out.println(uri.getPort());
		System.out.println(uri.getPath());
		System.out.println(uri.getQuery());
	}

}
