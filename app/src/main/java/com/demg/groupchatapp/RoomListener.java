package com.demg.groupchatapp;

import com.scaledrone.lib.Room;

public interface RoomListener {
    void onOpen(Room room);

    void onOpenFailure(Room room, Exception ex);

    void onMessage(Room room, Message message);
}