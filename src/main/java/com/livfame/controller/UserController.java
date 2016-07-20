package com.livfame.controller;

import com.livfame.domain.User;
import com.livfame.service.UserService;
import com.livfame.util.JsonUtil;
import spark.Spark;

public class UserController {

    final UserService userService;

    public UserController(final UserService userService) {
        this.userService = userService;
    }

    public void show() {
        Spark.get("/user/:id", (req, res) ->
                        userService.getUser(req.params(":id")), JsonUtil.json()
        );
    }

    public void save() {
        Spark.post("/user", (req, res) ->
                        userService.save(JsonUtil.fromJson(req.body(), User.class)), JsonUtil.json()
        );
    }

    public void saveWithOutJava8Lamda() {
       /* Spark.post("/user1", new Route() {
                    @Override
                    public Object handle(Request request, Response response) throws Exception {
                        User user = JsonUtil.fromJson(request.body(), User.class);
                        User user1 = userService.save(user);
                        return JsonUtil.toJson(user1);
                    }
                }

        );*/

        Spark.post("/user1", (request, response) -> {
                    User user = JsonUtil.fromJson(request.body(), User.class);
                    return userService.save(user);
                }, JsonUtil.json()
        );
    }

}
