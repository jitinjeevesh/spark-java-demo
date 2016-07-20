package com.livfame

import spark.Spark

class GroovyDemoController {

    static void show() {
        Spark.get '/show/:name', { req, res ->
            """Hello !! Groovy
            ${req.params(":name")}
            ${req.params()}"""
        }
    }
}
