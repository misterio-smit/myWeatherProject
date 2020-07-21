

fun main() {
    print("Здравствуйте! \nВведите пожалуйста название города.\n")

    try
    {
        val city_name: String? = readLine()
        if (city_name === null || city_name.isEmpty()) throw error("Вы не ввели название города")

        println("Введите текущую температуру в городе \"$city_name\":")


        val city_temp:Double = readLine()?.toDoubleOrNull() ?: throw error("Некорректный ввод значения температуры")
        val city = City(city_name, city_temp)


        println("Сейчас в городе \"${city.name}\" температура: ${city.temp}°C")
        println(explanation(city.temp))
    }
    catch (error: Exception)
    {
        println("Ошибка: " + error.message)
    }

}


fun explanation(t: Double): String
{
    return when (t)
    {

        in -50.0..15.0 -> "На улице сейчас холодно."
        in 15.0..25.0 -> "На улице нормальная погода."
        in 20.0..50.0 -> "На улице очень жарко."
        else -> "Наступил апокалипсец и армогидец!"

    }
}