package com.petsaverapp.core.data.database.model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import java.util.Date;
import java.util.UUID;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000e\u00a2\u0006\u0002\u0010\u000fJ\t\u0010/\u001a\u00020\u0003H\u00c6\u0003J\t\u00100\u001a\u00020\u000eH\u00c6\u0003J\t\u00101\u001a\u00020\u0003H\u00c6\u0003J\t\u00102\u001a\u00020\u0003H\u00c6\u0003J\t\u00103\u001a\u00020\u0003H\u00c6\u0003J\t\u00104\u001a\u00020\u0003H\u00c6\u0003J\t\u00105\u001a\u00020\u0003H\u00c6\u0003J\t\u00106\u001a\u00020\u0003H\u00c6\u0003J\t\u00107\u001a\u00020\u000bH\u00c6\u0003J\t\u00108\u001a\u00020\u000bH\u00c6\u0003Jm\u00109\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000eH\u00c6\u0001J\u0013\u0010:\u001a\u00020\u000b2\b\u0010;\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010<\u001a\u00020=H\u00d6\u0001J\t\u0010>\u001a\u00020\u0003H\u00d6\u0001R\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\f\u001a\u00020\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0019\"\u0004\b\u001d\u0010\u001bR\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0019\"\u0004\b\u001f\u0010\u001bR\u001e\u0010 \u001a\u00020!8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001e\u0010\u0005\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0019\"\u0004\b\'\u0010\u001bR\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0019\"\u0004\b)\u0010\u001bR\u0011\u0010\t\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010\u0019R\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0019\"\u0004\b,\u0010\u001bR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u0015\"\u0004\b.\u0010\u0017\u00a8\u0006?"}, d2 = {"Lcom/petsaverapp/core/data/database/model/MateriaDomain;", "", "imagePerfilUrl", "", "imageBackGroundUrl", "nameWriter", "title", "subTitle", "mainText", "tema", "voceSabiaList", "", "exploreList", "dataMateria", "Ljava/util/Date;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/util/Date;)V", "getDataMateria", "()Ljava/util/Date;", "setDataMateria", "(Ljava/util/Date;)V", "getExploreList", "()Z", "setExploreList", "(Z)V", "getImageBackGroundUrl", "()Ljava/lang/String;", "setImageBackGroundUrl", "(Ljava/lang/String;)V", "getImagePerfilUrl", "setImagePerfilUrl", "getMainText", "setMainText", "materiaId", "Ljava/util/UUID;", "getMateriaId", "()Ljava/util/UUID;", "setMateriaId", "(Ljava/util/UUID;)V", "getNameWriter", "setNameWriter", "getSubTitle", "setSubTitle", "getTema", "getTitle", "setTitle", "getVoceSabiaList", "setVoceSabiaList", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", "toString", "data_debug"})
@androidx.room.Entity(tableName = "materias")
public final class MateriaDomain {
    @androidx.room.ColumnInfo(name = "imagem_perfil")
    @org.jetbrains.annotations.NotNull
    private java.lang.String imagePerfilUrl;
    @androidx.room.ColumnInfo(name = "imagem_BackGround")
    @org.jetbrains.annotations.NotNull
    private java.lang.String imageBackGroundUrl;
    @androidx.room.ColumnInfo(name = "name_Writer")
    @org.jetbrains.annotations.NotNull
    private java.lang.String nameWriter;
    @org.jetbrains.annotations.NotNull
    private java.lang.String title;
    @org.jetbrains.annotations.NotNull
    private java.lang.String subTitle;
    @org.jetbrains.annotations.NotNull
    private java.lang.String mainText;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String tema = null;
    private boolean voceSabiaList;
    private boolean exploreList;
    @org.jetbrains.annotations.NotNull
    private java.util.Date dataMateria;
    @androidx.room.PrimaryKey
    @androidx.room.ColumnInfo(name = "materia_Id")
    @org.jetbrains.annotations.NotNull
    private java.util.UUID materiaId;
    
    public MateriaDomain(@org.jetbrains.annotations.NotNull
    java.lang.String imagePerfilUrl, @org.jetbrains.annotations.NotNull
    java.lang.String imageBackGroundUrl, @org.jetbrains.annotations.NotNull
    java.lang.String nameWriter, @org.jetbrains.annotations.NotNull
    java.lang.String title, @org.jetbrains.annotations.NotNull
    java.lang.String subTitle, @org.jetbrains.annotations.NotNull
    java.lang.String mainText, @org.jetbrains.annotations.NotNull
    java.lang.String tema, boolean voceSabiaList, boolean exploreList, @org.jetbrains.annotations.NotNull
    java.util.Date dataMateria) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getImagePerfilUrl() {
        return null;
    }
    
    public final void setImagePerfilUrl(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getImageBackGroundUrl() {
        return null;
    }
    
    public final void setImageBackGroundUrl(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getNameWriter() {
        return null;
    }
    
    public final void setNameWriter(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getTitle() {
        return null;
    }
    
    public final void setTitle(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getSubTitle() {
        return null;
    }
    
    public final void setSubTitle(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getMainText() {
        return null;
    }
    
    public final void setMainText(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getTema() {
        return null;
    }
    
    public final boolean getVoceSabiaList() {
        return false;
    }
    
    public final void setVoceSabiaList(boolean p0) {
    }
    
    public final boolean getExploreList() {
        return false;
    }
    
    public final void setExploreList(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.Date getDataMateria() {
        return null;
    }
    
    public final void setDataMateria(@org.jetbrains.annotations.NotNull
    java.util.Date p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.UUID getMateriaId() {
        return null;
    }
    
    public final void setMateriaId(@org.jetbrains.annotations.NotNull
    java.util.UUID p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.Date component10() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component7() {
        return null;
    }
    
    public final boolean component8() {
        return false;
    }
    
    public final boolean component9() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.petsaverapp.core.data.database.model.MateriaDomain copy(@org.jetbrains.annotations.NotNull
    java.lang.String imagePerfilUrl, @org.jetbrains.annotations.NotNull
    java.lang.String imageBackGroundUrl, @org.jetbrains.annotations.NotNull
    java.lang.String nameWriter, @org.jetbrains.annotations.NotNull
    java.lang.String title, @org.jetbrains.annotations.NotNull
    java.lang.String subTitle, @org.jetbrains.annotations.NotNull
    java.lang.String mainText, @org.jetbrains.annotations.NotNull
    java.lang.String tema, boolean voceSabiaList, boolean exploreList, @org.jetbrains.annotations.NotNull
    java.util.Date dataMateria) {
        return null;
    }
    
    @java.lang.Override
    public boolean equals(@org.jetbrains.annotations.Nullable
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return null;
    }
}