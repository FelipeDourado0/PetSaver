package com.petsaverapp.core.data.repository;

import com.petsaverapp.core.data.database.daos.MateriaDao;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
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
public final class MateriaRepository_Factory implements Factory<MateriaRepository> {
  private final Provider<MateriaDao> materiaDaoProvider;

  public MateriaRepository_Factory(Provider<MateriaDao> materiaDaoProvider) {
    this.materiaDaoProvider = materiaDaoProvider;
  }

  @Override
  public MateriaRepository get() {
    return newInstance(materiaDaoProvider.get());
  }

  public static MateriaRepository_Factory create(Provider<MateriaDao> materiaDaoProvider) {
    return new MateriaRepository_Factory(materiaDaoProvider);
  }

  public static MateriaRepository newInstance(MateriaDao materiaDao) {
    return new MateriaRepository(materiaDao);
  }
}
