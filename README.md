Fruitypedia Appium
----------------------------
[Appium](http://appium.io/) is an open-source tool for automating native mobile applications in both iOS and Android. [Cucumber](https://cucumber.io/) is a popular BDD framework to describe testing scenarios.


#### Requirements

- [Appium Server](https://appium.io/) version: `2.2.2`

#### To run the project
```bash
appium --base-path=/wd/hub
gradle testDebug
```

#### Read this as reference

https://josdem.io/techtalk/android/appium_cucumber_junit5/

**Note:** This project uses [Fruitypedia](https://github.com/josdem/fruitypedia) as a target Android product