package com.example.macstudent.cricketplayerrank;

/**
 * Created by macstudent on 2017-12-01.
 */

public class PortfolioActivity {

    String _playerName;
    String _playerCategory;
    int _noOfTestMatch;
    int _noOfPerMatch;
    int _runs;
    int _Wicket;

    public PortfolioActivity() {
    }

    public PortfolioActivity(String _playerName, String _playerCategory, int _noOfTestMatch, int _noOfPerMatch, int _runs, int _Wicket)
    {
        this._playerName = _playerName;
        this._playerCategory = _playerCategory;
        this._noOfTestMatch = _noOfTestMatch;
        this._noOfPerMatch = _noOfPerMatch;
        this._runs = _runs;
        this._Wicket = _Wicket;
    }


    public String get_playerName() {
        return _playerName;
    }

    public void set_playerName(String _playerName) {
        this._playerName = _playerName;
    }

    public String get_playerCategory() {
        return _playerCategory;
    }

    public void set_playerCategory(String _playerCategory) {
        this._playerCategory = _playerCategory;
    }

    public int get_noOfTestMatch() {
        return _noOfTestMatch;
    }

    public void set_noOfTestMatch(int _noOfTestMatch) {
        this._noOfTestMatch = _noOfTestMatch;
    }

    public int get_noOfPerMatch() {
        return _noOfPerMatch;
    }

    public void set_noOfPerMatch(int _noOfPerMatch) {
        this._noOfPerMatch = _noOfPerMatch;
    }

    public int get_runs() {
        return _runs;
    }

    public void set_runs(int _runs) {
        this._runs = _runs;
    }

    public int get_Wicket() {
        return _Wicket;
    }

    public void set_Wicket(int _Wicket) {
        this._Wicket = _Wicket;
    }
}

