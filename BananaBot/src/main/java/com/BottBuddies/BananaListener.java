package com.BottBuddies;

import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.entities.MessageChannel;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import java.util.HashMap;

public class BananaListener extends ListenerAdapter {

    private HashMap<String, Integer> events;

    //Add commands here
    public BananaListener() {
        events = new HashMap<String, Integer>();
        events.put("!ping", 0);
    }

    @Override
    public void onMessageReceived(MessageReceivedEvent event)
    {
        //Ignore events from other bots, including ourselves
        if(event.getAuthor().isBot()) {
            return;
        }

        Message message = event.getMessage();
        String content = message.getContentRaw();
        int index = events.containsKey(content) ? events.get(content) : -1;

        if(index == 0) {
            MessageChannel channel = event.getChannel();
            channel.sendMessage("Pong").queue();
        }
    }
}
