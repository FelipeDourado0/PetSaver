package com.petsaverapp.core.data.database.daos;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;
import com.petsaverapp.core.data.database.model.MateriaDomain;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0011\u0010\u0002\u001a\u00020\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\nH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004J\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\nH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004J\u0011\u0010\f\u001a\u00020\rH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ\u001f\u0010\u000f\u001a\u00020\u00032\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u0011H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012J\u0019\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0014"}, d2 = {"Lcom/petsaverapp/core/data/database/daos/MateriaDao;", "", "deleteAllItems", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteItem", "materia", "Lcom/petsaverapp/core/data/database/model/MateriaDomain;", "(Lcom/petsaverapp/core/data/database/model/MateriaDomain;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllExploreItems", "", "getAllVoceSabiaItems", "getTotalItems", "", "insert", "insertAll", "listMaterias", "", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateItem", "data_debug"})
@androidx.room.Dao
public abstract interface MateriaDao {
    
    @androidx.room.Query(value = "SELECT * FROM materias WHERE voceSabiaList = 1")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getAllVoceSabiaItems(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.petsaverapp.core.data.database.model.MateriaDomain>> $completion);
    
    @androidx.room.Query(value = "SELECT * FROM materias WHERE exploreList = 1")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getAllExploreItems(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.petsaverapp.core.data.database.model.MateriaDomain>> $completion);
    
    @androidx.room.Query(value = "SELECT COUNT(materia_Id) FROM materias")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getTotalItems(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.Long> $completion);
    
    @androidx.room.Insert
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object insert(@org.jetbrains.annotations.NotNull
    com.petsaverapp.core.data.database.model.MateriaDomain materia, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Insert
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object insertAll(@org.jetbrains.annotations.NotNull
    java.util.List<com.petsaverapp.core.data.database.model.MateriaDomain> listMaterias, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Delete
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object deleteItem(@org.jetbrains.annotations.NotNull
    com.petsaverapp.core.data.database.model.MateriaDomain materia, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Query(value = "DELETE FROM materias")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object deleteAllItems(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Update
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object updateItem(@org.jetbrains.annotations.NotNull
    com.petsaverapp.core.data.database.model.MateriaDomain materia, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
}