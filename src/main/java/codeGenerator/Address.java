package codeGenerator;

/**
 * Created by mohammad hosein on 6/28/2015.
 */

public class Address {
    private final int num;
    private final TypeAddress typeAddress;
    private final varType varType;

    public Address(int num, varType varType, TypeAddress typeAddress) {
        this.num = num;
        this.typeAddress = typeAddress;
        this.varType = varType;
    }

    public Address(int num, varType varType) {
        this.num = num;
        this.typeAddress = new DirectAddress();
        this.varType = varType;
    }

    public String toString() {
        return getTypeAddress().toString(num);
    }

    public int getNum() {
        return num;
    }

    public TypeAddress getTypeAddress() {
        return typeAddress;
    }

    public varType getVarType() {
        return varType;
    }
}
