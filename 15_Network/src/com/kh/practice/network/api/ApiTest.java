package com.kh.practice.network.api;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;

public class ApiTest {
	public static void main(String[] args) {
		//0) 홈페이지에서 요청주소, 요청변수 확인후 필수값에 해당하는 변수 초기화
		// serviceKey를 제외한 필수데이터는 샘플데이터를 추가한다
		//1) URL 객체 생성
		// 2)URLConnection 객체 생성
		// 3)입력 스트림 생성
		// 4)전달받은 데이터를 화면에 출력
		try {
			String serviceKey = "ehGda3CWAg41AIxG1HC1LRss4oMj1bSI0tiQqhdF89v1QcUJ8%2F8vI2LwuI267NhfGmArXuEhidCeqTkAdzmUFw%3D%3D";
			String serviceUrl = "http://apis.data.go.kr/B552584/ArpltnInforInqireSvc/getMinuDustWeekFrcstDspth";
			String stationName = URLEncoder.encode("종로구","UTF-8");
			String dateTerm = "DAILY";
			
			serviceUrl += "?serviceKey="+serviceKey
					+"&stationName="+stationName
					+"&dateTerm"+dateTerm;
			URL url = new URL(serviceUrl);
			try (BufferedReader reader = 
					new BufferedReader(
							new InputStreamReader
							(url.openConnection().getInputStream()))) {
				
				StringBuilder sb = new StringBuilder();
				String line = null;
				while((line = reader.readLine()) != null) {
					sb.append(line).append("\n");
					
				}
				System.out.println(sb.toString());
			} catch (Exception e) {
				// TODO: handle exception
			}
			
		} catch (UnsupportedEncodingException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
// 실행 결과
//	<response>
//	<header>
//	<resultCode>00</resultCode>
//	<resultMsg>NORMAL_CODE</resultMsg>
//	</header>
//	<body>
//	<items>
//	<item>
//	<presnatnDt>2024-04-16</presnatnDt>
//	</item>
//	<item>
//	<presnatnDt>2024-04-15</presnatnDt>
//	</item>
//	<item>
//	<presnatnDt>2024-04-14</presnatnDt>
//	</item>
//	<item>
//	<presnatnDt>2024-04-13</presnatnDt>
//	</item>
//	<item>
//	<presnatnDt>2024-04-12</presnatnDt>
//	</item>
//	<item>
//	<presnatnDt>2024-04-11</presnatnDt>
//	</item>
//	<item>
//	<presnatnDt>2024-04-10</presnatnDt>
//	</item>
//	</items>
//	<numOfRows>10</numOfRows>
//	<pageNo>1</pageNo>
//	<totalCount>7</totalCount>
//	</body>
//	</response>
}
