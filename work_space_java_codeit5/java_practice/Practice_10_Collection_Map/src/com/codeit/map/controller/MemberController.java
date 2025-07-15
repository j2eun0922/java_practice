package com.codeit.map.controller;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import com.codeit.map.model.Member;

public class MemberController {
    private final Map<String, Member> map = new HashMap<>();

    public MemberController() {
        map.put("test1", new Member("1234", "홍길동"));
        map.put("test2", new Member("1234", "홍길동"));
        map.put("test3", new Member("1234", "홍길동"));
        map.put("test4", new Member("1234", "홍길동"));
        map.put("test5", new Member("1234", "홍길동"));
    }

    public boolean joinMembership(String id, Member m) {
        // 여기 채우세요.
        for (String key : map.keySet()) {
            if (id.equals(key))
                return false;
        }
        m.setId(id);
        map.put(id, m);
        return true;
    }

    public String login(String id, String password) {
        // 여기 채우세요.
        for (String key : map.keySet()) {
            if (id.equals(key) && password.equals(map.get(key).getPassword()))
                return map.get(key).getName();
        }
        return null;
    }

    public boolean changePassword(String id, String oldPw, String newPw) {
        // 여기 채우세요.
        for (String key : map.keySet()) {
            if (id.equals(key) && oldPw.equals(map.get(key).getPassword())) {
                map.get(key).setPassword(newPw);
                return true;
            }
        }
        return false;
    }

    public boolean changeName(String id, String newName) {
        // 여기 채우세요.
        for (String key : map.keySet()) {
            if (id.equals(key)) {
                map.get(key).setName(newName);
                return true;
            }
        }
        return false;
    }

    public TreeMap<String, Member> sameName(String name) {
        // 여기 채우세요.
        TreeMap<String, Member> temp = new TreeMap<>();
        for (String key : map.keySet()) {
            if (name.equals(map.get(key).getName())) {
                temp.put(key, map.get(key));
            }
        }
        return temp;
    }
}















