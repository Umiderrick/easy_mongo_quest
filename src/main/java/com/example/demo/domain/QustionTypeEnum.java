package com.example.demo.domain;

public enum  QustionTypeEnum {

    TEXT("文本", 1),
    OPT("单选", 2),
    OPTS("多选", 3),
    IMG("上传图片", 4),
    URL("地址", 4);
    // 成员变量
    private String name;
    private int index;
    // 构造方法
    QustionTypeEnum(String name, int index) {
        this.name = name;
        this.index = index;
    }


}
