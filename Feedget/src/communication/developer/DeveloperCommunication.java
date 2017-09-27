package communication.developer;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class DeveloperCommunication {
	private static final String USER_AGENT = "Mozilla/5.0";
	private static DeveloperCommunication instance = new DeveloperCommunication();

	private DeveloperCommunication() {
		/* pass */
	};

	public String communication(String url, String feedgetName) {
		try {
			// String url = "http://52.79.135.132:8080/DeveloperServer";
			url += "/" + feedgetName;
			URL obj = new URL(url);
			HttpURLConnection con = (HttpURLConnection) obj.openConnection();
			con.setRequestMethod("GET");
			con.setRequestProperty("User-Agent", USER_AGENT);
			BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
			String inputLine;
			StringBuffer response = new StringBuffer();

			while ((inputLine = in.readLine()) != null) {
				response.append(inputLine);
			}
			in.close();
			// print result
			System.out.println(response.toString());
			return response.toString();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public static DeveloperCommunication getInstance() {
		return instance;
	}
}
