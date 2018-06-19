package com.hello.client;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

public class WebClient {
  public static String getWebContent(String urlString, final String charset, int timeout) throws IOException {
    if (urlString == null || urlString.length() == 0) {
      return null;
    }
    urlString = (urlString.startsWith("http://") || urlString
      .startsWith("https://")) ? urlString : ("http://" + urlString)
      .intern();
    URL url = new URL(urlString);
    HttpURLConnection conn = (HttpURLConnection) url.openConnection();
    conn
      .setRequestProperty(
        "User-Agent",
        "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.2; Trident/4.0; .NET CLR 1.1.4322; .NET CLR 2.0.50727)");//增加报头，模拟浏览器，防止屏蔽
    conn.setRequestProperty("Accept", "text/html");//只接受text/html类型，当然也可以接受图片,pdf,*/*任意，就是tomcat/conf/web里面定义那些
    conn.setConnectTimeout(timeout);
    try {
      if (conn.getResponseCode() != HttpURLConnection.HTTP_OK) {
        return null;
      }
    } catch (IOException e) {
      e.printStackTrace();
      return null;
    }
    InputStream input = conn.getInputStream();
    BufferedReader reader = new BufferedReader(new InputStreamReader(input,
      charset));
    String line = null;
    StringBuffer sb = new StringBuffer();
    while ((line = reader.readLine()) != null) {
      sb.append(line).append("/r/n");
    }
    if (reader != null) {
      reader.close();
    }
    if (conn != null) {
      conn.disconnect();
    }
    return sb.toString();

  }

  public static String getWebContent(String urlString) throws IOException {
    return getWebContent(urlString, "iso-8859-1", 5000);
  }

  public static void main(String[]args) throws IOException {
    FileInputStream fis=null;
    FileOutputStream fos=null;
    String s = getWebContent("http://www.wzgs.shop");
    s = new String(s.getBytes("iso-8859-1"),"gb2312");
    System.out.println(s+"\n");
    try {
      int count=0;
      File file = new File("E:\\test\\text.txt");
      PrintStream ps = new PrintStream(new FileOutputStream(file));
      for (int i = 1;i> count ;i++) {
        ps.println("www"+s+i);
        System.out.println("写爆内存"+i);
      }
    } catch (FileNotFoundException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }

  }


}
