package com.example.notekeeper_kotlin

class DataManager {
    val courses = HashMap<String, CourseInfo>()
    val notes = ArrayList<NoteInfo>()

    init{
        initializeCourses()
    }

    private fun initializeCourses()
    {
        var course = CourseInfo("Android Intents", "Programming with intents")
        courses.set(course.courseId, course)

        course = CourseInfo("Android Kotlin", "Programming with Kotlin")
        courses.set(course.courseId, course)

        course = CourseInfo("Android Java", "Programming with Java")
        courses.set(course.courseId, course)

        course = CourseInfo("Android", "Programming with Android")
        courses.set(course.courseId, course)

    }
}