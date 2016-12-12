package com.stfalcon.chatkit.sample;

import com.stfalcon.chatkit.features.messages.models.IMessage;

import java.util.Date;

/*
 * Created by troy379 on 12.12.16.
 */
public final class Demo {
    private Demo() {
        throw new AssertionError();
    }

    public static class Message implements IMessage {

        private int id;

        public Message(int id) {
            this.id = id;
        }

        @Override
        public Date getCreatedAt() {
            return new Date();
        }

        @Override
        public String getId() {
            return Integer.toString(id);
        }

        @Override
        public String getAuthorId() {
            return id % 2 == 0 ? "0" : "1";
        }

        @Override
        public String getText() {
            return id + ", example text";
        }
    }
}