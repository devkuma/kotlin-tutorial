package com.devkuma.kotest.tutorial.framework.testfactories

interface IndexedSeq<T> {

    // returns the size of t
    fun size(): Int

    // returns a new seq with t added
    fun add(t: T): IndexedSeq<T>

    // returns true if this seq contains t
    fun contains(t: T): Boolean
}