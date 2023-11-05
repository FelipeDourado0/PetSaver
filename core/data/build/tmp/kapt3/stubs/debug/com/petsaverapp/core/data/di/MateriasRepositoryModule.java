package com.petsaverapp.core.data.di;

import com.petsaverapp.core.data.repository.IMateriasRepository;
import com.petsaverapp.core.data.repository.MateriaRepository;
import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;
import javax.inject.Singleton;

@dagger.Module
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\'\u00a8\u0006\u0007"}, d2 = {"Lcom/petsaverapp/core/data/di/MateriasRepositoryModule;", "", "()V", "providesMateriasRepository", "Lcom/petsaverapp/core/data/repository/IMateriasRepository;", "implementation", "Lcom/petsaverapp/core/data/repository/MateriaRepository;", "data_debug"})
@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
public abstract class MateriasRepositoryModule {
    
    public MateriasRepositoryModule() {
        super();
    }
    
    @javax.inject.Singleton
    @dagger.Binds
    @org.jetbrains.annotations.NotNull
    public abstract com.petsaverapp.core.data.repository.IMateriasRepository providesMateriasRepository(@org.jetbrains.annotations.NotNull
    com.petsaverapp.core.data.repository.MateriaRepository implementation);
}