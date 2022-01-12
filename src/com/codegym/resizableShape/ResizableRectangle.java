package com.codegym.resizableShape;

import com.codegym.shape.Rectangle;

public class ResizableRectangle extends Rectangle implements Resizable {
    public ResizableRectangle() {
    }

    public ResizableRectangle(double width, double length) {
        super(width, length);
    }

    public ResizableRectangle(double width, double length, String color, boolean filled) {
        super(width, length, color, filled);
    }

    @Override
    public void resize(double percent) {
        double scale = percent /100;
        setWidth(getWidth()*scale);
        setLength(getLength()*scale);
    }
}
