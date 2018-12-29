package com.luma.web.controller;

/**
 * @author 飞鸟
 * @date 2018/12/29 - 21:00
 */
public class IndexController {
    public void showIndex() {
        System.out.println("Hello World IndexController");
    }

    public static void main(String[] args) {
        IndexController index = new IndexController();
        index.showIndex();
    }
}
