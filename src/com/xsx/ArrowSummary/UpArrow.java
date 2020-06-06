package com.xsx.ArrowSummary;

import com.xsx.Point;

public class UpArrow extends Arrow{
    public UpArrow(Point firstPoint, Point secondPoint) {
        super(firstPoint, secondPoint);
    }

    @Override
    public void drawElement() {
        System.out.println("绘制了一条起点为（"+this.getFirstPoint().getX()+","+this.getFirstPoint().getY()+")"+"对角点为("+this.getSecondPoint().getX()+","+this.getSecondPoint().getY()+")的上箭头");

    }
}
