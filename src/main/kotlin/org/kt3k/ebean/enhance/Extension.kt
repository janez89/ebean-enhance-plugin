package org.kt3k.ebean.enhance

/**
 * The plugin extension.
 */
public open class Extension {

  /**
   * The packages to enhance.
   *
   * ex. "com.exmaple.models.**"
   */
  var packages = ""

  /**
   * Main class path
   */
  var mainClassPath = ""

  /**
   * Test class path
   */
  var testClassPath = ""

  /**
   * Ebean enhance agent group id.
   */
  var agentGroupId = "io.ebean"

  /**
   * Ebean enhance agent artifact id.
   */
  var agentArtifactId = "ebean-agent"
  /**
   * Ebean enhance agent version.
   */
  var agentVersion = "11.5.1"

  /**
   *
   */
  var antEnhanceTaskClassName = "io.ebean.enhance.ant.AntEnhanceTask"

  /**
   * Transoformation args for enhance agent.
   */
  var transformArgs = "debug=5"

}
