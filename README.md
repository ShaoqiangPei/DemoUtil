[![](https://jitpack.io/v/ShaoqiangPei/DemoUtil.svg)](https://jitpack.io/#ShaoqiangPei/DemoUtil)

#### 使用说明
在你项目的project对应的build.gradle下添加如下代码：
```
	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```
若当前版本为1.0.0，那么你要在自己app module 对应的build.gradle下添加如下引用：
```
dependencies {
	        implementation 'com.github.ShaoqiangPei:DemoUtil:1.0.0'
	}
```
在你项目的 app_moduel 中自定义一个application,继承于 ComContext,类似如下：
```
public class AppContext extends ComContext{

    @Override
    public void onCreate() {
        super.onCreate();
    }

}
```
在 mainfast.xml 中声明此 application 类，类似如下：
```
    <application
        android:name="com.app.AppContext"
	//以下省略
	//...... />
```
