package com.example.training.constant;

public enum ViewNameEnum {
    LOGIN("login"),
    DETAIL("empDetail"),
    SEARCH("empList");

    // フィールドの定義
    private String name;

    // コンストラクタの定義
    private ViewNameEnum(String name) {
        this.name = name;
    }

    // メソッド
    public String getValue() {
        return this.name;
    }
}