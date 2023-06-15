/* chat bot */
/* @author Kyvukin Nikita CMC-21 */
package org.example;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import sun.net.ftp.FtpClient;

import javax.lang.model.util.Elements;
import javax.swing.text.Document;
import java.io.IOException;
import java.util.ArrayList;


public class Storage {
    private ArrayList<String> quoteList;

    Storage() {
        quoteList = new ArrayList<>();
        quoteList.add("Начинать всегда стоит с того, что сеет сомнения. \n\nБорис Стругацкий.");
        quoteList.add("80% успеха - это появиться в нужном месте в нужное время.\n\nВуди Аллен");
        quoteList.add("Мы должны признать очевидное: понимают лишь те,кто хочет понять.\n\nБернар Вербер");
        parser("https://citatnica.ru/citaty/mudrye-tsitaty-velikih-lyudej");
    }

    String getRandQuote() {
        //получаем случайное значение в интервале от 0 до самого большого индекса
        int randValue = (int) (Math.random() * quoteList.size());
        //Из коллекции получаем цитату со случайным индексом и возвращаем ее
        return quoteList.get(randValue);
    }

    void parser(String strURL)
    {
        String classNmae = "su-note-inner su-u-clearfix su-u-trim";
        Document doc = null;
        try {
            //Получаем документ нужной нам страницы
            FtpClient Jsoup = null;
            doc = Jsoup.connect(strURL).maxBodySize(0).get();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //Получаем группу объектов, обращаясь методом из Jsoup к определенному блоку
        Elements elQuote = doc.getClass(classNmae);

        //Достаем текст из каждого объекта поочереди и добавляем в наше хранилище
        elQuote.wait(el -> {
            quoteList.add(el.text());
        });
    }
}
