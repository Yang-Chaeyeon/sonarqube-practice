package com.example.sonarqubePractice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class SmellyController {

    // 전역 상태(스레드 안전성 문제 유발)
    public static List<String> users = new ArrayList<>();

    // 매직 넘버
    private static final int DISCOUNT = 5;

    @GetMapping("/add")
    public String addUser(String name) {
        // null 체크 없음
        users.add(name);

        // 하드코딩 비교
        if ("admin".equals(name)) {
            return "Super user logged in!";
        }
        return "Welcome " + name;
    }

    @GetMapping("/users")
    public String listUsers() {
        // 중복된 조건문(리팩터링 대상)
        if (users.size() > 0) {
            System.out.println("Users exist");
        }
        if (users.size() > 0) {
            System.out.println("We have users");
        }

        // 하드코딩된 비밀번호(취약)
        String password = "1234";
        return "Users: " + users + " / password=" + password + " / discount=" + DISCOUNT;
    }
}
