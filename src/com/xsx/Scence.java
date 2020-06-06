package com.xsx;

import com.xsx.ArrowSummary.*;
import com.xsx.Line.ArrowLine;
import com.xsx.Line.DoubleArrowLine;
import com.xsx.Line.StraightLine;
import com.xsx.Rectangle.*;
import com.xsx.utils.Ui;

import java.util.Scanner;

public class Scence {
    Ui ui = new Ui();

    public Point inputPoint1() {
        Point point = new Point();
        Scanner s = new Scanner(System.in);
        ui.inputpoint1();
        String words = s.nextLine();
        String[] p = words.split(",");
        point.setX(p[0]);
        point.setY(p[1]);
        return point;
    }

    public Point inputPoint2() {
        Point point = new Point();
        Scanner s = new Scanner(System.in);
        ui.inputpoint2();
        String words = s.nextLine();
        String[] p = words.split(",");
        point.setX(p[0]);
        point.setY(p[1]);
        return point;
    }

    public void startDraw() {
        Scanner s = new Scanner(System.in);
        while (true) {
            ui.displayinit();
            int num = s.nextInt();
            if (num == 0) {
                System.exit(0);
            }
            if(num==1){
                while (true){
                    ui.displayLine();
                    int numx = s.nextInt();
                    if (numx==1){
                        StraightLine straightLine=new StraightLine(this.inputPoint1(),this.inputPoint2());
                        straightLine.drawElement();
                        break;
                    }
                    else if (numx==2){
                        ArrowLine arrowLine=new ArrowLine(this.inputPoint1(),this.inputPoint2());
                        arrowLine.drawElement();
                        break;
                    }
                    else if (numx==3){
                        DoubleArrowLine doubleArrowLine=new DoubleArrowLine(this.inputPoint1(),this.inputPoint2());
                        doubleArrowLine.drawElement();
                        break;
                    }
                    else {
                        System.out.println("输入有误,请重新输入.");
                    }
                }
            }
            else if(num==2){
                while (true){
                    ui.displayRectAngle();
                    int numx = s.nextInt();
                    if (numx==1){
                        Rectangle rectangle=new Rectangles(this.inputPoint1(),this.inputPoint2());
                        rectangle.drawElement();
                        break;
                    }
                    else if (numx==2){
                        RoundedRectangle roundedRectangle=new RoundedRectangle(this.inputPoint1(),this.inputPoint2());
                        roundedRectangle.drawElement();
                        break;
                    }
                    else if (numx==3){
                        MinusSingleCornerRectangle minusSingleCornerRectangle=new MinusSingleCornerRectangle(this.inputPoint1(),this.inputPoint2());
                        minusSingleCornerRectangle.drawElement();
                        break;
                    }
                    else if (numx==4){
                        MinusTheSameSideAngleRectangle minusTheSameSideAngleRectangle=new MinusTheSameSideAngleRectangle(this.inputPoint1(),this.inputPoint2());
                        minusTheSameSideAngleRectangle.drawElement();
                        break;
                    }
                    else if (numx==5){
                        SubtractDiagonalRectangle subtractDiagonalRectangle=new SubtractDiagonalRectangle(this.inputPoint1(),this.inputPoint2());
                        subtractDiagonalRectangle.drawElement();
                        break;
                    }
                    else {
                        System.out.println("输入有误,请重新输入.");
                    }
                }
            }
            else if(num==3){
                while (true){
                    ui.displayArrowSummary();
                    int numx = s.nextInt();
                    if (numx==1){
                        LeftArrow leftArrow=new LeftArrow(this.inputPoint1(),this.inputPoint2());
                        leftArrow.drawElement();
                        break;
                    }
                    else if (numx==2){
                        RightArrow rightArrow=new RightArrow(this.inputPoint1(),this.inputPoint2());
                        rightArrow.drawElement();
                        break;
                    }
                    else if (numx==3){
                        UpArrow upArrow=new UpArrow(this.inputPoint1(),this.inputPoint2());
                        upArrow.drawElement();
                        break;
                    }
                    else if (numx==4){
                        DownArrow downArrow=new DownArrow(this.inputPoint1(),this.inputPoint2());
                        downArrow.drawElement();
                        break;
                    }
                    else if (numx==5){
                        LeftRightArrow leftRightArrow=new LeftRightArrow(this.inputPoint1(),this.inputPoint2());
                        leftRightArrow.drawElement();
                        break;
                    }
                    else {
                        System.out.println("输入有误,请重新输入.");
                    }
                }
            }
        }
    }
}
