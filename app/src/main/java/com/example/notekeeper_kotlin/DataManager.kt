package com.example.notekeeper_kotlin

object DataManager {
    val courses = HashMap<String, CourseInfo>()
    val notes = ArrayList<NoteInfo>()

    init{
        initializeCourses()
        initializeNotes()
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

    private fun initializeNotes(){
        var course = CourseInfo("Android Intents", "Programming with intents")
        courses.set(course.courseId, course)
        var note = NoteInfo(course, "Dynamic intent resolution",
            "Wow, intents allow components to be resolved at runtime")
        notes.add(note)

        course = CourseInfo("Android", "Programming with Android")
        courses.set(course.courseId, course)
        note = NoteInfo(course, "Service default threads",
            "Did you know that by default an Android Service will tie up the UI thread?")
        notes.add(note)

        course = CourseInfo("Android Java", "Programming with Java")
        courses.set(course.courseId, course)
        note = NoteInfo(course, "Dynamic intent resolution",
            "Wow, intents allow components to be resolved at runtime")
        notes.add(note)

        course = CourseInfo("Android Kotlin", "Programming with Kotlin")
        courses.set(course.courseId, course)
        note = NoteInfo(course, "Service default threads",
            "Did you know that by default an Android Service will tie up the UI thread?")
        notes.add(note)


    }
}