package com.sample.test.demo.constants;

public enum ExpectedMessages {
    SUCCESS("Thank you for your order"),
    NAMEERROR("Missing name"),
    PHONEERROR("Missing phone number")
    ;

    private String displayName;

    private ExpectedMessages(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
