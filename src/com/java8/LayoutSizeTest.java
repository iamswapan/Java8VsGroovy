package com.java8;

/**
 * Created by ttnd on 18/7/18.
 */
public class LayoutSizeTest {
    public static void main(String[] args) {
        System.out.println(LayoutSize.valueOf("SMALL"));
    }
}


enum LayoutSize {
    DEFAULT("Default"),
    SMALL("Small"),
    MEDIUM("Medium"),
    LARGE("Large");

    private final String layoutSize;

    private LayoutSize(String layoutSize) {
        this.layoutSize = layoutSize;
    }

    public String getValue() {
        return this.layoutSize;
    }

    public static LayoutSize getEnumByValue(String value) {
        LayoutSize[] var1 = values();
        int var2 = var1.length;

        for(int var3 = 0; var3 < var2; ++var3) {
            LayoutSize layoutSize = var1[var3];
            if(value.equalsIgnoreCase(layoutSize.getValue())) {
                return layoutSize;
            }
        }

        return null;
    }
}
