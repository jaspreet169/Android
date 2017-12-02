package com.example.macstudent.cricketplayerrank.db.helper;

/**
 * Created by macstudent on 2017-12-01.
 */


import java.util.LinkedList;
import java.util.List;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHandler extends SQLiteOpenHelper {

    private static final String TABLE_NAME = "CricketPlayers";
    private static final String KEY_PlayerName = "name";
    private static final String KEY_PlayerCategory = "player category";
    private static final String KEY_NoOfTestMatch = "no of test match";
    private static final String KEY_NoOfPerMatch = "no of per match";
    private static final String KEY_Runs = "runs";
    private static final String KEY_Wicket = "wicket";
    private static final String[] COLUMNS = { KEY_PlayerName,KEY_PlayerCategory,
            KEY_NoOfTestMatch,KEY_NoOfPerMatch,KEY_Runs,KEY_Wicket};

    public DatabaseHandler(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);





    }
}
