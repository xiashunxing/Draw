package com.xsx.Line;

import com.xsx.Line.Line;
import com.xsx.Point;

public class StraightLine extends Line {

    public StraightLine(Point firstPoint, Point secondPoint) {
        super(firstPoint, secondPoint);
    }

    @Override
    public void drawElement() {

        System.out.println("绘制了一条起点为（"+this.getFirstPoint().getX()+","+this.getFirstPoint().getY()+")"+"终点为("+this.getSecondPoint().getX()+","+this.getSecondPoint().getY()+")的直线");
    }


}
