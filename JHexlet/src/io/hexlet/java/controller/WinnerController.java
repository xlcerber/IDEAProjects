package io.hexlet.java.controller;

import io.hexlet.java.model.Field;
import io.hexlet.java.model.Point;

public class WinnerController {


        public String getWinner(final Field field) {

                String winner;

                winner = getWinnerByCheckingAllRow(field);
                if (winner != null) return winner;

                winner = getWinnerByCheckingAllColumn(field);
                if (winner != null) return winner;

                winner = getWinnerByCheckingDiagonals(field);
                if (winner != null) return winner;

                return null;
        }

        public String getWinnerByCheckingAllRow(final Field field){

                String winner;

                for (int rowNum = 0; rowNum < field.getSize(); rowNum++) {
                        winner =  getWinnerByCheckingRow(field, rowNum);
                        if (winner != null) {return winner;}
                }
                return null;
        }

        public String getWinnerByCheckingRow(final Field field, final int rowNum) {

                String figure = field.getFigure(new Point(0, rowNum));

                for (int colNum = 1; colNum < field.getSize(); colNum++) {
                        if (figure == null || !figure.equals(field.getFigure(new Point(colNum, rowNum)))) {
                                return null;
                        }
                }
                return figure;
        }

        public String getWinnerByCheckingAllColumn(final Field field){

                String winner;

                for (int colNum = 0; colNum < field.getSize(); colNum++) {
                        winner =  getWinnerByCheckingColumn(field, colNum);
                        if (winner != null) {return winner;}
                }
                return null;
        }

        public String getWinnerByCheckingColumn(final Field field, final int colNum) {

                String figure = field.getFigure(new Point(colNum,0));

                for (int rowNum = 1; rowNum < field.getSize(); rowNum++) {
                        if (figure == null || !figure.equals(field.getFigure(new Point(colNum,rowNum)))) {
                                return null;
                        }
                }
                return figure;
        }

        public String getWinnerByCheckingDiagonals(final Field field){

                String winner = null;
                int size = field.getSize();
                int num = 1;

                String figureUp = field.getFigure(new Point(0,0));
                String figureDown = field.getFigure(new Point(0 ,size - 1));

                while (num < size && (figureUp != null || figureDown != null) ) {

                        if (figureUp == null || !figureUp.equals(field.getFigure(new Point(num,num)))) {
                                figureUp = null;
                        }

                        if (figureDown == null || !figureDown.equals(field.getFigure(new Point(num, (size - 1) - num)))) {
                                figureDown = null;
                        }

                        num ++;

                };

                if (figureUp != null) winner = figureUp;
                if (figureDown != null) winner = figureDown;

                return winner;
        }

}

//        p1.x = 0;
//        p2.x = 1;
//        p3.x = 2;

//        p1.y = i;
//        p2.y = i;
//        p3.y = i;

//        if (field.getFigure(p1) != null && field.getFigure(p2) != null
//        && field.getFigure(p3) != null &&
//        field.getFigure(p1).equals(field.getFigure(p2)) &&
//        field.getFigure(p1).equals(field.getFigure(p3))) {
//        return field.getFigure(p1);


