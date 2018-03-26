package org.elmaazouz.dsl

import org.gradle.api.NamedDomainObjectContainer

class Unit extends AbstractNamedObject {

  Unit(String name) {
    super(name)
  }

  String locationHash
  NamedDomainObjectContainer<Student> students

  def students(final Closure configureClosure) {
    students.configure(configureClosure)
  }
}
