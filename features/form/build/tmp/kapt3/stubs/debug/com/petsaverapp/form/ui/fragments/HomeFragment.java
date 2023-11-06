package com.petsaverapp.form.ui.fragments;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.petsaverapp.form.R;
import com.petsaverapp.form.databinding.FragmentHomeBinding;
import com.petsaverapp.form.ui.adapters.AdapterExploreRv;
import com.petsaverapp.form.ui.adapters.AdapterVoceSabiaRv;
import com.petsaverapp.form.ui.dataEntities.Materia;
import com.petsaverapp.form.ui.viewmodel.HomeViewModel;
import dagger.hilt.android.AndroidEntryPoint;

@dagger.hilt.android.AndroidEntryPoint
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002J\u0012\u0010\u000e\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J&\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\u001a\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u00122\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lcom/petsaverapp/form/ui/fragments/HomeFragment;", "Landroidx/fragment/app/Fragment;", "()V", "_binding", "Lcom/petsaverapp/form/databinding/FragmentHomeBinding;", "binding", "getBinding", "()Lcom/petsaverapp/form/databinding/FragmentHomeBinding;", "viewModel", "Lcom/petsaverapp/form/ui/viewmodel/HomeViewModel;", "enviarDadosMateriaParaMateriaFragment", "", "materia", "Lcom/petsaverapp/form/ui/dataEntities/Materia;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onViewCreated", "view", "form_debug"})
public final class HomeFragment extends androidx.fragment.app.Fragment {
    @org.jetbrains.annotations.Nullable
    private com.petsaverapp.form.databinding.FragmentHomeBinding _binding;
    private com.petsaverapp.form.ui.viewmodel.HomeViewModel viewModel;
    
    public HomeFragment() {
        super();
    }
    
    private final com.petsaverapp.form.databinding.FragmentHomeBinding getBinding() {
        return null;
    }
    
    @java.lang.Override
    public void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override
    public void onViewCreated(@org.jetbrains.annotations.NotNull
    android.view.View view, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    private final void enviarDadosMateriaParaMateriaFragment(com.petsaverapp.form.ui.dataEntities.Materia materia) {
    }
}