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
