package org.example;


import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;

public class App
{
    public static void main( String[] args ) throws IOException {
        String url = "https://www.vatanbilgisayar.com/asus/notebook/?page=1";
        Document doc = Jsoup.connect(url).userAgent("Mozilla/5.0 (Linux; U; Android 4.4.2; en-us; SCH-I535 Build/KOT49H) AppleWebKit/534.30 (KHTML, like Gecko) Version/4.0 Mobile Safari/534.30").get();

    }
}