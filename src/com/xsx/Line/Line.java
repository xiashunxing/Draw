package com.xsx.Line;

import com.xsx.Graphic;
import com.xsx.IElement;
import com.xsx.Point;

public abstract class Line extends Graphic{
    private Point firstPoint;
    private Point secondPoint;


    public Line(Point firstPoint, Point secondPoint) {
        super(firstPoint, secondPoint);
    }
}
