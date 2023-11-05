package com.petsaverapp.core.data.database;

import android.content.Context;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverters;
import com.petsaverapp.core.data.database.daos.MateriaDao;
import com.petsaverapp.core.data.database.model.Conversor;
import com.petsaverapp.core.data.database.model.MateriaDomain;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u00a8\u0006\u0006"}, d2 = {"Lcom/petsaverapp/core/data/database/MateriasDatabase;", "Landroidx/room/RoomDatabase;", "()V", "materiaDAO", "Lcom/petsaverapp/core/data/database/daos/MateriaDao;", "Companion", "data_debug"})
@androidx.room.Database(entities = {com.petsaverapp.core.data.database.model.MateriaDomain.class}, version = 1, exportSchema = false)
@androidx.room.TypeConverters(value = {com.petsaverapp.core.data.database.model.Conversor.class})
public abstract class MateriasDatabase extends androidx.room.RoomDatabase {
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String DATABASE_NAME = "materias-database.db";
    @kotlin.jvm.Volatile
    @org.jetbrains.annotations.Nullable
    private static volatile com.petsaverapp.core.data.database.MateriasDatabase INSTANCE;
    @org.jetbrains.annotations.NotNull
    public static final com.petsaverapp.core.data.database.MateriasDatabase.Companion Companion = null;
    
    public MateriasDatabase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public abstract com.petsaverapp.core.data.database.daos.MateriaDao materiaDAO();
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/petsaverapp/core/data/database/MateriasDatabase$Companion;", "", "()V", "DATABASE_NAME", "", "INSTANCE", "Lcom/petsaverapp/core/data/database/MateriasDatabase;", "getDatabase", "context", "Landroid/content/Context;", "data_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.petsaverapp.core.data.database.MateriasDatabase getDatabase(@org.jetbrains.annotations.NotNull
        android.content.Context context) {
            return null;
        }
    }
}