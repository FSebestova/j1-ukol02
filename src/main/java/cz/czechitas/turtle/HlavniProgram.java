package cz.czechitas.turtle;

import cz.czechitas.turtle.engine.*;

import java.awt.*;

public class HlavniProgram {
    private Turtle zofka = new Turtle();

    public void start() {

//        ctverec(45, Color.MAGENTA);

//        trojuhelnikRovnostranny(90, Color.GREEN);

//        obdelnik(100, 50, Color.CYAN);

//        kruh(3,Color.RED);

//        rovnoramenyPravouhlyTrojuhelnik(50, Color.ORANGE);

        masinka();

        snehulak();

        zmrzlina();


//





    }

    private void masinka() {
        zofka.setLocation(885.0,470.0);
        rovnoramenyPravouhlyTrojuhelnik(70, Color.ORANGE);
        zofka.setLocation(965.0,460.0);
        zofka.turnLeft(135);
        obdelnik(200, 100, Color.CYAN);
        zofka.setLocation(1020.0,490.0);
        kruh(2,Color.RED);
        zofka.setLocation(1090.0,493.0);
        zofka.turnRight(90);
        kruh(2,Color.MAGENTA);
        zofka.setLocation(1165.0,460.0);
        zofka.turnRight(90);
        obdelnik(150, 220, Color.GREEN);
        zofka.setLocation(1245.0,530.0);
        zofka.turnRight(90);
        kruh(6,Color.YELLOW);
    }

    private void snehulak() {
        zofka.setLocation(500.0,300.0);
        kruh(3,Color.CYAN);
        zofka.turnRight(90);
        zofka.setLocation(590.0,395.0);
        kruh(5,Color.CYAN);
        zofka.setLocation(450.0,420.0);
        kruh(2,Color.CYAN);
        zofka.setLocation(595.0,400.0);
        kruh(2,Color.CYAN);
        zofka.setLocation(610.0,540.0);
        zofka.turnRight(90);
        kruh(7,Color.CYAN);




    }

    private void zmrzlina() {
        zofka.setLocation(150.0,300.0);
        zofka.turnLeft(90);
        kruh(5,Color.RED);
        zofka.penUp();
        for (int i = 0; i <5; i++) {
            zofka.move(5);
            zofka.turnRight(5);
        }
        zofka.penDown();
        zofka.turnRight(65);
        trojuhelnikRovnostranny(110,Color.orange);
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

    private void kruh(double prumer, Color barva) {
        zofka.setPenColor(barva);
        zofka.turnRight(90);
        for (int k = 0; k < 72; k++) {
            zofka.move(prumer);
            zofka.turnRight(5);
        }
    }

    private void obdelnik(double delkaA, double delkaB, Color barva) {
        zofka.setPenColor(barva);
        for (int i = 0; i < 2; i++) {
            zofka.move(delkaA);
            zofka.turnLeft(90);
            zofka.move(delkaB);
            zofka.turnLeft(90);
        }
    }

    private void trojuhelnikRovnostranny(double delka, Color barva) {
        zofka.setPenColor(barva);
        for (int i = 0; i < 3; i++) {
            zofka.move(delka);
            zofka.turnLeft(120);
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
