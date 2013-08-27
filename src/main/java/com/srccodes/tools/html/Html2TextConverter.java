package com.srccodes.tools.html;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

/**
 * @author Abhijit Ghosh
 * @version 1.0
 * 
 */
public class Html2TextConverter {
	public static void main(String[] args) {
		String html = "<p><b>HTML</b> to <b>Text</b> Converter</p>";
		
		Document doc = Jsoup.parse(html);
		
		System.out.println("Plain Text:");
		System.out.println(doc.text());
	}
}
