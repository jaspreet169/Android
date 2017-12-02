package com.example.macstudent.cricketplayerrank;

import android.app.Activity;
import android.os.Bundle;

public class DisplayActivity extends Activity {
    private SQLiteDatabaseHandler db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);
        db = new SQLiteDatabaseHandler(this);

          cricket player1 = new Player("jim","batsman",5,2,,260,12);
        Player player2 = new Player("john","bowler",3,4,103,8);
        Player player3 = new Player("rudy","wicket keeper",1,2,86,6);

        db.addPlayer(player1);
        db.addPlayer(player2);
        db.addPlayer(player3);

        List<Player> players = db.allPlayers();




    }
}
