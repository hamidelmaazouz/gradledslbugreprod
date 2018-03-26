package org.elmaazouz

import org.elmaazouz.dsl.Student
import org.elmaazouz.dsl.Unit
import org.gradle.api.Plugin
import org.gradle.api.Project

class CustomPlugin implements Plugin<Project> {

  @Override
  void apply(Project project) {
    def units = project.container(Unit)
    units.all {
      students = project.container(Student)
    }

    project.extensions.add("units", units)
  }
}
