package com.company.JAVA_BOOTCAM_LOSOWE.OOP_BASIC.Pliki.Zad1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReadFile {

    private File mainFile;

    public ReadFile(String pathFile) {
        mainFile = new File(pathFile);
    }

    public String readFile() throws IOException {
        FileInputStream fileInputStream = new FileInputStream(mainFile);
        StringBuilder stringBuilder = new StringBuilder();

        int read;

        while ((read = fileInputStream.read()) != -1) {
            stringBuilder.append((char) read); // StringBuilder.append()  -> dokleja znaki do tablicy
        }
        return stringBuilder.toString();
    }

    // czy strona zawiere w sobie odnosniki/ linki
    public int countHRefOnWebsite(String website) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(website).openConnection();
        InputStream inputStream = httpURLConnection.getInputStream();
        StringBuilder stringBuilder = new StringBuilder();

        int read;
        while ((read = inputStream.read()) != -1) {
            stringBuilder.append((char) read);
        }

        int counter = 0;
        Pattern patternHref = Pattern.compile("href=");
        Matcher matcher = patternHref.matcher(stringBuilder.toString());

        while (matcher.find()) {
            counter++;
        }
        return counter;
    }


}
