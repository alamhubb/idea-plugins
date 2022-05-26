package com.github.socialuni.ideaplugins.services

import com.intellij.openapi.project.Project
import com.github.socialuni.ideaplugins.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
