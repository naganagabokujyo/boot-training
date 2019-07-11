package com.example.training.constant;

public enum NumEnum {
    ONE(1),
    TWO(2),
    THREE(3),
    FOUR(4),
    FIVE(5),
    SIX(6),
    SEVEN(7),
    EIGHT(8),
    NINE(9),
    TEN(10),
    ELEVEN(11),
    TWELVE(12);

    // フィールドの定義
    private int num;

    // コンストラクタの定義
    private NumEnum(int num) {
        this.num = num;
    }

    // メソッド
    public int getValue() {
        return this.num;
    }
}