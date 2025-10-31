package com.example.todolist.ui.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.todolist.data.repository.TodoRepository
import com.example.todolist.domain.model.Todo
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class TodoViewModel @Inject constructor(
    private val repository: TodoRepository
) : ViewModel() {

    private val _uiState = MutableStateFlow(TodoUiState())
    val uiState: StateFlow<TodoUiState> = _uiState.asStateFlow()

    init {
        loadTodos()
    }

    private fun loadTodos() {
        viewModelScope.launch {
            repository.getAllTodos().collect { todos ->
                _uiState.value = _uiState.value.copy(todos = todos)
            }
        }
    }

    fun addTodo(title: String, description: String = "") {
        if (title.isNotBlank()) {
            viewModelScope.launch {
                val todo = Todo(
                    title = title.trim(),
                    description = description.trim()
                )
                repository.insertTodo(todo)
            }
        }
    }

    fun updateTodo(todo: Todo) {
        viewModelScope.launch {
            repository.updateTodo(todo)
        }
    }

    fun deleteTodo(todo: Todo) {
        viewModelScope.launch {
            repository.deleteTodo(todo)
        }
    }

    fun toggleTodoCompletion(todo: Todo) {
        viewModelScope.launch {
            repository.toggleTodoCompletion(todo.id, !todo.isCompleted)
        }
    }

    fun showAddTodoDialog() {
        _uiState.value = _uiState.value.copy(showAddDialog = true)
    }

    fun hideAddTodoDialog() {
        _uiState.value = _uiState.value.copy(showAddDialog = false)
    }

    fun showEditTodoDialog(todo: Todo) {
        _uiState.value = _uiState.value.copy(
            showEditDialog = true,
            editingTodo = todo
        )
    }

    fun hideEditTodoDialog() {
        _uiState.value = _uiState.value.copy(
            showEditDialog = false,
            editingTodo = null
        )
    }
}

data class TodoUiState(
    val todos: List<Todo> = emptyList(),
    val showAddDialog: Boolean = false,
    val showEditDialog: Boolean = false,
    val editingTodo: Todo? = null
)
