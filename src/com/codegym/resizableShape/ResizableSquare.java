package com.codegym.resizableShape;

import com.codegym.shape.Square;

public class ResizableSquare extends Square implements Resizable {
    public ResizableSquare() {
    }

    public ResizableSquare(double side) {
        super(side);
    }

    public ResizableSquare(double side,String color, boolean filled) {
        super(color, filled, side);
    }

    @Override
    public void resize(double percent) {
        double scale = percent / 100;
        setSide(getSide() * scale);
    }
}
