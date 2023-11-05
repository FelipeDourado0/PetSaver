package com.petsaverapp.form.ui.viewmodel;

import com.petsaverapp.core.data.repository.IMateriasRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata
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
public final class HomeViewModel_Factory implements Factory<HomeViewModel> {
  private final Provider<IMateriasRepository> materiasRepositoryProvider;

  public HomeViewModel_Factory(Provider<IMateriasRepository> materiasRepositoryProvider) {
    this.materiasRepositoryProvider = materiasRepositoryProvider;
  }

  @Override
  public HomeViewModel get() {
    return newInstance(materiasRepositoryProvider.get());
  }

  public static HomeViewModel_Factory create(
      Provider<IMateriasRepository> materiasRepositoryProvider) {
    return new HomeViewModel_Factory(materiasRepositoryProvider);
  }

  public static HomeViewModel newInstance(IMateriasRepository materiasRepository) {
    return new HomeViewModel(materiasRepository);
  }
}
