package com.simpleapi.simpleapi;

import com.fasterxml.jackson.core.type.TypeReference;
import com.simpleapi.simpleapi.service.ReadJSON;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

//@SpringBootTest
class SimpleApiApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	public void readJsonServiceTest(){
//		ReadJSON json = new ReadJSON();
//		json.readJsonToDogType();

		InputStream inputStream = TypeReference.class.getResourceAsStream("src/main/resources/data/apidata.json");
		StringBuilder textBuilder = new StringBuilder();
		try (Reader reader = new BufferedReader(new InputStreamReader
				(inputStream, Charset.forName(StandardCharsets.UTF_8.name())))) {
			int c = 0;
			while ((c = reader.read()) != -1) {
				textBuilder.append((char) c);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
