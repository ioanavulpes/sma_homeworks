package com.example.todolist.data.repository

import com.example.todolist.data.local.TodoDao
import com.example.todolist.data.local.toDomainModel
import com.example.todolist.data.local.toEntity
import com.example.todolist.domain.model.Todo
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class TodoRepository @Inject constructor(
    private val todoDao: TodoDao
) {
    fun getAllTodos(): Flow<List<Todo>> {
        return todoDao.getAllTodos().map { entities ->
            entities.map { it.toDomainModel() }
        }
    }

    suspend fun getTodoById(id: Long): Todo? {
        return todoDao.getTodoById(id)?.toDomainModel()
    }

    suspend fun insertTodo(todo: Todo): Long {
        return todoDao.insertTodo(todo.toEntity())
    }

    suspend fun updateTodo(todo: Todo) {
        todoDao.updateTodo(todo.toEntity())
    }

    suspend fun deleteTodo(todo: Todo) {
        todoDao.deleteTodo(todo.toEntity())
    }

    suspend fun toggleTodoCompletion(id: Long, isCompleted: Boolean) {
        todoDao.updateCompletionStatus(id, isCompleted)
    }
}
