package com.example.myquizapp

object setData {

    const val name:String="name"
    const val score:String="0"

    fun getQuestion():ArrayList<QuestionData>{
        var que:ArrayList<QuestionData> =arrayListOf()
        var q1=QuestionData(
            1,
            "What is the capital of Brazil",
            "Lima",
            "Buenos Aires",
            "Marruecos",
            "Rio de Janeiro",
            4
        )
        var q2=QuestionData(
            2,
            "What is the Capital of Peru",
            "Lima",
            "Buenos Aires",
            "Marruecos",
            "Rio de Janeiro",
            1
        )
        var q3=QuestionData(
            3,
            "What is the capital of Korea",
            "Lima",
            "Buenos Aires",
            "Marruecos",
            "Seoul",
            4
        )
        var q4=QuestionData(
            4,
            "What is the capital of England",
            "Lima",
            "Buenos Aires",
            "London",
            "Rio de Janeiro",
            3
        )
        var q5=QuestionData(
            5,
            "What is the capital of Chile",
            "Lima",
            "Buenos Aires",
            "Santiago",
            "Rio de Janeiro",
            3
        )
        var q6=QuestionData(
            6,
            "What is the capital of Canda",
            "Ottawa",
            "Buenos Aires",
            "Marruecos",
            "Rio de Janeiro",
            1
        )
        que.add(q1)
        que.add(q2)
        que.add(q3)
        que.add(q4)
        que.add(q5)
        que.add(q6)
        return que
    }
}