package rikkei.academy;

public class Shape {
        private String color ;
        private boolean fills;

        public Shape() {
        }

        public Shape(String color, boolean fills) {
            this.color = color;
            this.fills = fills;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public boolean isFills() {
            return fills;
        }

        public void setFills(boolean fills) {
            this.fills = fills;
        }
    }

