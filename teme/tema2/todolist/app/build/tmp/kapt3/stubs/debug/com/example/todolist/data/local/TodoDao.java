package com.example.todolist.data.local;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0006J\u0014\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\t0\bH\'J\u0018\u0010\n\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000b\u001a\u00020\fH\u00a7@\u00a2\u0006\u0002\u0010\rJ\u0016\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0006J\u001e\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0011H\u00a7@\u00a2\u0006\u0002\u0010\u0012J\u0016\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0006\u00a8\u0006\u0014"}, d2 = {"Lcom/example/todolist/data/local/TodoDao;", "", "deleteTodo", "", "todo", "Lcom/example/todolist/data/local/TodoEntity;", "(Lcom/example/todolist/data/local/TodoEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllTodos", "Lkotlinx/coroutines/flow/Flow;", "", "getTodoById", "id", "", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertTodo", "updateCompletionStatus", "isCompleted", "", "(JZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateTodo", "app_debug"})
@androidx.room.Dao()
public abstract interface TodoDao {
    
    @androidx.room.Query(value = "SELECT * FROM todos ORDER BY createdAt DESC")
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.example.todolist.data.local.TodoEntity>> getAllTodos();
    
    @androidx.room.Query(value = "SELECT * FROM todos WHERE id = :id")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getTodoById(long id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.todolist.data.local.TodoEntity> $completion);
    
    @androidx.room.Insert()
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object insertTodo(@org.jetbrains.annotations.NotNull()
    com.example.todolist.data.local.TodoEntity todo, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Long> $completion);
    
    @androidx.room.Update()
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object updateTodo(@org.jetbrains.annotations.NotNull()
    com.example.todolist.data.local.TodoEntity todo, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Delete()
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object deleteTodo(@org.jetbrains.annotations.NotNull()
    com.example.todolist.data.local.TodoEntity todo, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Query(value = "UPDATE todos SET isCompleted = :isCompleted WHERE id = :id")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object updateCompletionStatus(long id, boolean isCompleted, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
}