package com.BottBuddies;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;

import javax.security.auth.login.LoginException;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class BananaBot {

    public static void main(String[] args) throws LoginException
    {
        try {
            Properties prop = new Properties();
            prop.load(new FileInputStream("D:\\config.properties"));
            String token = prop.getProperty("token");
            JDA jda = new JDABuilder(token).build();
            jda.addEventListener(new BananaListener());
        } catch(IOException e) {
            System.out.println("Error reading in properties file");
            e.printStackTrace();
        }
    }
}
