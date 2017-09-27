package model.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

import model.dto.DeveloperDto;
import model.dto.FeedgetDto;

public class FeedgetService {
	private static FeedgetService instance = new FeedgetService();
	private FeedgetService() {
		/*pass*/
	}
	public JsonElement requestFeedgetData(DeveloperDto dDto,FeedgetDto fDto) {
		String url = "http://52.79.135.132:8080/DeveloperServer/Weather";
		//String url2 = dDto.getSite()+"/"+fDto.getName();
		final String USER_AGENT = "Mozilla/5.0";
		URL obj;
		try {
			obj = new URL(url);
			HttpURLConnection con = (HttpURLConnection) obj.openConnection();
			con.setRequestMethod("GET");
			con.setRequestProperty("User-Agent", USER_AGENT);
			//int responseCode = con.getResponseCode();
			BufferedReader in = new BufferedReader(
			        new InputStreamReader(con.getInputStream()));
			String inputLine;
			StringBuffer result = new StringBuffer();

			while ((inputLine = in.readLine()) != null) {
				result.append(inputLine);
			}
			in.close();
			JsonParser parser = new JsonParser();
			JsonElement element = parser.parse(result.toString());
			return element;
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
	public static FeedgetService getInstance() {
		return instance;
	}
}
