package by.academy.lesson7.exercise;

import java.util.Arrays;

public class EnumRunner {
    public static void main(String[] args) {
        ProcessorType bit32 = ProcessorType.BIT_32;
        System.out.println(bit32.name());
        System.out.println(bit32.getTitle());
        ProcessorType[] values = ProcessorType.values();
        System.out.println(Arrays.toString(values));
        System.out.println(bit32.ordinal());

    }
}
