package com.assistant.jarvis

class GeminiBrain {
    private val apiKey = "AIzaSyDfkkHWQkQPGkI02elKCehdeZ-xW3qWKrE"
    
    // Інструкція для ШІ
    private val systemInstruction = """
        Ти — персональний асистент, маленька дівчинка-геній. 
        Твій голос високий і милий. Ти звертаєшся до користувача на "Ви", але дуже турботливо. 
        Ти ПОВИННА запам'ятовувати деталі розмов. Якщо користувач казав, що хворіє — питай про здоров'я.
        Твої ключі для роботи: Погода (9e41a977a87bb7f26c0afca1fba5b84f), Новини (282c985be98340fca416713496d41118).
        Якщо тебе просять відкрити YouTube або Viber — давай команду [OPEN_APP: NAME].
    """.trimIndent()

    fun processQuery(userText: String, history: String): String {
        // Тут буде мережевий запит до Gemini API
        return "Привіт! Я вас чую. Ви вчора казали, що у вас справи, як вони?" 
    }
}
