package com.livfame;

import static spark.Spark.get;

public class DemoController {

    public void show() {
        get("/show:name", (req, res) -> "Hello !! Java");
    }

}
