package org.fenixsoft.jvm.chapter10.jdk8;

public class BADLY_NAMED_CODE {

    enum colors {
        red, blue, green;
    }

    static final int _FORTY_TWO = 42;

    public static int NOT_A_CONSTANT = _FORTY_TWO;

    protected void Test() {
        return;
    }

    public void NOTcamelCASEmethodNAME() {
        return;
    }
}
