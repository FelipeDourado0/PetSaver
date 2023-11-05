package com.petsaverapp.core.data.di;

import android.app.Application;
import com.petsaverapp.core.data.database.MateriasDatabase;
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
public final class materiasRoomModule_ProvidesMateriasDatabaseFactory implements Factory<MateriasDatabase> {
  private final Provider<Application> applicationProvider;

  public materiasRoomModule_ProvidesMateriasDatabaseFactory(
      Provider<Application> applicationProvider) {
    this.applicationProvider = applicationProvider;
  }

  @Override
  public MateriasDatabase get() {
    return providesMateriasDatabase(applicationProvider.get());
  }

  public static materiasRoomModule_ProvidesMateriasDatabaseFactory create(
      Provider<Application> applicationProvider) {
    return new materiasRoomModule_ProvidesMateriasDatabaseFactory(applicationProvider);
  }

  public static MateriasDatabase providesMateriasDatabase(Application application) {
    return Preconditions.checkNotNullFromProvides(materiasRoomModule.INSTANCE.providesMateriasDatabase(application));
  }
}
