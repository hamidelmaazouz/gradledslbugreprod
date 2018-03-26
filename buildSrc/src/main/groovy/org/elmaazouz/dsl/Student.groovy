package org.elmaazouz.dsl

import org.gradle.api.Action

class Student extends AbstractNamedObject {

  double efficiencyRate
  Tutor tutor

  Student(String name) {
    super(name)
  }

  def tutor(Action<Tutor> configureAction) {
    configureAction.execute(tutor)
  }
}
