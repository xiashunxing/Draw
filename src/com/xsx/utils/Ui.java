package com.xsx.utils;

import com.xsx.Line.ArrowLine;

public class Ui {
    public void displayinit(){
        System.out.println("请选择您需要绘制的形状类型(请输入1-3,输入0结束):");
        System.out.println("1.线条; 2.矩形; 3.箭头总汇");
    }
    public void inputpoint1(){
        System.out.println("请输入点①(用,隔开):");
    }
    public void inputpoint2(){ System.out.println("请输入点②(用,隔开):"); }

    public void displayLine(){
        System.out.println("请选择您需要绘制的线条形状:");
        System.out.println("1.直线; 2.箭头直线; 3.双箭头直线");
    }
    public void displayRectAngle(){
        System.out.println("请选择您需要绘制的矩形形状:");
        System.out.println("1.直角矩形; 2.圆角矩形; 3.减去单角矩形; 4.减去同侧角矩形; 5.减去对角矩形");
    }
    public void displayArrowSummary(){
        System.out.println("请选择您需要绘制的箭头总汇形状:");
        System.out.println("1.向左箭头; 2.向右箭头; 3.向上箭头; 4.向下箭头; 5.左右箭头");
    }
}
