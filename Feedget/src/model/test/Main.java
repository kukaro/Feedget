package model.test;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import com.google.gson.JsonArray;

import model.service.FeedgetService;

public class Main {
	private static final String USER_AGENT = "Mozilla/5.0";
	public static void main(String[] args) {
		JsonArray jsArr = FeedgetService.getInstance().getFeedget("a@a.a");
	}
}
