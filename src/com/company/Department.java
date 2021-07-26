package com.company;

import java.util.HashMap;
import java.util.Map;

public enum Department {
    Management (1), SalesAndMarketing (2), HR (3),
    Accounting(4), SystemAdministration(5), IT(6), BusinessAnalysis(7);

    private static final Map<Integer, Department> BY_NUMBER = new HashMap<>();

    static {
        for (Department d : values()) {
            BY_NUMBER.put(d.number, d);
        }
    };

    public final int number;

    private Department(int number) {
        this.number = number;
    };

    public static Department departmentByNumber (int number) {
        return BY_NUMBER.get(number);
    };

}
