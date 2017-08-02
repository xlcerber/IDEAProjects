package io.hexlet.java.controller;

import io.hexlet.java.model.Field;
import io.hexlet.java.model.Figure;
import io.hexlet.java.model.Point;
import io.hexlet.java.model.exceptions.InvalidPointException;

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

                try {
                        Figure figure = field.getFigure(new Point(0, rowNum));

                        for (int colNum = 1; colNum < field.getSize(); colNum++) {
                                if (figure == null || !figure.equals(field.getFigure(new Point(colNum, rowNum)))) {
                                        return null;
                                }
                        }

                        return figure.toString();
                } catch (InvalidPointException e) {
                        System.out.println(e.getMessage());
                        return null;
                }
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

                try {
                        Figure figure = field.getFigure(new Point(colNum, 0));

                        for (int rowNum = 1; rowNum < field.getSize(); rowNum++) {
                                if (figure == null || !figure.equals(field.getFigure(new Point(colNum, rowNum)))) {
                                        return null;
                                }
                        }
                        return figure.toString();
                } catch (InvalidPointException e) {
                        System.out.println(e.getMessage());
                        return null;
                }
        }

        public String getWinnerByCheckingDiagonals(final Field field){

                String winner = null;
                int size = field.getSize();
                int num = 1;
                Figure figureUp = null;
                Figure figureDown = null;

                try {
                        figureUp = field.getFigure(new Point(0, 0));
                        figureDown = field.getFigure(new Point(0, size - 1));

                        while (num < size && (figureUp != null || figureDown != null)) {

                                if (figureUp == null || !figureUp.equals(field.getFigure(new Point(num, num)))) {
                                        figureUp = null;
                                }

                                if (figureDown == null || !figureDown.equals(field.getFigure(new Point(num, (size - 1) - num)))) {
                                        figureDown = null;
                                }

                                num++;

                        };

                } catch (InvalidPointException e) {
                        System.out.println(e.getMessage());
                }

                if (figureUp != null) winner = figureUp.toString();
                if (figureDown != null) winner = figureDown.toString();

                return winner;
        }

}

