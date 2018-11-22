package com.bobo.patterns.responsibility;

import java.util.Objects;

public class Level {

    // 定义可以处理的等级
    private int value;

    public Level() {

    }

    // 构造注入方式设置等级
    public Level(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    // 重写 equals 方法用以判断是否可以处理请求
    @Override
    public boolean equals(Object obj) {

        if (obj instanceof Level) {

            Level level = (Level) obj;

            return this.getValue() == level.getValue();
        }

        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

}
