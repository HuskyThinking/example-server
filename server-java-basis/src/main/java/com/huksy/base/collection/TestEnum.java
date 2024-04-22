package com.huksy.base.collection;

import java.util.Objects;

/**
 * @author Axin
 * @version 1.0
 * @description: 枚举类示例
 * @date 2024/3/7 23:32
 */
public enum TestEnum {

    ET01("ET01", "承兑"),
    ET02("ET02", "保证"),
    ET03("ET03", "质押"),
    ET04("ET04", "质押解除"),
    ET05("ET05", "转让背书"),
    ET06("ET06", "止付/冻结"),
    ET07("ET07", "解除止付/冻结"),
    ET08("ET08", "保证增信"),
    ET09("ET09", "提示付款"),
    ET10("ET10", "追索"),
    ET11("ET11", "电票转入"),
    ET12("ET12", "转托管"),
    ET13("ET13", "买断式回购"),
    ET14("ET14", "回购式贴现"),
    ET15("ET15", "回购式贴现赎回"),
    ET16("ET16", "增信"),
    ET17("ET17", "买断式回购赎回"),
    ET18("ET18", "权属初始登记"),
    ET19("ET19", "质押式回购"),
    ET20("ET20", "质押式回购赎回"),
    ET21("ET21", "再贴现质押式回购"),
    ET22("ET22", "再贴现质押式回购赎回");

    private final String code;
    private final String name;

    TestEnum(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public static String getNameByCode(String code) {
        TestEnum[] values = TestEnum.values();
        for (TestEnum val : values) {
            if (Objects.equals(code, val.code)) {
                return val.name;
            }
        }
        return null;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }
}
