package com.github.jooyeonsong.helloplugin.services

import com.intellij.openapi.project.Project
import com.github.jooyeonsong.helloplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
