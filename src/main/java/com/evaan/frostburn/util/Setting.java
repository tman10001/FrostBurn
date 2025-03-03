package com.evaan.frostburn.util;

import com.evaan.frostburn.module.Module;

import java.util.ArrayList;

/**
 * @Author evaan
 * https://github.com/evaan
 */
public class Setting<T> {
    String name;
    Module parent;
    T value, min, max;
    ArrayList<T> options;
    Type type;

    public String getName() {return name;}
    public Module getParent() {return parent;}
    public T getValue() {return value;}
    public T getMin() {return min;}
    public T getMax() {return max;}
    public ArrayList<T> getOptions() {return options;}
    public Type getType() {return type;}

    public void setValue(T value) {this.value = value;}

    public Setting(String name, Module parent, T value) {
        this.name = name;
        this.parent = parent;
        this.value = value;
        this.type = Type.BOOLEAN;
    }

    public Setting(String name, Module parent, T value, T min, T max) {
        this.name = name;
        this.parent = parent;
        this.value = value;
        this.min = min;
        this.max = max;
        this.type = Type.INTEGER;
    }

    public Setting(String name, Module parent, ArrayList<T> options, T value) {
        this.name = name;
        this.parent = parent;
        this.value = value;
        this.options = options;
        this.type = Type.STRING;
    }

    public enum Type {BOOLEAN, INTEGER, STRING}
}
