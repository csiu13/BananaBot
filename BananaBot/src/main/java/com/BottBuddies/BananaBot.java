package com.BottBuddies;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;

import javax.security.auth.login.LoginException;

public class BananaBot {

    public static void main(String[] args) throws LoginException

    {
        JDA jda = new JDABuilder("NjQyNDM0Nzk3NzIwODI5OTYy.XdQC7Q.I9WumhdqtgQddgLKuTW5EbzNd_c").build();
        jda.addEventListener(new BananaListener());
    }
}
