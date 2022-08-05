# [Rust Jni](https://github.com/smallverse/rust_practice/tree/main/cross_platform_lib_jni)

## javah 生成头c++文件(jdk 1.8 可用)
> main/java 下执行
```shell
# javah
javah com.example.rust_cross_jni.RustCrossJni
# ls show
Mode                 LastWriteTime         Length Name
----                 -------------         ------ ----

```
## javac 生成头c++文件(jdk 11可用，新版JDK已经用javac -h 来代替javah)
> 当前文件夹下执行
```shell
# javac
javac -h . RustCrossJni.java
# ls show
Mode                 LastWriteTime         Length Name
----                 -------------         ------ ----

```

https://juejin.cn/post/7092750468631740452
