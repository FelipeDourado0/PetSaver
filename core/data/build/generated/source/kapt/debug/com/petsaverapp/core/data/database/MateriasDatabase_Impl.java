package com.petsaverapp.core.data.database;

import androidx.annotation.NonNull;
import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.RoomOpenHelper.ValidationResult;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import com.petsaverapp.core.data.database.daos.MateriaDao;
import com.petsaverapp.core.data.database.daos.MateriaDao_Impl;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.annotation.processing.Generated;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
public final class MateriasDatabase_Impl extends MateriasDatabase {
  private volatile MateriaDao _materiaDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `materias` (`imagem_perfil` TEXT NOT NULL, `imagem_BackGround` TEXT NOT NULL, `name_Writer` TEXT NOT NULL, `title` TEXT NOT NULL, `subTitle` TEXT NOT NULL, `mainText` TEXT NOT NULL, `tema` TEXT NOT NULL, `voceSabiaList` INTEGER NOT NULL, `exploreList` INTEGER NOT NULL, `dataMateria` INTEGER NOT NULL, `materia_Id` BLOB NOT NULL, PRIMARY KEY(`materia_Id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '4c4d10b9a6ca15acfcedb840c24d1a87')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `materias`");
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onDestructiveMigration(_db);
          }
        }
      }

      @Override
      public void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      public RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsMaterias = new HashMap<String, TableInfo.Column>(11);
        _columnsMaterias.put("imagem_perfil", new TableInfo.Column("imagem_perfil", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMaterias.put("imagem_BackGround", new TableInfo.Column("imagem_BackGround", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMaterias.put("name_Writer", new TableInfo.Column("name_Writer", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMaterias.put("title", new TableInfo.Column("title", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMaterias.put("subTitle", new TableInfo.Column("subTitle", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMaterias.put("mainText", new TableInfo.Column("mainText", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMaterias.put("tema", new TableInfo.Column("tema", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMaterias.put("voceSabiaList", new TableInfo.Column("voceSabiaList", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMaterias.put("exploreList", new TableInfo.Column("exploreList", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMaterias.put("dataMateria", new TableInfo.Column("dataMateria", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMaterias.put("materia_Id", new TableInfo.Column("materia_Id", "BLOB", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysMaterias = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesMaterias = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoMaterias = new TableInfo("materias", _columnsMaterias, _foreignKeysMaterias, _indicesMaterias);
        final TableInfo _existingMaterias = TableInfo.read(_db, "materias");
        if (! _infoMaterias.equals(_existingMaterias)) {
          return new RoomOpenHelper.ValidationResult(false, "materias(com.petsaverapp.core.data.database.model.MateriaDomain).\n"
                  + " Expected:\n" + _infoMaterias + "\n"
                  + " Found:\n" + _existingMaterias);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "4c4d10b9a6ca15acfcedb840c24d1a87", "af8ef70cd4c2c8a9bf49f1931afe0f99");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "materias");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `materias`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
    final HashMap<Class<?>, List<Class<?>>> _typeConvertersMap = new HashMap<Class<?>, List<Class<?>>>();
    _typeConvertersMap.put(MateriaDao.class, MateriaDao_Impl.getRequiredConverters());
    return _typeConvertersMap;
  }

  @Override
  public Set<Class<? extends AutoMigrationSpec>> getRequiredAutoMigrationSpecs() {
    final HashSet<Class<? extends AutoMigrationSpec>> _autoMigrationSpecsSet = new HashSet<Class<? extends AutoMigrationSpec>>();
    return _autoMigrationSpecsSet;
  }

  @Override
  public List<Migration> getAutoMigrations(
      @NonNull Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> autoMigrationSpecsMap) {
    return Arrays.asList();
  }

  @Override
  public MateriaDao materiaDAO() {
    if (_materiaDao != null) {
      return _materiaDao;
    } else {
      synchronized(this) {
        if(_materiaDao == null) {
          _materiaDao = new MateriaDao_Impl(this);
        }
        return _materiaDao;
      }
    }
  }
}
