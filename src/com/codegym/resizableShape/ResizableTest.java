package com.codegym.resizableShape;

import java.util.Scanner;

public class ResizableTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ResizableCircle cir1 = new ResizableCircle(4, "white", true);
        ResizableRectangle rec1 = new ResizableRectangle(4, 9);
        ResizableSquare squ1 = new ResizableSquare(7, "blue", false);
        Resizable[] arr = new Resizable[]{cir1, rec1, squ1};

        System.out.println("Pre-resize:");
        System.out.print(ObjectArrayToString(arr));

        System.out.print("Enter new size(%): ");
        double percent = scanner.nextDouble();
        for (Resizable resizable : arr) {
            resizable.resize(percent);
        }

        System.out.println("After-resize:");
        System.out.print(ObjectArrayToString(arr));

    }

    public static String ObjectArrayToString(Object[] arr) {
        String res = "";
        for (Object obj : arr) {
            res = res.concat(obj.toString() + "\n");
        }
        return res;
    }
}
