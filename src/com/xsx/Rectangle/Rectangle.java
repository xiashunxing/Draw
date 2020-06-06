package com.xsx.Rectangle;

import com.xsx.Graphic;
import com.xsx.Point;

public abstract class Rectangle extends Graphic {
    private Point firstPoint;
    private Point secondPoint;

    public Rectangle(Point firstPoint, Point secondPoint) {
        super(firstPoint, secondPoint);
    }
}
