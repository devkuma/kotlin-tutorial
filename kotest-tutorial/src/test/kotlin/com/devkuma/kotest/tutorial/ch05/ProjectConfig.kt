package com.devkuma.kotest.tutorial.ch05

import io.kotest.core.config.AbstractProjectConfig

class ProjectConfig  : AbstractProjectConfig() {

    override suspend fun beforeProject() {
        //println("프로젝트 전체 실행 전 초기화 작업")
    }

    override suspend fun afterProject() {
        //println("프로젝트 전체 실행 후 정리 작업")
    }
}