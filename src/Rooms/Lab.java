package Rooms;

import Game.Runner;
import People.Person;

public class Lab extends Room {
    public Lab(int a, int b) {
        super(a, b);

    }
    public void enterRoom(Person x)
    {
        System.out.println("You enter a science lab");
        occupant = x;
        x.setxLoc(this.xLoc);
        x.setyLoc(this.yLoc);
    }
    public void leaveRoom(Person x)
    {
        occupant = null;
    }
}
