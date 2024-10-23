package com.example.demo11;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TryWeb {
	@Test
	public void tryWeb() {
//		 try {
//	            // 連接並下載網頁
//	            Document doc = Jsoup.connect("https://elite.taiwanjobs.gov.tw/ClassSearch/Detail?UUID=893FF63EC7B442DDB4A11D7D0B46D15E&SOURCE_TYPE=ELIT").get();
//
//	            // 選擇所有 <a> 標籤
//	            Elements links = doc.select("h3");
//	            
//	            for (Element link : links) {
//	                // 輸出鏈接的文字和網址
//	                System.out.println(link.text() + ": " + link.attr("h3"));
//	            }
//	        } catch (Exception e) {
//	            e.printStackTrace();
//	        }
//	    }
	}

	@Autowired
	private DataSource dataSource;

	@Test
	public void testConnection() throws SQLException {
		try (Connection connection = dataSource.getConnection()) {
			assertNotNull(connection, "Connection should not be null");
			System.out.println("Connection successful!");
		}
	}
}
