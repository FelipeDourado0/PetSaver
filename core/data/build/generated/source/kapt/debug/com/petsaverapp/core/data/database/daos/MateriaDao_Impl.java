package com.petsaverapp.core.data.database.daos;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.room.util.UUIDUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.petsaverapp.core.data.database.model.Conversor;
import com.petsaverapp.core.data.database.model.MateriaDomain;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Long;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Callable;
import javax.annotation.processing.Generated;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
public final class MateriaDao_Impl implements MateriaDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<MateriaDomain> __insertionAdapterOfMateriaDomain;

  private final Conversor __conversor = new Conversor();

  private final EntityDeletionOrUpdateAdapter<MateriaDomain> __deletionAdapterOfMateriaDomain;

  private final EntityDeletionOrUpdateAdapter<MateriaDomain> __updateAdapterOfMateriaDomain;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAllItems;

  public MateriaDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfMateriaDomain = new EntityInsertionAdapter<MateriaDomain>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `materias` (`imagem_perfil`,`imagem_BackGround`,`name_Writer`,`title`,`subTitle`,`mainText`,`tema`,`voceSabiaList`,`exploreList`,`dataMateria`,`materia_Id`) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, MateriaDomain value) {
        if (value.getImagePerfilUrl() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getImagePerfilUrl());
        }
        if (value.getImageBackGroundUrl() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getImageBackGroundUrl());
        }
        if (value.getNameWriter() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getNameWriter());
        }
        if (value.getTitle() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getTitle());
        }
        if (value.getSubTitle() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getSubTitle());
        }
        if (value.getMainText() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getMainText());
        }
        if (value.getTema() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getTema());
        }
        final int _tmp = value.getVoceSabiaList() ? 1 : 0;
        stmt.bindLong(8, _tmp);
        final int _tmp_1 = value.getExploreList() ? 1 : 0;
        stmt.bindLong(9, _tmp_1);
        final Long _tmp_2 = __conversor.dateToTimestamp(value.getDataMateria());
        if (_tmp_2 == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindLong(10, _tmp_2);
        }
        if (value.getMateriaId() == null) {
          stmt.bindNull(11);
        } else {
          stmt.bindBlob(11, UUIDUtil.convertUUIDToByte(value.getMateriaId()));
        }
      }
    };
    this.__deletionAdapterOfMateriaDomain = new EntityDeletionOrUpdateAdapter<MateriaDomain>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `materias` WHERE `materia_Id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, MateriaDomain value) {
        if (value.getMateriaId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindBlob(1, UUIDUtil.convertUUIDToByte(value.getMateriaId()));
        }
      }
    };
    this.__updateAdapterOfMateriaDomain = new EntityDeletionOrUpdateAdapter<MateriaDomain>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `materias` SET `imagem_perfil` = ?,`imagem_BackGround` = ?,`name_Writer` = ?,`title` = ?,`subTitle` = ?,`mainText` = ?,`tema` = ?,`voceSabiaList` = ?,`exploreList` = ?,`dataMateria` = ?,`materia_Id` = ? WHERE `materia_Id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, MateriaDomain value) {
        if (value.getImagePerfilUrl() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getImagePerfilUrl());
        }
        if (value.getImageBackGroundUrl() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getImageBackGroundUrl());
        }
        if (value.getNameWriter() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getNameWriter());
        }
        if (value.getTitle() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getTitle());
        }
        if (value.getSubTitle() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getSubTitle());
        }
        if (value.getMainText() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getMainText());
        }
        if (value.getTema() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getTema());
        }
        final int _tmp = value.getVoceSabiaList() ? 1 : 0;
        stmt.bindLong(8, _tmp);
        final int _tmp_1 = value.getExploreList() ? 1 : 0;
        stmt.bindLong(9, _tmp_1);
        final Long _tmp_2 = __conversor.dateToTimestamp(value.getDataMateria());
        if (_tmp_2 == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindLong(10, _tmp_2);
        }
        if (value.getMateriaId() == null) {
          stmt.bindNull(11);
        } else {
          stmt.bindBlob(11, UUIDUtil.convertUUIDToByte(value.getMateriaId()));
        }
        if (value.getMateriaId() == null) {
          stmt.bindNull(12);
        } else {
          stmt.bindBlob(12, UUIDUtil.convertUUIDToByte(value.getMateriaId()));
        }
      }
    };
    this.__preparedStmtOfDeleteAllItems = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM materias";
        return _query;
      }
    };
  }

  @Override
  public Object insert(final MateriaDomain materia, final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfMateriaDomain.insert(materia);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Object insertAll(final List<MateriaDomain> listMaterias,
      final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfMateriaDomain.insert(listMaterias);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Object deleteItem(final MateriaDomain materia,
      final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfMateriaDomain.handle(materia);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Object updateItem(final MateriaDomain materia,
      final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __updateAdapterOfMateriaDomain.handle(materia);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Object deleteAllItems(final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteAllItems.acquire();
        __db.beginTransaction();
        try {
          _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
          __preparedStmtOfDeleteAllItems.release(_stmt);
        }
      }
    }, $completion);
  }

  @Override
  public Object getAllVoceSabiaItems(final Continuation<? super List<MateriaDomain>> $completion) {
    final String _sql = "SELECT * FROM materias WHERE voceSabiaList = 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<List<MateriaDomain>>() {
      @Override
      public List<MateriaDomain> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfImagePerfilUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "imagem_perfil");
          final int _cursorIndexOfImageBackGroundUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "imagem_BackGround");
          final int _cursorIndexOfNameWriter = CursorUtil.getColumnIndexOrThrow(_cursor, "name_Writer");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfSubTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "subTitle");
          final int _cursorIndexOfMainText = CursorUtil.getColumnIndexOrThrow(_cursor, "mainText");
          final int _cursorIndexOfTema = CursorUtil.getColumnIndexOrThrow(_cursor, "tema");
          final int _cursorIndexOfVoceSabiaList = CursorUtil.getColumnIndexOrThrow(_cursor, "voceSabiaList");
          final int _cursorIndexOfExploreList = CursorUtil.getColumnIndexOrThrow(_cursor, "exploreList");
          final int _cursorIndexOfDataMateria = CursorUtil.getColumnIndexOrThrow(_cursor, "dataMateria");
          final int _cursorIndexOfMateriaId = CursorUtil.getColumnIndexOrThrow(_cursor, "materia_Id");
          final List<MateriaDomain> _result = new ArrayList<MateriaDomain>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final MateriaDomain _item;
            final String _tmpImagePerfilUrl;
            if (_cursor.isNull(_cursorIndexOfImagePerfilUrl)) {
              _tmpImagePerfilUrl = null;
            } else {
              _tmpImagePerfilUrl = _cursor.getString(_cursorIndexOfImagePerfilUrl);
            }
            final String _tmpImageBackGroundUrl;
            if (_cursor.isNull(_cursorIndexOfImageBackGroundUrl)) {
              _tmpImageBackGroundUrl = null;
            } else {
              _tmpImageBackGroundUrl = _cursor.getString(_cursorIndexOfImageBackGroundUrl);
            }
            final String _tmpNameWriter;
            if (_cursor.isNull(_cursorIndexOfNameWriter)) {
              _tmpNameWriter = null;
            } else {
              _tmpNameWriter = _cursor.getString(_cursorIndexOfNameWriter);
            }
            final String _tmpTitle;
            if (_cursor.isNull(_cursorIndexOfTitle)) {
              _tmpTitle = null;
            } else {
              _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            }
            final String _tmpSubTitle;
            if (_cursor.isNull(_cursorIndexOfSubTitle)) {
              _tmpSubTitle = null;
            } else {
              _tmpSubTitle = _cursor.getString(_cursorIndexOfSubTitle);
            }
            final String _tmpMainText;
            if (_cursor.isNull(_cursorIndexOfMainText)) {
              _tmpMainText = null;
            } else {
              _tmpMainText = _cursor.getString(_cursorIndexOfMainText);
            }
            final String _tmpTema;
            if (_cursor.isNull(_cursorIndexOfTema)) {
              _tmpTema = null;
            } else {
              _tmpTema = _cursor.getString(_cursorIndexOfTema);
            }
            final boolean _tmpVoceSabiaList;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfVoceSabiaList);
            _tmpVoceSabiaList = _tmp != 0;
            final boolean _tmpExploreList;
            final int _tmp_1;
            _tmp_1 = _cursor.getInt(_cursorIndexOfExploreList);
            _tmpExploreList = _tmp_1 != 0;
            final Date _tmpDataMateria;
            final Long _tmp_2;
            if (_cursor.isNull(_cursorIndexOfDataMateria)) {
              _tmp_2 = null;
            } else {
              _tmp_2 = _cursor.getLong(_cursorIndexOfDataMateria);
            }
            _tmpDataMateria = __conversor.fromTimestamp(_tmp_2);
            _item = new MateriaDomain(_tmpImagePerfilUrl,_tmpImageBackGroundUrl,_tmpNameWriter,_tmpTitle,_tmpSubTitle,_tmpMainText,_tmpTema,_tmpVoceSabiaList,_tmpExploreList,_tmpDataMateria);
            final UUID _tmpMateriaId;
            if (_cursor.isNull(_cursorIndexOfMateriaId)) {
              _tmpMateriaId = null;
            } else {
              _tmpMateriaId = UUIDUtil.convertByteToUUID(_cursor.getBlob(_cursorIndexOfMateriaId));
            }
            _item.setMateriaId(_tmpMateriaId);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, $completion);
  }

  @Override
  public Object getAllExploreItems(final Continuation<? super List<MateriaDomain>> $completion) {
    final String _sql = "SELECT * FROM materias WHERE exploreList = 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<List<MateriaDomain>>() {
      @Override
      public List<MateriaDomain> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfImagePerfilUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "imagem_perfil");
          final int _cursorIndexOfImageBackGroundUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "imagem_BackGround");
          final int _cursorIndexOfNameWriter = CursorUtil.getColumnIndexOrThrow(_cursor, "name_Writer");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfSubTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "subTitle");
          final int _cursorIndexOfMainText = CursorUtil.getColumnIndexOrThrow(_cursor, "mainText");
          final int _cursorIndexOfTema = CursorUtil.getColumnIndexOrThrow(_cursor, "tema");
          final int _cursorIndexOfVoceSabiaList = CursorUtil.getColumnIndexOrThrow(_cursor, "voceSabiaList");
          final int _cursorIndexOfExploreList = CursorUtil.getColumnIndexOrThrow(_cursor, "exploreList");
          final int _cursorIndexOfDataMateria = CursorUtil.getColumnIndexOrThrow(_cursor, "dataMateria");
          final int _cursorIndexOfMateriaId = CursorUtil.getColumnIndexOrThrow(_cursor, "materia_Id");
          final List<MateriaDomain> _result = new ArrayList<MateriaDomain>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final MateriaDomain _item;
            final String _tmpImagePerfilUrl;
            if (_cursor.isNull(_cursorIndexOfImagePerfilUrl)) {
              _tmpImagePerfilUrl = null;
            } else {
              _tmpImagePerfilUrl = _cursor.getString(_cursorIndexOfImagePerfilUrl);
            }
            final String _tmpImageBackGroundUrl;
            if (_cursor.isNull(_cursorIndexOfImageBackGroundUrl)) {
              _tmpImageBackGroundUrl = null;
            } else {
              _tmpImageBackGroundUrl = _cursor.getString(_cursorIndexOfImageBackGroundUrl);
            }
            final String _tmpNameWriter;
            if (_cursor.isNull(_cursorIndexOfNameWriter)) {
              _tmpNameWriter = null;
            } else {
              _tmpNameWriter = _cursor.getString(_cursorIndexOfNameWriter);
            }
            final String _tmpTitle;
            if (_cursor.isNull(_cursorIndexOfTitle)) {
              _tmpTitle = null;
            } else {
              _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            }
            final String _tmpSubTitle;
            if (_cursor.isNull(_cursorIndexOfSubTitle)) {
              _tmpSubTitle = null;
            } else {
              _tmpSubTitle = _cursor.getString(_cursorIndexOfSubTitle);
            }
            final String _tmpMainText;
            if (_cursor.isNull(_cursorIndexOfMainText)) {
              _tmpMainText = null;
            } else {
              _tmpMainText = _cursor.getString(_cursorIndexOfMainText);
            }
            final String _tmpTema;
            if (_cursor.isNull(_cursorIndexOfTema)) {
              _tmpTema = null;
            } else {
              _tmpTema = _cursor.getString(_cursorIndexOfTema);
            }
            final boolean _tmpVoceSabiaList;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfVoceSabiaList);
            _tmpVoceSabiaList = _tmp != 0;
            final boolean _tmpExploreList;
            final int _tmp_1;
            _tmp_1 = _cursor.getInt(_cursorIndexOfExploreList);
            _tmpExploreList = _tmp_1 != 0;
            final Date _tmpDataMateria;
            final Long _tmp_2;
            if (_cursor.isNull(_cursorIndexOfDataMateria)) {
              _tmp_2 = null;
            } else {
              _tmp_2 = _cursor.getLong(_cursorIndexOfDataMateria);
            }
            _tmpDataMateria = __conversor.fromTimestamp(_tmp_2);
            _item = new MateriaDomain(_tmpImagePerfilUrl,_tmpImageBackGroundUrl,_tmpNameWriter,_tmpTitle,_tmpSubTitle,_tmpMainText,_tmpTema,_tmpVoceSabiaList,_tmpExploreList,_tmpDataMateria);
            final UUID _tmpMateriaId;
            if (_cursor.isNull(_cursorIndexOfMateriaId)) {
              _tmpMateriaId = null;
            } else {
              _tmpMateriaId = UUIDUtil.convertByteToUUID(_cursor.getBlob(_cursorIndexOfMateriaId));
            }
            _item.setMateriaId(_tmpMateriaId);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, $completion);
  }

  @Override
  public Object getTotalItems(final Continuation<? super Long> $completion) {
    final String _sql = "SELECT COUNT(materia_Id) FROM materias";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<Long>() {
      @Override
      public Long call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final Long _result;
          if(_cursor.moveToFirst()) {
            final Long _tmp;
            if (_cursor.isNull(0)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getLong(0);
            }
            _result = _tmp;
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, $completion);
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
