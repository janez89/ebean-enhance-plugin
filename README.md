# ebean-enhance-plugin v4.0.0

> A gradle plugin for enhancing ebean entities.

# Usage

```
plugins {
  id 'java'
  id 'com.github.kt3k.ebean.enhance' version '4.0.1'
}

ebeanEnhance {
  packages = 'com.example.models.**'
}
```

Or more parameters

```
plugins {
  id 'java'
  id 'com.github.kt3k.ebean.enhance' version '4.0.1'
}

ebeanEnhance {
  packages = 'com.example.models.**'
  mainClassPath = 'classes/kotlin/main'
  testClassPath = 'classes/kotlin/test'
}
```

On the fly from my repository (Janez):

```
buildscript {
	repositories {
        maven { url "https://jitpack.io" }
	}
	dependencies {
		classpath("com.github.janez89:ebean-enhance-plugin:v4.0.1")
	}
}

apply plugin: "com.github.kt3k.ebean.enhance"

ebeanEnhance {
  packages = 'com.example.models.**'
  mainClassPath = 'classes/kotlin/main'
  testClassPath = 'classes/kotlin/test'
}
```

The above automatically enhances the ebean models under the `com.example.models` package.

More technically, `com.github.kt3k.ebean.enhance` plugins creates `ebeanEnhace` task in your project and hook it to `classes` task of `java` plugin.

You can specify following properties in your build.gradle:

## packages

The package to enhance (required)

## agentVersion

The version of `io.ebean:ebean-agent` module (default `11.5.1`) for 11.5.+ enhancement

## transformArgs

The transformation arguments to pass to `AntEnhanceTask` (default `debug=5`)

# License

MIT

# History

- 2018-06-16   v4.0.1   added classPath parameters. (now works with spring boot 2 and kotlin)
- 2017-12-22   v4.0.0   Bumped Ebean depedencies (agent from v10.1.1 to v11.5.1)
- 2016-12-19   v3.0.0   Update Ebean deps.
- 2016-04-17   v2.0.5   Enhance classes under the test directory.
