package com.mjc.stage2.entity;

public class SymbolLeaf extends AbstractTextComponent {

    private char value;

    public SymbolLeaf(final TextComponentType componentType, char value) {
        super(componentType);
        this.value = value;
    }

    @Override public String operation() {
        return String.valueOf(value);
    }

    @Override public void add(final AbstractTextComponent textComponent) {
        throw new UnsupportedOperationException();
    }

    @Override public void remove(final AbstractTextComponent textComponent) {
        throw new UnsupportedOperationException();
    }

    @Override public int getSize() {
        throw new UnsupportedOperationException();
    }

    // Write your code here!
}
