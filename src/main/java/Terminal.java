import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import java.util.Scanner;

public class Terminal {
    public static void main(String[] args) {
        // Print out the Menu
        System.out.println("Welcome to Big Data Processing Application");
        System.out.println("Please type the number that corresponds to which application you would like to run:");
        System.out.println("1. Apache Hadoop");
        System.out.println("2. Apache Spark");
        System.out.println("3. Jupyter Notebook");
        System.out.println("4. SonarQube and SonarScanner");
        System.out.println("Type the number here >");
        Scanner sc = new Scanner(System.in);
        String choice = "";
        while ( true ) {
            choice = sc.next();
            switch (choice) {
                case "1":
                    System.out.println("Connecting to Apache Hadoop...");
                    break;
                case "2":
                    System.out.println("Connecting to Apache Spark...");
                    break;
                case "3":
                    System.out.println("Connecting to Jupyter Notebook...");
                    break;
                case "4":
                    System.out.println("Connecting to SonarQube and SonarScanner...");
                    break;
                default:
                    System.out.println("Wrong choice!");
                    break;
            }
        }
    }

    public void doGet(String url) throws Exception {
        CloseableHttpClient httpClient = HttpClients.createDefault();
        HttpGet httpGet = new HttpGet(url);
        CloseableHttpResponse  httpResponse = null;
        try {
            httpResponse = httpClient.execute(httpGet);
            if (httpResponse.getStatusLine().getStatusCode() == 200) {
               System.out.println("Successfully get!");
               System.out.println("Showing content will be implemented in next iteration.");
            } else {
                System.out.println("Unable to get!");
            }
        } finally {
            httpClient.close();
        }
    }
}
