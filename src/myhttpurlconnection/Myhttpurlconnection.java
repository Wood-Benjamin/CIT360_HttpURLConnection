package myhttpurlconnection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class Myhttpurlconnection {

    private static Scanner in;

    public static void main(String args[]) throws IOException {
        in = new Scanner(System.in);
        String firstname = null;
        String lastname = null;
        System.out.println("Please enter you firstname: ");
        firstname = in.next();

        System.out.println("Please enter your lastname: ");
        lastname = in.next();

        String myphplink = "http://localhost:10080/java/myhttpurlconnect.php?firstname="+firstname+"&lastname="+lastname;
        URL url = new URL(myphplink);
        HttpURLConnection connect = (HttpURLConnection)url.openConnection();
        connect.setRequestMethod("GET");

        BufferedReader in = new BufferedReader(new InputStreamReader(connect.getInputStream()));
        StringBuilder sb = new StringBuilder();
        String line;

        while((line = in.readLine()) != null){
            sb.append(line);
        }
        in.close();
        System.out.println(sb.toString());
    }
}
