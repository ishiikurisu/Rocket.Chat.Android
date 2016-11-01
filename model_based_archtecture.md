[README](README.md) > Model-based archtecture

![overview](https://cloud.githubusercontent.com/assets/11763113/19895301/96e43f6a-a093-11e6-804a-f11cfa61c555.png)

* UI rarely calls API directly, it just renders models
* Background service observes models and call API if needed, and update model after API callback and so on