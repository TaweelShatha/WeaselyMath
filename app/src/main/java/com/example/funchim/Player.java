package com.example.funchim;

public class Player {
    private Long ID;
    private int activiy;

    public Player() {
    }

    public Player(Long ID, int activiy) {
        this.ID = ID;
        this.activiy = activiy;
    }

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public int getActiviy() {
        return activiy;
    }

    public void setActiviy(int activiy) {
        this.activiy = activiy;
    }
}
