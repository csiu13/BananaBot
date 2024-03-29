package com.BottBuddies;

import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.entities.MessageChannel;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class BananaListener extends ListenerAdapter {

    @Override
    public void onMessageReceived(MessageReceivedEvent event)
    {
        //Ignore events from other bots, including ourself
        if(event.getAuthor().isBot()) {
            return;
        }

        Message message = event.getMessage();
        String content = message.getContentRaw();

        if(content.equals("!ping")) {
            MessageChannel channel = event.getChannel();
            channel.sendMessage("Pong").queue();
        }
    }
}
