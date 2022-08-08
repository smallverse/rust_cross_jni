package com.example.rust_cross_jni;

/**
 * @author Administrator
 */
public class RustCrossJni {
    static {
    //        System.loadLibrary("cross_platform_lib_jni");
    System.load(
        "C:\\resources\\zhaijf\\rust_cross_jni\\src\\main\\resources\\cross_platform_lib_jni.dll");
    }

    public static native int add(int a, int b);

    public static native String gen_quaternion_str(float x,float y,float z,float w);


    public static void main(String[] args) {
        int sum = RustCrossJni.add(1, 1);
        System.out.println(sum);

        String eq = RustCrossJni.gen_quaternion_str(10, 0, 1, 1);
        System.out.println(eq);
    }
}
