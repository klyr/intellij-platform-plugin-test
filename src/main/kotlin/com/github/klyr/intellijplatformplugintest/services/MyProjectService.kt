package com.github.klyr.intellijplatformplugintest.services

import com.intellij.openapi.project.Project
import com.github.klyr.intellijplatformplugintest.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
