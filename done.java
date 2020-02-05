package com.example.geschool;

import android.text.Editable;

public class done {
    private String nat;
    private String val;

    public done(String nat, String val) {
        this.nat = nat;
        this.val = val;
    }

    public String getNat() {
        return nat;
    }

    public void setNat(String nat) {
        this.nat = nat;
    }

    public String getVal() {
        return val;
    }

    public void setVal(String val) {
        this.val = val;
    }
}
