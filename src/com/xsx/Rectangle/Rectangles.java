package com.xsx.Rectangle;

import com.xsx.Point;

public class Rectangles extends Rectangle{
    public Rectangles(Point firstPoint, Point secondPoint) {
        super(firstPoint, secondPoint);
    }

    @Override
    public void drawElement() {
        System.out.println("绘制了一个起点为（"+this.getFirstPoint().getX()+","+this.getFirstPoint().getY()+")"+"对角点为("+this.getSecondPoint().getX()+","+this.getSecondPoint().getY()+")的直角矩形");
    }
}
