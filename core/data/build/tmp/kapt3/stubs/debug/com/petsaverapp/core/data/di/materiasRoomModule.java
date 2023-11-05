package com.petsaverapp.core.data.di;

import android.app.Application;
import com.petsaverapp.core.data.database.MateriasDatabase;
import com.petsaverapp.core.data.database.daos.MateriaDao;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;
import javax.inject.Singleton;

@dagger.Module
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u0007\u00a8\u0006\n"}, d2 = {"Lcom/petsaverapp/core/data/di/materiasRoomModule;", "", "()V", "providesMateriaDao", "Lcom/petsaverapp/core/data/database/daos/MateriaDao;", "database", "Lcom/petsaverapp/core/data/database/MateriasDatabase;", "providesMateriasDatabase", "application", "Landroid/app/Application;", "data_debug"})
@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
public final class materiasRoomModule {
    @org.jetbrains.annotations.NotNull
    public static final com.petsaverapp.core.data.di.materiasRoomModule INSTANCE = null;
    
    private materiasRoomModule() {
        super();
    }
    
    @javax.inject.Singleton
    @dagger.Provides
    @org.jetbrains.annotations.NotNull
    public final com.petsaverapp.core.data.database.MateriasDatabase providesMateriasDatabase(@org.jetbrains.annotations.NotNull
    android.app.Application application) {
        return null;
    }
    
    @javax.inject.Singleton
    @dagger.Provides
    @org.jetbrains.annotations.NotNull
    public final com.petsaverapp.core.data.database.daos.MateriaDao providesMateriaDao(@org.jetbrains.annotations.NotNull
    com.petsaverapp.core.data.database.MateriasDatabase database) {
        return null;
    }
}