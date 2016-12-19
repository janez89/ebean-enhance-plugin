package org.kt3k.ebean.enhance

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction

/**
 * The task for enhancing ebean entities.
 */
open class EnhanceEbeanTask : DefaultTask() {

  var classFilePath = ""
  var antTaskName = ""

  @TaskAction
  fun enhance() {

    project.ant.invokeMethod("taskdef", mapOf(
      "name" to antTaskName,
      "classname" to ext(project).antEnhanceTaskClassName,
      "classpath" to project.configurations.getByName(CONFIGURATION_NAME).asPath
    ))

    try {
      project.ant.invokeMethod(antTaskName, mapOf(
        "classSource" to project.buildDir.absolutePath + classFilePath,
        "packages" to ext(project).packages,
        "transformArgs" to ext(project).transformArgs
      ))
    } catch (e: RuntimeException) {
      logger.info(e.message)
    }

  }
}
