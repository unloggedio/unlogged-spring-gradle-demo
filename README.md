# Springboot Mega Application (Gradle)

This application tries to use every spring 3rd party integration available (with a gradle springboot application as it's base).

This project meant to be a playground for testing Unlogged SDK and Plugin.

The dependencies are already setup for this project, you can clone this repository and get started.

Add unlogged-sdk dependency
1. Add unlogged-sdk to ```build.gradle```.
   The dependency :
```groovy
dependencies
{
   implementation 'video.bug:unlogged-sdk:{latest-version}'
   annotationProcessor 'video.bug:unlogged-sdk:{latest-version}'
}
```

2. Add ```@Unlogged``` annotation over the main method of the project/module you want to run.
   Like :
```java
   @SpringBootApplication
   public class UnloggedDemoApplication {

   @Unlogged
   public static void main(String[] args) {
   SpringApplication.run(UnloggedDemoApplication.class, args);
   }
```
}

3. Then clean and build your project.

   `gradle clean build`

**Additional requirements :**
- You will need an instance of mysql running locally. Create a database with the same name as the one in ```Application.properties``` to get started.
- Make sure you also have redis installed and running.

   Start your project in **Debug mode** from intelliJ idea and enjoy.


