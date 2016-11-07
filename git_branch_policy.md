[README](README.md) > git branch policy

![slice](https://cloud.githubusercontent.com/assets/11763113/20059265/ad517552-a538-11e6-8e80-b1899623d6ed.png)

* `master` branch is synced with Google Play deployment using [gradle-play-publisher](https://github.com/Triple-T/gradle-play-publisher)
* `develop` branch is semi-master branch, all pull request should be based on this branch.
* each function development is on `feature/xxx` branch and it is merged into develop branch via pull request / review.
