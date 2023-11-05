package com.petsaverapp.core.data.repository;

import com.petsaverapp.core.data.database.daos.MateriaDao;
import com.petsaverapp.core.data.database.model.MateriaDomain;
import javax.inject.Inject;
import javax.inject.Singleton;

@javax.inject.Singleton
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u0006H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J\u001f\u0010\u000b\u001a\u00020\u00062\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\rH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eJ\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0010"}, d2 = {"Lcom/petsaverapp/core/data/repository/MateriaRepository;", "Lcom/petsaverapp/core/data/repository/IMateriasRepository;", "materiaDao", "Lcom/petsaverapp/core/data/database/daos/MateriaDao;", "(Lcom/petsaverapp/core/data/database/daos/MateriaDao;)V", "apagarDados", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "exploreList", "", "Lcom/petsaverapp/core/data/database/model/MateriaDomain;", "insereDadosInicias", "listaMaterias", "", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "voceSabiaList", "data_debug"})
public final class MateriaRepository implements com.petsaverapp.core.data.repository.IMateriasRepository {
    @org.jetbrains.annotations.NotNull
    private final com.petsaverapp.core.data.database.daos.MateriaDao materiaDao = null;
    
    @javax.inject.Inject
    public MateriaRepository(@org.jetbrains.annotations.NotNull
    com.petsaverapp.core.data.database.daos.MateriaDao materiaDao) {
        super();
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public java.lang.Object voceSabiaList(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.petsaverapp.core.data.database.model.MateriaDomain>> $completion) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public java.lang.Object exploreList(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.petsaverapp.core.data.database.model.MateriaDomain>> $completion) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public java.lang.Object insereDadosInicias(@org.jetbrains.annotations.NotNull
    java.util.List<com.petsaverapp.core.data.database.model.MateriaDomain> listaMaterias, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public java.lang.Object apagarDados(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
}