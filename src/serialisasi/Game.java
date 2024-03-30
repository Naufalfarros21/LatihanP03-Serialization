/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package serialisasi;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author asus
 */

public class Game implements Serializable {

    private String Id_Game;
    private String Nama_Game;
    private List<Player> players;

    public String getId_Devisi() {
        return Id_Game;
    }

    public void setId_Game(String Id_Game) {
        this.Id_Game = Id_Game;
    }

    public String getNama_Game() {
        return Nama_Game;
    }

    public void setNama_Game(String Nama_Game) {
        this.Nama_Game = Nama_Game;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    @Override
    public String toString() {
        String game, user = "";
        game = "Game : \r\n"
                + "Id Game = " + Id_Game + "\r\n"
                + "Nama Game = " + Nama_Game + "\r\n"
                + "=======================\r\n"
                + "Player : \r\n";
        user = players.stream().map((obj)
                -> obj.toString()).reduce(user, String::concat);
        return game + user;
    }
}
