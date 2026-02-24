package com.teaching.oop;

import com.teaching.exceptions.InvalidDimensionException;

/**
 * Concrete subclass of Shape. Demonstrates a checked exception thrown from a constructor
 * when the caller supplies an invalid dimension.
 */
public class Rectangle extends Shape {

    private final double width;
    private final double height;

    public Rectangle(String colour, double width, double height) throws InvalidDimensionException {
        super(colour);
        if (width <= 0 || height <= 0) {
            throw new InvalidDimensionException(
                "Width and height must be positive. Got: width=" + width + ", height=" + height);
        }
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    public double getWidth()  { return width; }
    public double getHeight() { return height; }
}
