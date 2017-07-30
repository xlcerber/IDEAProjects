package io.hexlet.java.view;

import io.hexlet.java.model.Field;
import io.hexlet.java.model.Point;

public interface ICoordinateGetter {
    public Point getMoveCoordinate(Field field);
}
