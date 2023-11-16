package com.softserve.edu09.pt.Task1;

public class HeavyBox {
        private int weight;
        private String content;

        public HeavyBox(int weight, String content) {
            this.weight = weight;
            this.content = content;
        }

        @Override
        public String toString() {
            return "HeavyBox{" +
                    "weight=" + weight +
                    ", content='" + content + '\'' +
                    '}';
        }

        public int getWeight() {
            return weight;
        }

        public void setWeight(int weight) {
            this.weight = weight;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }
    }
