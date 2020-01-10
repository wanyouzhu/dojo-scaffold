# 练功房脚手架

如果你恰好也用Java做练功房的练习，可以从这个脚手架开始入手。

准备步骤：

* `git clone https://github.com/gigix/dojo-scaffold.git`
* `mv dojo-scaffold my_kata && cd my_kata`
* `./gradlew clean build`
  * 如果你使用Windows，这一步应该是 `gradlew.bat clean build`

此时你应该看到成功的build：

```
$ ./gradlew clean build

BUILD SUCCESSFUL in 1s
4 actionable tasks: 4 executed
```

用Intellij IDEA或Eclipse或者你习惯的任何IDE（但是我强烈建议不要使用IDEA或Eclipse之外的其他IDE）导入工程，运行全部测试，你应该看到绿条。

从这里开始你的Dojo练习。

# 单位换算

## 任务分解

* [ ] 1 inch = 1 inch
* [ ] 1 foot = 12 inches
* [ ] 1 yard = 36 inches
* [ ] 1 yard = 3 feet
* [ ] 36 inches = 1 yard
* [ ] 12 inches = 1 foot
* [ ] 3 feet = 1 yard