package com.example.a3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.a3.ui.theme._3яTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            _3яTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    // Вызовем функцию, которую мы создадим далее
                    performAdditionalTasks()
                }
            }
        }
    }

    // Дополнительные задачи
    @Composable
    fun performAdditionalTasks() {
        // 1. Работа с преобразованием строк
        val strNumber = "123"
        val number = strNumber.toInt()
        Greeting("Номер: $number", Modifier.padding(16.dp))

        // 2. Базовая арифметика и вывод результата в консоль
        val a = 5
        val b = 3
        val sum = a + b
        println("Сумма чисел a и b: $sum")

        // 3. Примеры интерполяции строк
        val name = "John"
        val age = 25
        Greeting("Привет, меня зовут $name и мне $age лет", Modifier.padding(16.dp))

        // 4. Преобразование типов
        val doubleNumber = 5.67
        val intNumber = doubleNumber.toInt()
        println("Преобразование типов: $intNumber")

        // 5. Пример условных операторов (if-else)
        val x = 10
        if (x > 5) {
            Greeting("x больше 5", Modifier.padding(16.dp))
        } else {
            Greeting("x не больше 5", Modifier.padding(16.dp))
        }

        // 6. Пример с циклами (for)
        Greeting("Цикл for:", Modifier.padding(16.dp))
        for (i in 0 until 5) {
            Greeting("Шаг $i", Modifier.padding(16.dp))
        }

        // 7. Пример создания отдельной функции
        printHello()

        // 8. Пример работы с массивом
        val numbersArray = arrayOf(1, 2, 3, 4, 5)
        Greeting("Элементы массива: ${numbersArray.joinToString()}", Modifier.padding(16.dp))
    }

    // Функция для примера
    @Composable
    fun printHello() {
        Greeting("Привет из функции!", Modifier.padding(16.dp))
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = name,
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    _3яTheme {
        Greeting("Android")
    }
}
