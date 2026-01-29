package com.devkuma.kotest.tutorial.ch06

class ChildSpec : ParentSpec() {
    init {
        "자식 테스트 1" {
            // 이 테스트는 "fast"와 "unit" 태그를 자동으로 상속받음
            println("자식 테스트 1 실행")
        }

        "자식 테스트 2" {
            // 추가적으로 작성된 자식 테스트
            println("자식 테스트 2 실행")
        }
    }
}