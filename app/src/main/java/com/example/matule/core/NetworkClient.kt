package com.example.matule.core

interface NetworkClient {
    /**
     * Описание метода: Выполняет GET запрос к серверу через слой абстракции (SOLID).
     * Параметры: [endpoint] - строковый путь запроса к API (например, "/api/v1/auth").
     * Обработка: Осуществляет базовую маршрутизацию и подготовку HTTP-запроса.
     * Возвращает: Объект Result со строкой (JSON ответа) в случае успеха или ошибкой при сбое.
     */
    suspend fun get(endpoint: String): Result<String>

}