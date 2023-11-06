package com.petsaverapp.form.ui.adapters;

import android.content.Context;
import android.graphics.RenderEffect;
import android.graphics.Shader;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.RequiresApi;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.petsaverapp.core.data.database.model.MateriaDomain;
import com.petsaverapp.form.R;
import com.petsaverapp.form.ui.dataEntities.Materia;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u001aB\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\u0002\u0010\bJ\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u001c\u0010\u0013\u001a\u00020\f2\n\u0010\u0014\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0012H\u0017J\u001c\u0010\u0016\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0012H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R(\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010\u00a8\u0006\u001b"}, d2 = {"Lcom/petsaverapp/form/ui/adapters/AdapterExploreRv;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/petsaverapp/form/ui/adapters/AdapterExploreRv$MateriaViewHolder;", "context", "Landroid/content/Context;", "items", "", "Lcom/petsaverapp/core/data/database/model/MateriaDomain;", "(Landroid/content/Context;Ljava/util/List;)V", "onItemCLick", "Lkotlin/Function1;", "Lcom/petsaverapp/form/ui/dataEntities/Materia;", "", "getOnItemCLick", "()Lkotlin/jvm/functions/Function1;", "setOnItemCLick", "(Lkotlin/jvm/functions/Function1;)V", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "MateriaViewHolder", "form_debug"})
public final class AdapterExploreRv extends androidx.recyclerview.widget.RecyclerView.Adapter<com.petsaverapp.form.ui.adapters.AdapterExploreRv.MateriaViewHolder> {
    @org.jetbrains.annotations.NotNull
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull
    private final java.util.List<com.petsaverapp.core.data.database.model.MateriaDomain> items = null;
    @org.jetbrains.annotations.Nullable
    private kotlin.jvm.functions.Function1<? super com.petsaverapp.form.ui.dataEntities.Materia, kotlin.Unit> onItemCLick;
    
    public AdapterExploreRv(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    java.util.List<com.petsaverapp.core.data.database.model.MateriaDomain> items) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final kotlin.jvm.functions.Function1<com.petsaverapp.form.ui.dataEntities.Materia, kotlin.Unit> getOnItemCLick() {
        return null;
    }
    
    public final void setOnItemCLick(@org.jetbrains.annotations.Nullable
    kotlin.jvm.functions.Function1<? super com.petsaverapp.form.ui.dataEntities.Materia, kotlin.Unit> p0) {
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public com.petsaverapp.form.ui.adapters.AdapterExploreRv.MateriaViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.S)
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    com.petsaverapp.form.ui.adapters.AdapterExploreRv.MateriaViewHolder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u000f\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\u0011\u001a\u00020\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0015\u001a\u00020\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014\u00a8\u0006\u0017"}, d2 = {"Lcom/petsaverapp/form/ui/adapters/AdapterExploreRv$MateriaViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lcom/petsaverapp/form/ui/adapters/AdapterExploreRv;Landroid/view/View;)V", "cardCompleto", "Landroid/view/ViewGroup;", "getCardCompleto", "()Landroid/view/ViewGroup;", "detalheFundo", "Landroid/widget/ImageView;", "getDetalheFundo", "()Landroid/widget/ImageView;", "imageBackground", "getImageBackground", "photoPerfil", "getPhotoPerfil", "subTitleItem", "Landroid/widget/TextView;", "getSubTitleItem", "()Landroid/widget/TextView;", "titleItem", "getTitleItem", "form_debug"})
    public final class MateriaViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull
        private final android.widget.ImageView photoPerfil = null;
        @org.jetbrains.annotations.NotNull
        private final android.widget.ImageView imageBackground = null;
        @org.jetbrains.annotations.NotNull
        private final android.widget.TextView titleItem = null;
        @org.jetbrains.annotations.NotNull
        private final android.widget.TextView subTitleItem = null;
        @org.jetbrains.annotations.NotNull
        private final android.view.ViewGroup cardCompleto = null;
        @org.jetbrains.annotations.NotNull
        private final android.widget.ImageView detalheFundo = null;
        
        public MateriaViewHolder(@org.jetbrains.annotations.NotNull
        android.view.View itemView) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.widget.ImageView getPhotoPerfil() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.widget.ImageView getImageBackground() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.widget.TextView getTitleItem() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.widget.TextView getSubTitleItem() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.view.ViewGroup getCardCompleto() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.widget.ImageView getDetalheFundo() {
            return null;
        }
    }
}