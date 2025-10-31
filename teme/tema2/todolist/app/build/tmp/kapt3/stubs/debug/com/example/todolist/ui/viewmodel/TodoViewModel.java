package com.example.todolist.ui.viewmodel;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u000fJ\u000e\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0013J\u0006\u0010\u0014\u001a\u00020\rJ\u0006\u0010\u0015\u001a\u00020\rJ\b\u0010\u0016\u001a\u00020\rH\u0002J\u0006\u0010\u0017\u001a\u00020\rJ\u000e\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0013J\u000e\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0013J\u000e\u0010\u001a\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0013R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u001b"}, d2 = {"Lcom/example/todolist/ui/viewmodel/TodoViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/example/todolist/data/repository/TodoRepository;", "(Lcom/example/todolist/data/repository/TodoRepository;)V", "_uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/example/todolist/ui/viewmodel/TodoUiState;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "addTodo", "", "title", "", "description", "deleteTodo", "todo", "Lcom/example/todolist/domain/model/Todo;", "hideAddTodoDialog", "hideEditTodoDialog", "loadTodos", "showAddTodoDialog", "showEditTodoDialog", "toggleTodoCompletion", "updateTodo", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel()
public final class TodoViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.example.todolist.data.repository.TodoRepository repository = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<com.example.todolist.ui.viewmodel.TodoUiState> _uiState = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<com.example.todolist.ui.viewmodel.TodoUiState> uiState = null;
    
    @javax.inject.Inject()
    public TodoViewModel(@org.jetbrains.annotations.NotNull()
    com.example.todolist.data.repository.TodoRepository repository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<com.example.todolist.ui.viewmodel.TodoUiState> getUiState() {
        return null;
    }
    
    private final void loadTodos() {
    }
    
    public final void addTodo(@org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    java.lang.String description) {
    }
    
    public final void updateTodo(@org.jetbrains.annotations.NotNull()
    com.example.todolist.domain.model.Todo todo) {
    }
    
    public final void deleteTodo(@org.jetbrains.annotations.NotNull()
    com.example.todolist.domain.model.Todo todo) {
    }
    
    public final void toggleTodoCompletion(@org.jetbrains.annotations.NotNull()
    com.example.todolist.domain.model.Todo todo) {
    }
    
    public final void showAddTodoDialog() {
    }
    
    public final void hideAddTodoDialog() {
    }
    
    public final void showEditTodoDialog(@org.jetbrains.annotations.NotNull()
    com.example.todolist.domain.model.Todo todo) {
    }
    
    public final void hideEditTodoDialog() {
    }
}