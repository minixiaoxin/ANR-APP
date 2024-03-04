# ANR-APP

此工具用作在Android中主动触发ANR异常。



## 1、编译方法

在IDEA中使用Gradle进行编译

- Gradle编译APK

IDEA触发编译APK文件，编译时`build.gradle`编译文件中版本配置为`compileSdk 34`，要求大于等于34版本。


![image-20231221163100185](https://github.com/minixiaoxin/ANR-APP/assets/45511100/67fe7ee3-6803-4d34-b077-9476dbdfb4d1)


编译完成后会在apk/debug/路径下生成apk文件：

![image-20231221163127589](https://github.com/minixiaoxin/ANR-APP/assets/45511100/272fc7c5-b380-46b2-9aaa-5b0bf697aa7d)


- 验证APK

在root权限下`adb install -r app.apk`安装进Android设备，打开应用，3-7s内会触发ANR：

![image-20231221163345394](https://github.com/minixiaoxin/ANR-APP/assets/45511100/35af8c3c-f22e-47ce-8c66-8ff18c33dbae)


![image-20231221163420611](https://github.com/minixiaoxin/ANR-APP/assets/45511100/19631ec4-3c9d-451b-8f3e-1989fe45c6e9)


**注：**在非root权限下安装，不会生效。


## 2、APK应用路径

ANR-APP\app\build\outputs\apk\debug



