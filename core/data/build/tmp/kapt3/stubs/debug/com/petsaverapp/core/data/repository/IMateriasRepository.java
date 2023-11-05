package com.petsaverapp.core.data.repository;

import com.petsaverapp.core.data.database.model.MateriaDomain;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0011\u0010\u0002\u001a\u00020\u0003H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004J\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004J\u001f\u0010\b\u001a\u00020\u00032\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\nH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\r"}, d2 = {"Lcom/petsaverapp/core/data/repository/IMateriasRepository;", "", "apagarDados", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "exploreList", "", "Lcom/petsaverapp/core/data/database/model/MateriaDomain;", "insereDadosInicias", "listaMaterias", "", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "voceSabiaList", "data_debug"})
public abstract interface IMateriasRepository {
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object voceSabiaList(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.petsaverapp.core.data.database.model.MateriaDomain>> $completion);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object exploreList(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.petsaverapp.core.data.database.model.MateriaDomain>> $completion);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object insereDadosInicias(@org.jetbrains.annotations.NotNull
    java.util.List<com.petsaverapp.core.data.database.model.MateriaDomain> listaMaterias, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object apagarDados(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
}