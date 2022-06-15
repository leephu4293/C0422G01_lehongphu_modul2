package abtract_interface.bai_tap.bt1;

import abtract_interface.bai_tap.bt2.IColorable;

public class Square extends Retange implements Resizeable {
        public Square() {
        }
        public Square(double side) {
            super(side, side);
        }

        public Square(double side, String color, boolean filled) {
            super(side, side, color, filled);
        }

        public double getSide() {
            return getWidth();
        }

        public void setSide(double side) {
            setWidth(side);
            setLength(side);
        }

        @Override
        public void setWidth(double width) {
            setSide(width);
        }

        @Override
        public void setLength(double length) {
            setSide(length);
        }

        @Override
        public String toString() {
            return "A Square with side="
                    + getSide();
        }


}
