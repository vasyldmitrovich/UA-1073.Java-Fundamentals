package com.softserve.edu04.hw.Task3;

enum HTTPError {
    UNAUTORIZED(401, "Unauthorized"), NOTFOUND(404, "Not Found"),
    INTERNETSERVERERROR(500, " Internal Server Error");
    private final int problem;
    private final String problemName;

    HTTPError(int problem, String problemName) {
        this.problem = problem;
        this.problemName = problemName;
    }

    public static HTTPError fintError(int problem) {
        for (HTTPError error : HTTPError.values()) {
            if (error.getProblem() == problem) {
                return error;
            }
        }
        return null;
    }

    public int getProblem() {
        return problem;
    }

    public String getProblemName() {
        return problemName;
    }
}

