package com.yeminnaing.movieapplication.persistence;

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
import com.yeminnaing.movieapplication.persistence.dao.MovieDao;
import com.yeminnaing.movieapplication.persistence.dao.MovieDao_Impl;
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

@SuppressWarnings({"unchecked", "deprecation"})
public final class MovieDatabase_Impl extends MovieDatabase {
  private volatile MovieDao _movieDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `movie_table` (`adult` INTEGER, `backdrop_path` TEXT, `genre_ids` TEXT, `belongs_to_collection` TEXT, `id` INTEGER NOT NULL, `original_language` TEXT, `original_title` TEXT, `overview` TEXT, `popularity` REAL, `poster_path` TEXT, `release_date` TEXT, `title` TEXT, `video` INTEGER, `vote_average` REAL, `vote_count` INTEGER, `status` TEXT, `tagline` TEXT, `revenue` TEXT, `runtime` TEXT, `production_companies` TEXT, `production_countries` TEXT, `homepage` TEXT, `imdb_id` TEXT, `budget` INTEGER, `genres` TEXT, `spoken_languages` TEXT, `type` TEXT, PRIMARY KEY(`id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '62adabfab414f4819e128a9d0ad2e86b')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `movie_table`");
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
        final HashMap<String, TableInfo.Column> _columnsMovieTable = new HashMap<String, TableInfo.Column>(27);
        _columnsMovieTable.put("adult", new TableInfo.Column("adult", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMovieTable.put("backdrop_path", new TableInfo.Column("backdrop_path", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMovieTable.put("genre_ids", new TableInfo.Column("genre_ids", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMovieTable.put("belongs_to_collection", new TableInfo.Column("belongs_to_collection", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMovieTable.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMovieTable.put("original_language", new TableInfo.Column("original_language", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMovieTable.put("original_title", new TableInfo.Column("original_title", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMovieTable.put("overview", new TableInfo.Column("overview", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMovieTable.put("popularity", new TableInfo.Column("popularity", "REAL", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMovieTable.put("poster_path", new TableInfo.Column("poster_path", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMovieTable.put("release_date", new TableInfo.Column("release_date", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMovieTable.put("title", new TableInfo.Column("title", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMovieTable.put("video", new TableInfo.Column("video", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMovieTable.put("vote_average", new TableInfo.Column("vote_average", "REAL", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMovieTable.put("vote_count", new TableInfo.Column("vote_count", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMovieTable.put("status", new TableInfo.Column("status", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMovieTable.put("tagline", new TableInfo.Column("tagline", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMovieTable.put("revenue", new TableInfo.Column("revenue", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMovieTable.put("runtime", new TableInfo.Column("runtime", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMovieTable.put("production_companies", new TableInfo.Column("production_companies", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMovieTable.put("production_countries", new TableInfo.Column("production_countries", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMovieTable.put("homepage", new TableInfo.Column("homepage", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMovieTable.put("imdb_id", new TableInfo.Column("imdb_id", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMovieTable.put("budget", new TableInfo.Column("budget", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMovieTable.put("genres", new TableInfo.Column("genres", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMovieTable.put("spoken_languages", new TableInfo.Column("spoken_languages", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMovieTable.put("type", new TableInfo.Column("type", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysMovieTable = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesMovieTable = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoMovieTable = new TableInfo("movie_table", _columnsMovieTable, _foreignKeysMovieTable, _indicesMovieTable);
        final TableInfo _existingMovieTable = TableInfo.read(_db, "movie_table");
        if (! _infoMovieTable.equals(_existingMovieTable)) {
          return new RoomOpenHelper.ValidationResult(false, "movie_table(com.yeminnaing.movieapplication.data.vos.MovieVO).\n"
                  + " Expected:\n" + _infoMovieTable + "\n"
                  + " Found:\n" + _existingMovieTable);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "62adabfab414f4819e128a9d0ad2e86b", "fed8f8880811fa45718de85a8592681d");
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
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "movie_table");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `movie_table`");
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
    _typeConvertersMap.put(MovieDao.class, MovieDao_Impl.getRequiredConverters());
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
  public MovieDao movieDao() {
    if (_movieDao != null) {
      return _movieDao;
    } else {
      synchronized(this) {
        if(_movieDao == null) {
          _movieDao = new MovieDao_Impl(this);
        }
        return _movieDao;
      }
    }
  }
}
