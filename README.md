# TwitchApp
An app that consumes the [Twitch API](https://github.com/justintv/Twitch-API/blob/master/v3_resources/games.md#get-gamestop) and dysplays the top 50 games being played. 

###Getting started
Clone the repository and import the project in Android Studio, you can try the app installing the `twicthapp.apk` available in the project root.

###Dependencies
The depdendencies for the project are described in the Gradle script `build.gradle` of the app, just sync the project in Android Studio and you are ready to go :)

List of third party libraries used in the project so far
- [Butterknife](https://github.com/JakeWharton/butterknife) - A view injection library that makes the binding between views, methods and resourses declared in XML and the activities/fragments classes.
- [Retrofit/OKhttp](http://square.github.io/retrofit/) - A type-safe REST client for Android and Java
- [Gson](https://github.com/google/gson) - Gson is a Java library that can be used to convert Java Objects into their JSON representation.
- [Picasso](http://square.github.io/picasso/) - A powerful image downloading and caching library for Android

###Running it
You can [build and run](https://developer.android.com/tools/building/building-studio.html) the project using the Android Studio/Gradle. You need an [android emulator](http://developer.android.com/tools/devices/emulator.html) or a [real device](http://developer.android.com/tools/device.html) to test the build.

###Screenshots
![](app_gif.gif)
RE