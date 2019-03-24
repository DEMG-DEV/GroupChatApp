package com.demg.groupchatapp;

import com.scaledrone.lib.Room;

public interface HistoryRoomListener {
    void onHistoryMessage(Room room, Message message);
}
