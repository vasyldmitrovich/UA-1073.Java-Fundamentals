package com.softserve.edu04.hw;

public class http {
    public static void main(String[] args) {
        int errorcode1 = 401;
        HTTPError error = HTTPError.getHTTPError(errorcode1);
        if (error != null) {
            System.out.println("HTTP Error: " + error);
        } else {
            System.out.println("Unknown HTTP Error: " + errorcode1);
        }

    }

    enum HTTPError {
        NOT_FOUND(404, "Not Found"), UNAUTHORIZED(401, "Unauthorized"), PAYMENT_REQUIRED(402, "Payment Required");

        HTTPError(int x, String name) {
            this.x = x;
            this.name = name;
        }

        private final int x;
        private final String name;

        public int getX() {
            return x;
        }

        public String getName() {
            return name;
        }

        public static HTTPError getHTTPError(int code) {
            for (HTTPError error : HTTPError.values()) {
                if (error.getX() == code) {
                    return error;
                }
            }
            return null;
        }
    }
}




