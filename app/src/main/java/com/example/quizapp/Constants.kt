package com.example.quizapp

object Constants {

    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"

    fun getQuestions(): ArrayList<Question>{
        val questionsList = ArrayList<Question>()
        val q1 = Question(
            1,
            "Which animal is this?",
            R.drawable.koala,
            "Monkey",
            "Bear",
            "Koala",
            "Rabbit",
            3
        )
        questionsList.add(q1)
        val q2 = Question(
            2,
            "Identify this sea animal.",
            R.drawable.starfish,
            "Starfish",
            "Octopus",
            "Crab",
            "Frog",
            1
        )
        questionsList.add(q2)
        val q3 = Question(
            3,
            "Which bird is this?",
            R.drawable.myna,
            "Sparrow",
            "Pigeon",
            "Crow",
            "Myna",
            4
        )
        questionsList.add(q3)
        val q4 = Question(
            4,
            "Identify the bird shown in picture.",
            R.drawable.owl,
            "Bat",
            "Eagle",
            "Kite",
            "Owl",
            4
        )
        questionsList.add(q4)
        val q5 = Question(
            5,
            "Identify the animal shown in picture.",
            R.drawable.hedgehog,
            "Porcupine",
            "Hedgehog",
            "Rabbit",
            "Armadillo",
            2
        )
        questionsList.add(q5)
        val q6 = Question(
            6,
            "Identify the bird shown in picture.",
            R.drawable.swan,
            "Duck",
            "Crane",
            "Swan",
            "Flamingo",
            3
        )
        questionsList.add(q6)
        val q7 = Question(
            7,
            "Identify the animal shown in picture.",
            R.drawable.gorilla,
            "Chimpanzee",
            "Gorilla",
            "Orangutan",
            "Monkey",
            2
        )
        questionsList.add(q7)
        val q8 = Question(
            8,
            "Identify the bird shown in picture.",
            R.drawable.dove,
            "White Pigeon",
            "Sparrow",
            "Dove",
            "Crane",
            3
        )
        questionsList.add(q8)
        val q9 = Question(
            9,
            "Identify the animal shown in picture.",
            R.drawable.jaguar,
            "Jaguar",
            "Tiger",
            "Lion",
            "Leopard",
            1
        )
        questionsList.add(q9)
        val q10 = Question(
            10,
            "Identify the bird shown in picture.",
            R.drawable.eagle,
            "Kite",
            "Owl",
            "Eagle",
            "Bat",
            3
        )
        questionsList.add(q10)
        return questionsList
    }
}