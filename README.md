# ProjectBasics
* Min SDK 14 (Android 4.0.1 Ice cream sandwich)
* Written in Java
* This library performs basic required tasks like Rate App, Share App,etc with a single line of code.

# Installation
>Add this into your root build.gradle file:
```
allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
  ```

>Add the dependency to your module build.gradle:
```
dependencies {
	        compile 'com.github.OsmAndroid:ProjectBasics:1.0'
	}

  ```
  
  # Usage


 > ProjectBasics library performs simple tasks which are required in almost every app like:
  * Rate App

  * More Apps 
  * Feedback (via mail)
  * Follow on Facebook
  
  > The tasks are simple and can be achieved in a single line of code.
  
  * For example, to launch Play Store to rate your app or any other app:
  ```
  Task.RateApp(context, "PackageName");
  ```
  
  
  * More Apps(To show all apps under your Developer account):
   ```
  Task.MoreApps(context,"DeveloperName");
 ```

  
  
  * Feedback (Take feedback via mail)
  

   ```
   Task.Feedback(context,"your mail id","Subject");
  ```
  
  * Follow on Facebook (Launch your Facebook page in app if available or in browser to like your page)

  ```
  Task.FollowOnFb(context,"PageId","Page link");
  ```
  
