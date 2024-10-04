fun main() {
    /*// Создаем массив 5x5
    val array = Array(5) { IntArray(5) { (0..9).random() } }
    //если нужно создать случайный массив
     */


    //если нужно создать симметричный массив
    val size = 5
    val array = Array(size) { IntArray(size) }

    // Заполняем массив симметрично относительно главной диагонали
    for (i in 0 until size) {
        for (j in 0 until size) {
            if (i <= j) {
                array[i][j] = (0..9).random()  // Заполняем верхнюю часть случайными числами
            } else {
                array[i][j] = array[j][i]      // Копируем значение с симметричной позиции
            }
        }
    }

    // Выводим массив
    for (row in array) {
        println(row.joinToString(" "))
    }

    var count = 0
    for (i in 0 until array.size) {
        for (j in 0 until array[i].size) {
            if (array[i][j] == array[j][i])
                count++
            else count--
        }
    }

    if (count == 25)//вместо 25 можно написать произведение строк на колонки, если массив произвольной размерности
        print("массив симметричен относительно главной диагонали")
    else print("не симметричен по главной диагонали")



}
