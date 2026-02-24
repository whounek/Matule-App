package com.example.matule.data.dto
/**
 * Описание dto: Модель передачи данных (DTO) пользователя.
 * Представляет бизнес-процесс "Профиль пользователя" на этапе получения данных.
 * Цель: Используется для парсинга сырых JSON данных, пришедших от сервера.
 */
data class UserDto(
    val id: Int,
    val email: String,
    val name: String
)