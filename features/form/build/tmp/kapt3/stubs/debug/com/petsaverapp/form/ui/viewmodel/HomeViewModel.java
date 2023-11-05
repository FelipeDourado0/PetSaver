package com.petsaverapp.form.ui.viewmodel;

import androidx.lifecycle.ViewModel;
import com.petsaverapp.core.data.database.model.MateriaDomain;
import com.petsaverapp.core.data.repository.IMateriasRepository;
import dagger.hilt.android.lifecycle.HiltViewModel;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010J\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\t\"\u0004\b\u000e\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0012"}, d2 = {"Lcom/petsaverapp/form/ui/viewmodel/HomeViewModel;", "Landroidx/lifecycle/ViewModel;", "materiasRepository", "Lcom/petsaverapp/core/data/repository/IMateriasRepository;", "(Lcom/petsaverapp/core/data/repository/IMateriasRepository;)V", "materiaExploreList", "", "Lcom/petsaverapp/core/data/database/model/MateriaDomain;", "getMateriaExploreList", "()Ljava/util/List;", "setMateriaExploreList", "(Ljava/util/List;)V", "materiaVoceSabiaList", "getMateriaVoceSabiaList", "setMateriaVoceSabiaList", "dadosExploreLista", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "dadosVoceSabiLista", "form_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel
public final class HomeViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final com.petsaverapp.core.data.repository.IMateriasRepository materiasRepository = null;
    public java.util.List<com.petsaverapp.core.data.database.model.MateriaDomain> materiaExploreList;
    public java.util.List<com.petsaverapp.core.data.database.model.MateriaDomain> materiaVoceSabiaList;
    
    @javax.inject.Inject
    public HomeViewModel(@org.jetbrains.annotations.NotNull
    com.petsaverapp.core.data.repository.IMateriasRepository materiasRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.petsaverapp.core.data.database.model.MateriaDomain> getMateriaExploreList() {
        return null;
    }
    
    public final void setMateriaExploreList(@org.jetbrains.annotations.NotNull
    java.util.List<com.petsaverapp.core.data.database.model.MateriaDomain> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.petsaverapp.core.data.database.model.MateriaDomain> getMateriaVoceSabiaList() {
        return null;
    }
    
    public final void setMateriaVoceSabiaList(@org.jetbrains.annotations.NotNull
    java.util.List<com.petsaverapp.core.data.database.model.MateriaDomain> p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object dadosVoceSabiLista(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.petsaverapp.core.data.database.model.MateriaDomain>> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object dadosExploreLista(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.petsaverapp.core.data.database.model.MateriaDomain>> $completion) {
        return null;
    }
}