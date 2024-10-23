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
//	            // �s���äU������
//	            Document doc = Jsoup.connect("https://elite.taiwanjobs.gov.tw/ClassSearch/Detail?UUID=893FF63EC7B442DDB4A11D7D0B46D15E&SOURCE_TYPE=ELIT").get();
//
//	            // ��ܩҦ� <a> ����
//	            Elements links = doc.select("h3");
//	            
//	            for (Element link : links) {
//	                // ��X�챵����r�M���}
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
