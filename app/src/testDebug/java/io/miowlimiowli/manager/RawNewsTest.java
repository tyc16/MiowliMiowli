package io.miowlimiowli.manager;

import org.json.JSONException;
import org.junit.Test;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;

public class RawNewsTest {

    @Test
    public void fetch_news_from_server() throws ParseException, IOException, JSONException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        Date date_begin = simpleDateFormat.parse("2018-09-09 00:00:00");
        Date date_end = simpleDateFormat.parse("2019-09-09 00:00:00");
        List<RawNews> news = RawNews.fetch_news_from_server(100, 2, date_begin,date_end,"","");
        System.out.println(news.size());
    }
}