package cz.czechitas.turtle;

import cz.czechitas.turtle.engine.*;

import java.awt.*;

public class HlavniProgram {
    private Turtle zofka = new Turtle();

    public void start() {

//        ctverec(45, Color.MAGENTA);

//        trojuhelnikRovnostranny(60, Color.GREEN);

        obdelnik(100, 50, Color.CYAN);

//        kruh(30,Color.RED);

//        rovnoramenyPravouhlyTrojuhelnik(50, Color.ORANGE);

    }

    private void rovnoramenyPravouhlyTrojuhelnik(double velikostStrany,Color barva) {
        zofka.setPenColor(barva);
        zofka.turnRight(90);
        var velikostPrepony = Math.sqrt(2*Math.pow(velikostStrany, 2));
        zofka.move(velikostStrany);
        zofka.turnLeft(90);
        zofka.move(velikostStrany);
        zofka.turnLeft(135);
        zofka.move(velikostPrepony);
    }

    private void kruh(double polomer, Color barva) {
        zofka.setPenColor(barva);
        zofka.penUp();
        zofka.move(polomer);
        zofka.turnRight(90);
        zofka.penDown();
        for (int k = 0; k < 72; k++) {
            zofka.move(5);
            zofka.turnRight(5);
        }
    }

    private void obdelnik(double delkaA, double delkaB, Color barva) {
        zofka.setPenColor(barva);
        for (int i = 0; i < 2; i++) {
            zofka.move(delkaA);
            zofka.turnRight(90);
            zofka.move(delkaB);
            zofka.turnRight(90);
        }
    }

    private void trojuhelnikRovnostranny(double delka, Color barva) {
        zofka.setPenColor(barva);
        for (int i = 0; i < 3; i++) {
            zofka.move(delka);
            zofka.turnRight(120);
        }
    }

    private void ctverec(double delka, Color barva) {
        zofka.setPenColor(barva);
        for (int i = 0; i < 4; i++) {
            zofka.move(delka);
            zofka.turnRight(90);
        }
    }

    public static void main (String[]args){
            new HlavniProgram().start();
        }

    }
