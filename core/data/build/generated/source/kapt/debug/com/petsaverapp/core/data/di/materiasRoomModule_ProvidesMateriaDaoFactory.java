package com.petsaverapp.core.data.di;

import com.petsaverapp.core.data.database.MateriasDatabase;
import com.petsaverapp.core.data.database.daos.MateriaDao;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class materiasRoomModule_ProvidesMateriaDaoFactory implements Factory<MateriaDao> {
  private final Provider<MateriasDatabase> databaseProvider;

  public materiasRoomModule_ProvidesMateriaDaoFactory(Provider<MateriasDatabase> databaseProvider) {
    this.databaseProvider = databaseProvider;
  }

  @Override
  public MateriaDao get() {
    return providesMateriaDao(databaseProvider.get());
  }

  public static materiasRoomModule_ProvidesMateriaDaoFactory create(
      Provider<MateriasDatabase> databaseProvider) {
    return new materiasRoomModule_ProvidesMateriaDaoFactory(databaseProvider);
  }

  public static MateriaDao providesMateriaDao(MateriasDatabase database) {
    return Preconditions.checkNotNullFromProvides(materiasRoomModule.INSTANCE.providesMateriaDao(database));
  }
}
