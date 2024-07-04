package ch14.collection.properties;

import java.io.FileReader;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.Properties;

public class JDBCExam {

	public static void main(String[] args) throws Exception {
		// properties는 텍스트 문서를 java 코드의 k,v 형태로 불러 온다.
		
		Properties properties = new Properties(); // 빈 객체 생성
		String path = JDBCExam.class.getResource("jdbc.properties").getPath();
		System.out.println(path);
		path = URLDecoder.decode(path, "utf-8");
		// 한국어가 있을 수 있으니 
		
		properties.load(new FileReader(path));
		// 프로퍼티스로 불러옴
		
		String driver = properties.getProperty("driver");
		System.out.println("오라클 드라이버 : " + driver);
	}

}
