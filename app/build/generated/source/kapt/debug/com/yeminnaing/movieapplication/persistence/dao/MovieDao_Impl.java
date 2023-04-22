package com.yeminnaing.movieapplication.persistence.dao;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.rxjava3.RxRoom;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.flexath.themovieapp.persistence.typeconverters.CollectionTypeConverter;
import com.flexath.themovieapp.persistence.typeconverters.GenreListTypeConverter;
import com.flexath.themovieapp.persistence.typeconverters.ProductionCompanyTypeConverter;
import com.flexath.themovieapp.persistence.typeconverters.ProductionCountryTypeConverter;
import com.flexath.themovieapp.persistence.typeconverters.SpokenLanguageTypeConverter;
import com.yeminnaing.movieapplication.data.vos.CollectionVO;
import com.yeminnaing.movieapplication.data.vos.GenreVO;
import com.yeminnaing.movieapplication.data.vos.MovieVO;
import com.yeminnaing.movieapplication.data.vos.ProductionCompanyVO;
import com.yeminnaing.movieapplication.data.vos.ProductionCountryVO;
import com.yeminnaing.movieapplication.data.vos.SpokenLanguageVO;
import com.yeminnaing.movieapplication.persistence.typeconverters.GenreIdsTypeConverter;
import io.reactivex.rxjava3.core.Flowable;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.Double;
import java.lang.Exception;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;

@SuppressWarnings({"unchecked", "deprecation"})
public final class MovieDao_Impl implements MovieDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<MovieVO> __insertionAdapterOfMovieVO;

  private final GenreIdsTypeConverter __genreIdsTypeConverter = new GenreIdsTypeConverter();

  private final CollectionTypeConverter __collectionTypeConverter = new CollectionTypeConverter();

  private final ProductionCompanyTypeConverter __productionCompanyTypeConverter = new ProductionCompanyTypeConverter();

  private final ProductionCountryTypeConverter __productionCountryTypeConverter = new ProductionCountryTypeConverter();

  private final GenreListTypeConverter __genreListTypeConverter = new GenreListTypeConverter();

  private final SpokenLanguageTypeConverter __spokenLanguageTypeConverter = new SpokenLanguageTypeConverter();

  private final SharedSQLiteStatement __preparedStmtOfDeleteAllMovies;

  public MovieDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfMovieVO = new EntityInsertionAdapter<MovieVO>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `movie_table` (`adult`,`backdrop_path`,`genre_ids`,`belongs_to_collection`,`id`,`original_language`,`original_title`,`overview`,`popularity`,`poster_path`,`release_date`,`title`,`video`,`vote_average`,`vote_count`,`status`,`tagline`,`revenue`,`runtime`,`production_companies`,`production_countries`,`homepage`,`imdb_id`,`budget`,`genres`,`spoken_languages`,`type`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, MovieVO value) {
        final Integer _tmp = value.getAdult() == null ? null : (value.getAdult() ? 1 : 0);
        if (_tmp == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindLong(1, _tmp);
        }
        if (value.getBackDropPath() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getBackDropPath());
        }
        final String _tmp_1 = __genreIdsTypeConverter.toString(value.getGenreIds());
        if (_tmp_1 == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, _tmp_1);
        }
        final String _tmp_2 = __collectionTypeConverter.toString(value.getBelongToCollection());
        if (_tmp_2 == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, _tmp_2);
        }
        stmt.bindLong(5, value.getId());
        if (value.getOriginalLanguage() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getOriginalLanguage());
        }
        if (value.getOriginalTitle() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getOriginalTitle());
        }
        if (value.getOverview() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getOverview());
        }
        if (value.getPopularity() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindDouble(9, value.getPopularity());
        }
        if (value.getPosterPath() == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindString(10, value.getPosterPath());
        }
        if (value.getReleaseDate() == null) {
          stmt.bindNull(11);
        } else {
          stmt.bindString(11, value.getReleaseDate());
        }
        if (value.getTitle() == null) {
          stmt.bindNull(12);
        } else {
          stmt.bindString(12, value.getTitle());
        }
        final Integer _tmp_3 = value.getVideo() == null ? null : (value.getVideo() ? 1 : 0);
        if (_tmp_3 == null) {
          stmt.bindNull(13);
        } else {
          stmt.bindLong(13, _tmp_3);
        }
        if (value.getVoteAverage() == null) {
          stmt.bindNull(14);
        } else {
          stmt.bindDouble(14, value.getVoteAverage());
        }
        if (value.getVoteCount() == null) {
          stmt.bindNull(15);
        } else {
          stmt.bindLong(15, value.getVoteCount());
        }
        if (value.getStatus() == null) {
          stmt.bindNull(16);
        } else {
          stmt.bindString(16, value.getStatus());
        }
        if (value.getTagline() == null) {
          stmt.bindNull(17);
        } else {
          stmt.bindString(17, value.getTagline());
        }
        if (value.getRevenue() == null) {
          stmt.bindNull(18);
        } else {
          stmt.bindString(18, value.getRevenue());
        }
        if (value.getRuntime() == null) {
          stmt.bindNull(19);
        } else {
          stmt.bindString(19, value.getRuntime());
        }
        final String _tmp_4 = __productionCompanyTypeConverter.toString(value.getProductionCompanies());
        if (_tmp_4 == null) {
          stmt.bindNull(20);
        } else {
          stmt.bindString(20, _tmp_4);
        }
        final String _tmp_5 = __productionCountryTypeConverter.toString(value.getProductionCountries());
        if (_tmp_5 == null) {
          stmt.bindNull(21);
        } else {
          stmt.bindString(21, _tmp_5);
        }
        if (value.getHomepage() == null) {
          stmt.bindNull(22);
        } else {
          stmt.bindString(22, value.getHomepage());
        }
        if (value.getImdbId() == null) {
          stmt.bindNull(23);
        } else {
          stmt.bindString(23, value.getImdbId());
        }
        if (value.getBudget() == null) {
          stmt.bindNull(24);
        } else {
          stmt.bindLong(24, value.getBudget());
        }
        final String _tmp_6 = __genreListTypeConverter.toString(value.getGenres());
        if (_tmp_6 == null) {
          stmt.bindNull(25);
        } else {
          stmt.bindString(25, _tmp_6);
        }
        final String _tmp_7 = __spokenLanguageTypeConverter.toString(value.getSpokenLanguages());
        if (_tmp_7 == null) {
          stmt.bindNull(26);
        } else {
          stmt.bindString(26, _tmp_7);
        }
        if (value.getType() == null) {
          stmt.bindNull(27);
        } else {
          stmt.bindString(27, value.getType());
        }
      }
    };
    this.__preparedStmtOfDeleteAllMovies = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM movie_table";
        return _query;
      }
    };
  }

  @Override
  public void insertMovies(final List<MovieVO> movies) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfMovieVO.insert(movies);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void insertSingleMovie(final MovieVO movie) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfMovieVO.insert(movie);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteAllMovies() {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteAllMovies.acquire();
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteAllMovies.release(_stmt);
    }
  }

  @Override
  public LiveData<List<MovieVO>> getAllMovies() {
    final String _sql = "SELECT * FROM movie_table";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"movie_table"}, false, new Callable<List<MovieVO>>() {
      @Override
      public List<MovieVO> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfAdult = CursorUtil.getColumnIndexOrThrow(_cursor, "adult");
          final int _cursorIndexOfBackDropPath = CursorUtil.getColumnIndexOrThrow(_cursor, "backdrop_path");
          final int _cursorIndexOfGenreIds = CursorUtil.getColumnIndexOrThrow(_cursor, "genre_ids");
          final int _cursorIndexOfBelongToCollection = CursorUtil.getColumnIndexOrThrow(_cursor, "belongs_to_collection");
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfOriginalLanguage = CursorUtil.getColumnIndexOrThrow(_cursor, "original_language");
          final int _cursorIndexOfOriginalTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "original_title");
          final int _cursorIndexOfOverview = CursorUtil.getColumnIndexOrThrow(_cursor, "overview");
          final int _cursorIndexOfPopularity = CursorUtil.getColumnIndexOrThrow(_cursor, "popularity");
          final int _cursorIndexOfPosterPath = CursorUtil.getColumnIndexOrThrow(_cursor, "poster_path");
          final int _cursorIndexOfReleaseDate = CursorUtil.getColumnIndexOrThrow(_cursor, "release_date");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfVideo = CursorUtil.getColumnIndexOrThrow(_cursor, "video");
          final int _cursorIndexOfVoteAverage = CursorUtil.getColumnIndexOrThrow(_cursor, "vote_average");
          final int _cursorIndexOfVoteCount = CursorUtil.getColumnIndexOrThrow(_cursor, "vote_count");
          final int _cursorIndexOfStatus = CursorUtil.getColumnIndexOrThrow(_cursor, "status");
          final int _cursorIndexOfTagline = CursorUtil.getColumnIndexOrThrow(_cursor, "tagline");
          final int _cursorIndexOfRevenue = CursorUtil.getColumnIndexOrThrow(_cursor, "revenue");
          final int _cursorIndexOfRuntime = CursorUtil.getColumnIndexOrThrow(_cursor, "runtime");
          final int _cursorIndexOfProductionCompanies = CursorUtil.getColumnIndexOrThrow(_cursor, "production_companies");
          final int _cursorIndexOfProductionCountries = CursorUtil.getColumnIndexOrThrow(_cursor, "production_countries");
          final int _cursorIndexOfHomepage = CursorUtil.getColumnIndexOrThrow(_cursor, "homepage");
          final int _cursorIndexOfImdbId = CursorUtil.getColumnIndexOrThrow(_cursor, "imdb_id");
          final int _cursorIndexOfBudget = CursorUtil.getColumnIndexOrThrow(_cursor, "budget");
          final int _cursorIndexOfGenres = CursorUtil.getColumnIndexOrThrow(_cursor, "genres");
          final int _cursorIndexOfSpokenLanguages = CursorUtil.getColumnIndexOrThrow(_cursor, "spoken_languages");
          final int _cursorIndexOfType = CursorUtil.getColumnIndexOrThrow(_cursor, "type");
          final List<MovieVO> _result = new ArrayList<MovieVO>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final MovieVO _item;
            final Boolean _tmpAdult;
            final Integer _tmp;
            if (_cursor.isNull(_cursorIndexOfAdult)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getInt(_cursorIndexOfAdult);
            }
            _tmpAdult = _tmp == null ? null : _tmp != 0;
            final String _tmpBackDropPath;
            if (_cursor.isNull(_cursorIndexOfBackDropPath)) {
              _tmpBackDropPath = null;
            } else {
              _tmpBackDropPath = _cursor.getString(_cursorIndexOfBackDropPath);
            }
            final List<Integer> _tmpGenreIds;
            final String _tmp_1;
            if (_cursor.isNull(_cursorIndexOfGenreIds)) {
              _tmp_1 = null;
            } else {
              _tmp_1 = _cursor.getString(_cursorIndexOfGenreIds);
            }
            _tmpGenreIds = __genreIdsTypeConverter.toGenreIds(_tmp_1);
            final CollectionVO _tmpBelongToCollection;
            final String _tmp_2;
            if (_cursor.isNull(_cursorIndexOfBelongToCollection)) {
              _tmp_2 = null;
            } else {
              _tmp_2 = _cursor.getString(_cursorIndexOfBelongToCollection);
            }
            _tmpBelongToCollection = __collectionTypeConverter.toCollection(_tmp_2);
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpOriginalLanguage;
            if (_cursor.isNull(_cursorIndexOfOriginalLanguage)) {
              _tmpOriginalLanguage = null;
            } else {
              _tmpOriginalLanguage = _cursor.getString(_cursorIndexOfOriginalLanguage);
            }
            final String _tmpOriginalTitle;
            if (_cursor.isNull(_cursorIndexOfOriginalTitle)) {
              _tmpOriginalTitle = null;
            } else {
              _tmpOriginalTitle = _cursor.getString(_cursorIndexOfOriginalTitle);
            }
            final String _tmpOverview;
            if (_cursor.isNull(_cursorIndexOfOverview)) {
              _tmpOverview = null;
            } else {
              _tmpOverview = _cursor.getString(_cursorIndexOfOverview);
            }
            final Double _tmpPopularity;
            if (_cursor.isNull(_cursorIndexOfPopularity)) {
              _tmpPopularity = null;
            } else {
              _tmpPopularity = _cursor.getDouble(_cursorIndexOfPopularity);
            }
            final String _tmpPosterPath;
            if (_cursor.isNull(_cursorIndexOfPosterPath)) {
              _tmpPosterPath = null;
            } else {
              _tmpPosterPath = _cursor.getString(_cursorIndexOfPosterPath);
            }
            final String _tmpReleaseDate;
            if (_cursor.isNull(_cursorIndexOfReleaseDate)) {
              _tmpReleaseDate = null;
            } else {
              _tmpReleaseDate = _cursor.getString(_cursorIndexOfReleaseDate);
            }
            final String _tmpTitle;
            if (_cursor.isNull(_cursorIndexOfTitle)) {
              _tmpTitle = null;
            } else {
              _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            }
            final Boolean _tmpVideo;
            final Integer _tmp_3;
            if (_cursor.isNull(_cursorIndexOfVideo)) {
              _tmp_3 = null;
            } else {
              _tmp_3 = _cursor.getInt(_cursorIndexOfVideo);
            }
            _tmpVideo = _tmp_3 == null ? null : _tmp_3 != 0;
            final Double _tmpVoteAverage;
            if (_cursor.isNull(_cursorIndexOfVoteAverage)) {
              _tmpVoteAverage = null;
            } else {
              _tmpVoteAverage = _cursor.getDouble(_cursorIndexOfVoteAverage);
            }
            final Integer _tmpVoteCount;
            if (_cursor.isNull(_cursorIndexOfVoteCount)) {
              _tmpVoteCount = null;
            } else {
              _tmpVoteCount = _cursor.getInt(_cursorIndexOfVoteCount);
            }
            final String _tmpStatus;
            if (_cursor.isNull(_cursorIndexOfStatus)) {
              _tmpStatus = null;
            } else {
              _tmpStatus = _cursor.getString(_cursorIndexOfStatus);
            }
            final String _tmpTagline;
            if (_cursor.isNull(_cursorIndexOfTagline)) {
              _tmpTagline = null;
            } else {
              _tmpTagline = _cursor.getString(_cursorIndexOfTagline);
            }
            final String _tmpRevenue;
            if (_cursor.isNull(_cursorIndexOfRevenue)) {
              _tmpRevenue = null;
            } else {
              _tmpRevenue = _cursor.getString(_cursorIndexOfRevenue);
            }
            final String _tmpRuntime;
            if (_cursor.isNull(_cursorIndexOfRuntime)) {
              _tmpRuntime = null;
            } else {
              _tmpRuntime = _cursor.getString(_cursorIndexOfRuntime);
            }
            final List<ProductionCompanyVO> _tmpProductionCompanies;
            final String _tmp_4;
            if (_cursor.isNull(_cursorIndexOfProductionCompanies)) {
              _tmp_4 = null;
            } else {
              _tmp_4 = _cursor.getString(_cursorIndexOfProductionCompanies);
            }
            _tmpProductionCompanies = __productionCompanyTypeConverter.toProductionCompanies(_tmp_4);
            final List<ProductionCountryVO> _tmpProductionCountries;
            final String _tmp_5;
            if (_cursor.isNull(_cursorIndexOfProductionCountries)) {
              _tmp_5 = null;
            } else {
              _tmp_5 = _cursor.getString(_cursorIndexOfProductionCountries);
            }
            _tmpProductionCountries = __productionCountryTypeConverter.toProductionCountries(_tmp_5);
            final String _tmpHomepage;
            if (_cursor.isNull(_cursorIndexOfHomepage)) {
              _tmpHomepage = null;
            } else {
              _tmpHomepage = _cursor.getString(_cursorIndexOfHomepage);
            }
            final String _tmpImdbId;
            if (_cursor.isNull(_cursorIndexOfImdbId)) {
              _tmpImdbId = null;
            } else {
              _tmpImdbId = _cursor.getString(_cursorIndexOfImdbId);
            }
            final Long _tmpBudget;
            if (_cursor.isNull(_cursorIndexOfBudget)) {
              _tmpBudget = null;
            } else {
              _tmpBudget = _cursor.getLong(_cursorIndexOfBudget);
            }
            final List<GenreVO> _tmpGenres;
            final String _tmp_6;
            if (_cursor.isNull(_cursorIndexOfGenres)) {
              _tmp_6 = null;
            } else {
              _tmp_6 = _cursor.getString(_cursorIndexOfGenres);
            }
            _tmpGenres = __genreListTypeConverter.toGenreList(_tmp_6);
            final List<SpokenLanguageVO> _tmpSpokenLanguages;
            final String _tmp_7;
            if (_cursor.isNull(_cursorIndexOfSpokenLanguages)) {
              _tmp_7 = null;
            } else {
              _tmp_7 = _cursor.getString(_cursorIndexOfSpokenLanguages);
            }
            _tmpSpokenLanguages = __spokenLanguageTypeConverter.toSpokenLanguages(_tmp_7);
            final String _tmpType;
            if (_cursor.isNull(_cursorIndexOfType)) {
              _tmpType = null;
            } else {
              _tmpType = _cursor.getString(_cursorIndexOfType);
            }
            _item = new MovieVO(_tmpAdult,_tmpBackDropPath,_tmpGenreIds,_tmpBelongToCollection,_tmpId,_tmpOriginalLanguage,_tmpOriginalTitle,_tmpOverview,_tmpPopularity,_tmpPosterPath,_tmpReleaseDate,_tmpTitle,_tmpVideo,_tmpVoteAverage,_tmpVoteCount,_tmpStatus,_tmpTagline,_tmpRevenue,_tmpRuntime,_tmpProductionCompanies,_tmpProductionCountries,_tmpHomepage,_tmpImdbId,_tmpBudget,_tmpGenres,_tmpSpokenLanguages,_tmpType);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public LiveData<MovieVO> getMovieById(final int movieId) {
    final String _sql = "SELECT * FROM movie_table WHERE id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, movieId);
    return __db.getInvalidationTracker().createLiveData(new String[]{"movie_table"}, false, new Callable<MovieVO>() {
      @Override
      public MovieVO call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfAdult = CursorUtil.getColumnIndexOrThrow(_cursor, "adult");
          final int _cursorIndexOfBackDropPath = CursorUtil.getColumnIndexOrThrow(_cursor, "backdrop_path");
          final int _cursorIndexOfGenreIds = CursorUtil.getColumnIndexOrThrow(_cursor, "genre_ids");
          final int _cursorIndexOfBelongToCollection = CursorUtil.getColumnIndexOrThrow(_cursor, "belongs_to_collection");
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfOriginalLanguage = CursorUtil.getColumnIndexOrThrow(_cursor, "original_language");
          final int _cursorIndexOfOriginalTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "original_title");
          final int _cursorIndexOfOverview = CursorUtil.getColumnIndexOrThrow(_cursor, "overview");
          final int _cursorIndexOfPopularity = CursorUtil.getColumnIndexOrThrow(_cursor, "popularity");
          final int _cursorIndexOfPosterPath = CursorUtil.getColumnIndexOrThrow(_cursor, "poster_path");
          final int _cursorIndexOfReleaseDate = CursorUtil.getColumnIndexOrThrow(_cursor, "release_date");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfVideo = CursorUtil.getColumnIndexOrThrow(_cursor, "video");
          final int _cursorIndexOfVoteAverage = CursorUtil.getColumnIndexOrThrow(_cursor, "vote_average");
          final int _cursorIndexOfVoteCount = CursorUtil.getColumnIndexOrThrow(_cursor, "vote_count");
          final int _cursorIndexOfStatus = CursorUtil.getColumnIndexOrThrow(_cursor, "status");
          final int _cursorIndexOfTagline = CursorUtil.getColumnIndexOrThrow(_cursor, "tagline");
          final int _cursorIndexOfRevenue = CursorUtil.getColumnIndexOrThrow(_cursor, "revenue");
          final int _cursorIndexOfRuntime = CursorUtil.getColumnIndexOrThrow(_cursor, "runtime");
          final int _cursorIndexOfProductionCompanies = CursorUtil.getColumnIndexOrThrow(_cursor, "production_companies");
          final int _cursorIndexOfProductionCountries = CursorUtil.getColumnIndexOrThrow(_cursor, "production_countries");
          final int _cursorIndexOfHomepage = CursorUtil.getColumnIndexOrThrow(_cursor, "homepage");
          final int _cursorIndexOfImdbId = CursorUtil.getColumnIndexOrThrow(_cursor, "imdb_id");
          final int _cursorIndexOfBudget = CursorUtil.getColumnIndexOrThrow(_cursor, "budget");
          final int _cursorIndexOfGenres = CursorUtil.getColumnIndexOrThrow(_cursor, "genres");
          final int _cursorIndexOfSpokenLanguages = CursorUtil.getColumnIndexOrThrow(_cursor, "spoken_languages");
          final int _cursorIndexOfType = CursorUtil.getColumnIndexOrThrow(_cursor, "type");
          final MovieVO _result;
          if(_cursor.moveToFirst()) {
            final Boolean _tmpAdult;
            final Integer _tmp;
            if (_cursor.isNull(_cursorIndexOfAdult)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getInt(_cursorIndexOfAdult);
            }
            _tmpAdult = _tmp == null ? null : _tmp != 0;
            final String _tmpBackDropPath;
            if (_cursor.isNull(_cursorIndexOfBackDropPath)) {
              _tmpBackDropPath = null;
            } else {
              _tmpBackDropPath = _cursor.getString(_cursorIndexOfBackDropPath);
            }
            final List<Integer> _tmpGenreIds;
            final String _tmp_1;
            if (_cursor.isNull(_cursorIndexOfGenreIds)) {
              _tmp_1 = null;
            } else {
              _tmp_1 = _cursor.getString(_cursorIndexOfGenreIds);
            }
            _tmpGenreIds = __genreIdsTypeConverter.toGenreIds(_tmp_1);
            final CollectionVO _tmpBelongToCollection;
            final String _tmp_2;
            if (_cursor.isNull(_cursorIndexOfBelongToCollection)) {
              _tmp_2 = null;
            } else {
              _tmp_2 = _cursor.getString(_cursorIndexOfBelongToCollection);
            }
            _tmpBelongToCollection = __collectionTypeConverter.toCollection(_tmp_2);
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpOriginalLanguage;
            if (_cursor.isNull(_cursorIndexOfOriginalLanguage)) {
              _tmpOriginalLanguage = null;
            } else {
              _tmpOriginalLanguage = _cursor.getString(_cursorIndexOfOriginalLanguage);
            }
            final String _tmpOriginalTitle;
            if (_cursor.isNull(_cursorIndexOfOriginalTitle)) {
              _tmpOriginalTitle = null;
            } else {
              _tmpOriginalTitle = _cursor.getString(_cursorIndexOfOriginalTitle);
            }
            final String _tmpOverview;
            if (_cursor.isNull(_cursorIndexOfOverview)) {
              _tmpOverview = null;
            } else {
              _tmpOverview = _cursor.getString(_cursorIndexOfOverview);
            }
            final Double _tmpPopularity;
            if (_cursor.isNull(_cursorIndexOfPopularity)) {
              _tmpPopularity = null;
            } else {
              _tmpPopularity = _cursor.getDouble(_cursorIndexOfPopularity);
            }
            final String _tmpPosterPath;
            if (_cursor.isNull(_cursorIndexOfPosterPath)) {
              _tmpPosterPath = null;
            } else {
              _tmpPosterPath = _cursor.getString(_cursorIndexOfPosterPath);
            }
            final String _tmpReleaseDate;
            if (_cursor.isNull(_cursorIndexOfReleaseDate)) {
              _tmpReleaseDate = null;
            } else {
              _tmpReleaseDate = _cursor.getString(_cursorIndexOfReleaseDate);
            }
            final String _tmpTitle;
            if (_cursor.isNull(_cursorIndexOfTitle)) {
              _tmpTitle = null;
            } else {
              _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            }
            final Boolean _tmpVideo;
            final Integer _tmp_3;
            if (_cursor.isNull(_cursorIndexOfVideo)) {
              _tmp_3 = null;
            } else {
              _tmp_3 = _cursor.getInt(_cursorIndexOfVideo);
            }
            _tmpVideo = _tmp_3 == null ? null : _tmp_3 != 0;
            final Double _tmpVoteAverage;
            if (_cursor.isNull(_cursorIndexOfVoteAverage)) {
              _tmpVoteAverage = null;
            } else {
              _tmpVoteAverage = _cursor.getDouble(_cursorIndexOfVoteAverage);
            }
            final Integer _tmpVoteCount;
            if (_cursor.isNull(_cursorIndexOfVoteCount)) {
              _tmpVoteCount = null;
            } else {
              _tmpVoteCount = _cursor.getInt(_cursorIndexOfVoteCount);
            }
            final String _tmpStatus;
            if (_cursor.isNull(_cursorIndexOfStatus)) {
              _tmpStatus = null;
            } else {
              _tmpStatus = _cursor.getString(_cursorIndexOfStatus);
            }
            final String _tmpTagline;
            if (_cursor.isNull(_cursorIndexOfTagline)) {
              _tmpTagline = null;
            } else {
              _tmpTagline = _cursor.getString(_cursorIndexOfTagline);
            }
            final String _tmpRevenue;
            if (_cursor.isNull(_cursorIndexOfRevenue)) {
              _tmpRevenue = null;
            } else {
              _tmpRevenue = _cursor.getString(_cursorIndexOfRevenue);
            }
            final String _tmpRuntime;
            if (_cursor.isNull(_cursorIndexOfRuntime)) {
              _tmpRuntime = null;
            } else {
              _tmpRuntime = _cursor.getString(_cursorIndexOfRuntime);
            }
            final List<ProductionCompanyVO> _tmpProductionCompanies;
            final String _tmp_4;
            if (_cursor.isNull(_cursorIndexOfProductionCompanies)) {
              _tmp_4 = null;
            } else {
              _tmp_4 = _cursor.getString(_cursorIndexOfProductionCompanies);
            }
            _tmpProductionCompanies = __productionCompanyTypeConverter.toProductionCompanies(_tmp_4);
            final List<ProductionCountryVO> _tmpProductionCountries;
            final String _tmp_5;
            if (_cursor.isNull(_cursorIndexOfProductionCountries)) {
              _tmp_5 = null;
            } else {
              _tmp_5 = _cursor.getString(_cursorIndexOfProductionCountries);
            }
            _tmpProductionCountries = __productionCountryTypeConverter.toProductionCountries(_tmp_5);
            final String _tmpHomepage;
            if (_cursor.isNull(_cursorIndexOfHomepage)) {
              _tmpHomepage = null;
            } else {
              _tmpHomepage = _cursor.getString(_cursorIndexOfHomepage);
            }
            final String _tmpImdbId;
            if (_cursor.isNull(_cursorIndexOfImdbId)) {
              _tmpImdbId = null;
            } else {
              _tmpImdbId = _cursor.getString(_cursorIndexOfImdbId);
            }
            final Long _tmpBudget;
            if (_cursor.isNull(_cursorIndexOfBudget)) {
              _tmpBudget = null;
            } else {
              _tmpBudget = _cursor.getLong(_cursorIndexOfBudget);
            }
            final List<GenreVO> _tmpGenres;
            final String _tmp_6;
            if (_cursor.isNull(_cursorIndexOfGenres)) {
              _tmp_6 = null;
            } else {
              _tmp_6 = _cursor.getString(_cursorIndexOfGenres);
            }
            _tmpGenres = __genreListTypeConverter.toGenreList(_tmp_6);
            final List<SpokenLanguageVO> _tmpSpokenLanguages;
            final String _tmp_7;
            if (_cursor.isNull(_cursorIndexOfSpokenLanguages)) {
              _tmp_7 = null;
            } else {
              _tmp_7 = _cursor.getString(_cursorIndexOfSpokenLanguages);
            }
            _tmpSpokenLanguages = __spokenLanguageTypeConverter.toSpokenLanguages(_tmp_7);
            final String _tmpType;
            if (_cursor.isNull(_cursorIndexOfType)) {
              _tmpType = null;
            } else {
              _tmpType = _cursor.getString(_cursorIndexOfType);
            }
            _result = new MovieVO(_tmpAdult,_tmpBackDropPath,_tmpGenreIds,_tmpBelongToCollection,_tmpId,_tmpOriginalLanguage,_tmpOriginalTitle,_tmpOverview,_tmpPopularity,_tmpPosterPath,_tmpReleaseDate,_tmpTitle,_tmpVideo,_tmpVoteAverage,_tmpVoteCount,_tmpStatus,_tmpTagline,_tmpRevenue,_tmpRuntime,_tmpProductionCompanies,_tmpProductionCountries,_tmpHomepage,_tmpImdbId,_tmpBudget,_tmpGenres,_tmpSpokenLanguages,_tmpType);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public MovieVO getMovieByIdOneTime(final int movieId) {
    final String _sql = "SELECT * FROM movie_table WHERE id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, movieId);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfAdult = CursorUtil.getColumnIndexOrThrow(_cursor, "adult");
      final int _cursorIndexOfBackDropPath = CursorUtil.getColumnIndexOrThrow(_cursor, "backdrop_path");
      final int _cursorIndexOfGenreIds = CursorUtil.getColumnIndexOrThrow(_cursor, "genre_ids");
      final int _cursorIndexOfBelongToCollection = CursorUtil.getColumnIndexOrThrow(_cursor, "belongs_to_collection");
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfOriginalLanguage = CursorUtil.getColumnIndexOrThrow(_cursor, "original_language");
      final int _cursorIndexOfOriginalTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "original_title");
      final int _cursorIndexOfOverview = CursorUtil.getColumnIndexOrThrow(_cursor, "overview");
      final int _cursorIndexOfPopularity = CursorUtil.getColumnIndexOrThrow(_cursor, "popularity");
      final int _cursorIndexOfPosterPath = CursorUtil.getColumnIndexOrThrow(_cursor, "poster_path");
      final int _cursorIndexOfReleaseDate = CursorUtil.getColumnIndexOrThrow(_cursor, "release_date");
      final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
      final int _cursorIndexOfVideo = CursorUtil.getColumnIndexOrThrow(_cursor, "video");
      final int _cursorIndexOfVoteAverage = CursorUtil.getColumnIndexOrThrow(_cursor, "vote_average");
      final int _cursorIndexOfVoteCount = CursorUtil.getColumnIndexOrThrow(_cursor, "vote_count");
      final int _cursorIndexOfStatus = CursorUtil.getColumnIndexOrThrow(_cursor, "status");
      final int _cursorIndexOfTagline = CursorUtil.getColumnIndexOrThrow(_cursor, "tagline");
      final int _cursorIndexOfRevenue = CursorUtil.getColumnIndexOrThrow(_cursor, "revenue");
      final int _cursorIndexOfRuntime = CursorUtil.getColumnIndexOrThrow(_cursor, "runtime");
      final int _cursorIndexOfProductionCompanies = CursorUtil.getColumnIndexOrThrow(_cursor, "production_companies");
      final int _cursorIndexOfProductionCountries = CursorUtil.getColumnIndexOrThrow(_cursor, "production_countries");
      final int _cursorIndexOfHomepage = CursorUtil.getColumnIndexOrThrow(_cursor, "homepage");
      final int _cursorIndexOfImdbId = CursorUtil.getColumnIndexOrThrow(_cursor, "imdb_id");
      final int _cursorIndexOfBudget = CursorUtil.getColumnIndexOrThrow(_cursor, "budget");
      final int _cursorIndexOfGenres = CursorUtil.getColumnIndexOrThrow(_cursor, "genres");
      final int _cursorIndexOfSpokenLanguages = CursorUtil.getColumnIndexOrThrow(_cursor, "spoken_languages");
      final int _cursorIndexOfType = CursorUtil.getColumnIndexOrThrow(_cursor, "type");
      final MovieVO _result;
      if(_cursor.moveToFirst()) {
        final Boolean _tmpAdult;
        final Integer _tmp;
        if (_cursor.isNull(_cursorIndexOfAdult)) {
          _tmp = null;
        } else {
          _tmp = _cursor.getInt(_cursorIndexOfAdult);
        }
        _tmpAdult = _tmp == null ? null : _tmp != 0;
        final String _tmpBackDropPath;
        if (_cursor.isNull(_cursorIndexOfBackDropPath)) {
          _tmpBackDropPath = null;
        } else {
          _tmpBackDropPath = _cursor.getString(_cursorIndexOfBackDropPath);
        }
        final List<Integer> _tmpGenreIds;
        final String _tmp_1;
        if (_cursor.isNull(_cursorIndexOfGenreIds)) {
          _tmp_1 = null;
        } else {
          _tmp_1 = _cursor.getString(_cursorIndexOfGenreIds);
        }
        _tmpGenreIds = __genreIdsTypeConverter.toGenreIds(_tmp_1);
        final CollectionVO _tmpBelongToCollection;
        final String _tmp_2;
        if (_cursor.isNull(_cursorIndexOfBelongToCollection)) {
          _tmp_2 = null;
        } else {
          _tmp_2 = _cursor.getString(_cursorIndexOfBelongToCollection);
        }
        _tmpBelongToCollection = __collectionTypeConverter.toCollection(_tmp_2);
        final int _tmpId;
        _tmpId = _cursor.getInt(_cursorIndexOfId);
        final String _tmpOriginalLanguage;
        if (_cursor.isNull(_cursorIndexOfOriginalLanguage)) {
          _tmpOriginalLanguage = null;
        } else {
          _tmpOriginalLanguage = _cursor.getString(_cursorIndexOfOriginalLanguage);
        }
        final String _tmpOriginalTitle;
        if (_cursor.isNull(_cursorIndexOfOriginalTitle)) {
          _tmpOriginalTitle = null;
        } else {
          _tmpOriginalTitle = _cursor.getString(_cursorIndexOfOriginalTitle);
        }
        final String _tmpOverview;
        if (_cursor.isNull(_cursorIndexOfOverview)) {
          _tmpOverview = null;
        } else {
          _tmpOverview = _cursor.getString(_cursorIndexOfOverview);
        }
        final Double _tmpPopularity;
        if (_cursor.isNull(_cursorIndexOfPopularity)) {
          _tmpPopularity = null;
        } else {
          _tmpPopularity = _cursor.getDouble(_cursorIndexOfPopularity);
        }
        final String _tmpPosterPath;
        if (_cursor.isNull(_cursorIndexOfPosterPath)) {
          _tmpPosterPath = null;
        } else {
          _tmpPosterPath = _cursor.getString(_cursorIndexOfPosterPath);
        }
        final String _tmpReleaseDate;
        if (_cursor.isNull(_cursorIndexOfReleaseDate)) {
          _tmpReleaseDate = null;
        } else {
          _tmpReleaseDate = _cursor.getString(_cursorIndexOfReleaseDate);
        }
        final String _tmpTitle;
        if (_cursor.isNull(_cursorIndexOfTitle)) {
          _tmpTitle = null;
        } else {
          _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
        }
        final Boolean _tmpVideo;
        final Integer _tmp_3;
        if (_cursor.isNull(_cursorIndexOfVideo)) {
          _tmp_3 = null;
        } else {
          _tmp_3 = _cursor.getInt(_cursorIndexOfVideo);
        }
        _tmpVideo = _tmp_3 == null ? null : _tmp_3 != 0;
        final Double _tmpVoteAverage;
        if (_cursor.isNull(_cursorIndexOfVoteAverage)) {
          _tmpVoteAverage = null;
        } else {
          _tmpVoteAverage = _cursor.getDouble(_cursorIndexOfVoteAverage);
        }
        final Integer _tmpVoteCount;
        if (_cursor.isNull(_cursorIndexOfVoteCount)) {
          _tmpVoteCount = null;
        } else {
          _tmpVoteCount = _cursor.getInt(_cursorIndexOfVoteCount);
        }
        final String _tmpStatus;
        if (_cursor.isNull(_cursorIndexOfStatus)) {
          _tmpStatus = null;
        } else {
          _tmpStatus = _cursor.getString(_cursorIndexOfStatus);
        }
        final String _tmpTagline;
        if (_cursor.isNull(_cursorIndexOfTagline)) {
          _tmpTagline = null;
        } else {
          _tmpTagline = _cursor.getString(_cursorIndexOfTagline);
        }
        final String _tmpRevenue;
        if (_cursor.isNull(_cursorIndexOfRevenue)) {
          _tmpRevenue = null;
        } else {
          _tmpRevenue = _cursor.getString(_cursorIndexOfRevenue);
        }
        final String _tmpRuntime;
        if (_cursor.isNull(_cursorIndexOfRuntime)) {
          _tmpRuntime = null;
        } else {
          _tmpRuntime = _cursor.getString(_cursorIndexOfRuntime);
        }
        final List<ProductionCompanyVO> _tmpProductionCompanies;
        final String _tmp_4;
        if (_cursor.isNull(_cursorIndexOfProductionCompanies)) {
          _tmp_4 = null;
        } else {
          _tmp_4 = _cursor.getString(_cursorIndexOfProductionCompanies);
        }
        _tmpProductionCompanies = __productionCompanyTypeConverter.toProductionCompanies(_tmp_4);
        final List<ProductionCountryVO> _tmpProductionCountries;
        final String _tmp_5;
        if (_cursor.isNull(_cursorIndexOfProductionCountries)) {
          _tmp_5 = null;
        } else {
          _tmp_5 = _cursor.getString(_cursorIndexOfProductionCountries);
        }
        _tmpProductionCountries = __productionCountryTypeConverter.toProductionCountries(_tmp_5);
        final String _tmpHomepage;
        if (_cursor.isNull(_cursorIndexOfHomepage)) {
          _tmpHomepage = null;
        } else {
          _tmpHomepage = _cursor.getString(_cursorIndexOfHomepage);
        }
        final String _tmpImdbId;
        if (_cursor.isNull(_cursorIndexOfImdbId)) {
          _tmpImdbId = null;
        } else {
          _tmpImdbId = _cursor.getString(_cursorIndexOfImdbId);
        }
        final Long _tmpBudget;
        if (_cursor.isNull(_cursorIndexOfBudget)) {
          _tmpBudget = null;
        } else {
          _tmpBudget = _cursor.getLong(_cursorIndexOfBudget);
        }
        final List<GenreVO> _tmpGenres;
        final String _tmp_6;
        if (_cursor.isNull(_cursorIndexOfGenres)) {
          _tmp_6 = null;
        } else {
          _tmp_6 = _cursor.getString(_cursorIndexOfGenres);
        }
        _tmpGenres = __genreListTypeConverter.toGenreList(_tmp_6);
        final List<SpokenLanguageVO> _tmpSpokenLanguages;
        final String _tmp_7;
        if (_cursor.isNull(_cursorIndexOfSpokenLanguages)) {
          _tmp_7 = null;
        } else {
          _tmp_7 = _cursor.getString(_cursorIndexOfSpokenLanguages);
        }
        _tmpSpokenLanguages = __spokenLanguageTypeConverter.toSpokenLanguages(_tmp_7);
        final String _tmpType;
        if (_cursor.isNull(_cursorIndexOfType)) {
          _tmpType = null;
        } else {
          _tmpType = _cursor.getString(_cursorIndexOfType);
        }
        _result = new MovieVO(_tmpAdult,_tmpBackDropPath,_tmpGenreIds,_tmpBelongToCollection,_tmpId,_tmpOriginalLanguage,_tmpOriginalTitle,_tmpOverview,_tmpPopularity,_tmpPosterPath,_tmpReleaseDate,_tmpTitle,_tmpVideo,_tmpVoteAverage,_tmpVoteCount,_tmpStatus,_tmpTagline,_tmpRevenue,_tmpRuntime,_tmpProductionCompanies,_tmpProductionCountries,_tmpHomepage,_tmpImdbId,_tmpBudget,_tmpGenres,_tmpSpokenLanguages,_tmpType);
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public LiveData<List<MovieVO>> getMoviesByType(final String type) {
    final String _sql = "SELECT * FROM movie_table WHERE type = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (type == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, type);
    }
    return __db.getInvalidationTracker().createLiveData(new String[]{"movie_table"}, false, new Callable<List<MovieVO>>() {
      @Override
      public List<MovieVO> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfAdult = CursorUtil.getColumnIndexOrThrow(_cursor, "adult");
          final int _cursorIndexOfBackDropPath = CursorUtil.getColumnIndexOrThrow(_cursor, "backdrop_path");
          final int _cursorIndexOfGenreIds = CursorUtil.getColumnIndexOrThrow(_cursor, "genre_ids");
          final int _cursorIndexOfBelongToCollection = CursorUtil.getColumnIndexOrThrow(_cursor, "belongs_to_collection");
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfOriginalLanguage = CursorUtil.getColumnIndexOrThrow(_cursor, "original_language");
          final int _cursorIndexOfOriginalTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "original_title");
          final int _cursorIndexOfOverview = CursorUtil.getColumnIndexOrThrow(_cursor, "overview");
          final int _cursorIndexOfPopularity = CursorUtil.getColumnIndexOrThrow(_cursor, "popularity");
          final int _cursorIndexOfPosterPath = CursorUtil.getColumnIndexOrThrow(_cursor, "poster_path");
          final int _cursorIndexOfReleaseDate = CursorUtil.getColumnIndexOrThrow(_cursor, "release_date");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfVideo = CursorUtil.getColumnIndexOrThrow(_cursor, "video");
          final int _cursorIndexOfVoteAverage = CursorUtil.getColumnIndexOrThrow(_cursor, "vote_average");
          final int _cursorIndexOfVoteCount = CursorUtil.getColumnIndexOrThrow(_cursor, "vote_count");
          final int _cursorIndexOfStatus = CursorUtil.getColumnIndexOrThrow(_cursor, "status");
          final int _cursorIndexOfTagline = CursorUtil.getColumnIndexOrThrow(_cursor, "tagline");
          final int _cursorIndexOfRevenue = CursorUtil.getColumnIndexOrThrow(_cursor, "revenue");
          final int _cursorIndexOfRuntime = CursorUtil.getColumnIndexOrThrow(_cursor, "runtime");
          final int _cursorIndexOfProductionCompanies = CursorUtil.getColumnIndexOrThrow(_cursor, "production_companies");
          final int _cursorIndexOfProductionCountries = CursorUtil.getColumnIndexOrThrow(_cursor, "production_countries");
          final int _cursorIndexOfHomepage = CursorUtil.getColumnIndexOrThrow(_cursor, "homepage");
          final int _cursorIndexOfImdbId = CursorUtil.getColumnIndexOrThrow(_cursor, "imdb_id");
          final int _cursorIndexOfBudget = CursorUtil.getColumnIndexOrThrow(_cursor, "budget");
          final int _cursorIndexOfGenres = CursorUtil.getColumnIndexOrThrow(_cursor, "genres");
          final int _cursorIndexOfSpokenLanguages = CursorUtil.getColumnIndexOrThrow(_cursor, "spoken_languages");
          final int _cursorIndexOfType = CursorUtil.getColumnIndexOrThrow(_cursor, "type");
          final List<MovieVO> _result = new ArrayList<MovieVO>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final MovieVO _item;
            final Boolean _tmpAdult;
            final Integer _tmp;
            if (_cursor.isNull(_cursorIndexOfAdult)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getInt(_cursorIndexOfAdult);
            }
            _tmpAdult = _tmp == null ? null : _tmp != 0;
            final String _tmpBackDropPath;
            if (_cursor.isNull(_cursorIndexOfBackDropPath)) {
              _tmpBackDropPath = null;
            } else {
              _tmpBackDropPath = _cursor.getString(_cursorIndexOfBackDropPath);
            }
            final List<Integer> _tmpGenreIds;
            final String _tmp_1;
            if (_cursor.isNull(_cursorIndexOfGenreIds)) {
              _tmp_1 = null;
            } else {
              _tmp_1 = _cursor.getString(_cursorIndexOfGenreIds);
            }
            _tmpGenreIds = __genreIdsTypeConverter.toGenreIds(_tmp_1);
            final CollectionVO _tmpBelongToCollection;
            final String _tmp_2;
            if (_cursor.isNull(_cursorIndexOfBelongToCollection)) {
              _tmp_2 = null;
            } else {
              _tmp_2 = _cursor.getString(_cursorIndexOfBelongToCollection);
            }
            _tmpBelongToCollection = __collectionTypeConverter.toCollection(_tmp_2);
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpOriginalLanguage;
            if (_cursor.isNull(_cursorIndexOfOriginalLanguage)) {
              _tmpOriginalLanguage = null;
            } else {
              _tmpOriginalLanguage = _cursor.getString(_cursorIndexOfOriginalLanguage);
            }
            final String _tmpOriginalTitle;
            if (_cursor.isNull(_cursorIndexOfOriginalTitle)) {
              _tmpOriginalTitle = null;
            } else {
              _tmpOriginalTitle = _cursor.getString(_cursorIndexOfOriginalTitle);
            }
            final String _tmpOverview;
            if (_cursor.isNull(_cursorIndexOfOverview)) {
              _tmpOverview = null;
            } else {
              _tmpOverview = _cursor.getString(_cursorIndexOfOverview);
            }
            final Double _tmpPopularity;
            if (_cursor.isNull(_cursorIndexOfPopularity)) {
              _tmpPopularity = null;
            } else {
              _tmpPopularity = _cursor.getDouble(_cursorIndexOfPopularity);
            }
            final String _tmpPosterPath;
            if (_cursor.isNull(_cursorIndexOfPosterPath)) {
              _tmpPosterPath = null;
            } else {
              _tmpPosterPath = _cursor.getString(_cursorIndexOfPosterPath);
            }
            final String _tmpReleaseDate;
            if (_cursor.isNull(_cursorIndexOfReleaseDate)) {
              _tmpReleaseDate = null;
            } else {
              _tmpReleaseDate = _cursor.getString(_cursorIndexOfReleaseDate);
            }
            final String _tmpTitle;
            if (_cursor.isNull(_cursorIndexOfTitle)) {
              _tmpTitle = null;
            } else {
              _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            }
            final Boolean _tmpVideo;
            final Integer _tmp_3;
            if (_cursor.isNull(_cursorIndexOfVideo)) {
              _tmp_3 = null;
            } else {
              _tmp_3 = _cursor.getInt(_cursorIndexOfVideo);
            }
            _tmpVideo = _tmp_3 == null ? null : _tmp_3 != 0;
            final Double _tmpVoteAverage;
            if (_cursor.isNull(_cursorIndexOfVoteAverage)) {
              _tmpVoteAverage = null;
            } else {
              _tmpVoteAverage = _cursor.getDouble(_cursorIndexOfVoteAverage);
            }
            final Integer _tmpVoteCount;
            if (_cursor.isNull(_cursorIndexOfVoteCount)) {
              _tmpVoteCount = null;
            } else {
              _tmpVoteCount = _cursor.getInt(_cursorIndexOfVoteCount);
            }
            final String _tmpStatus;
            if (_cursor.isNull(_cursorIndexOfStatus)) {
              _tmpStatus = null;
            } else {
              _tmpStatus = _cursor.getString(_cursorIndexOfStatus);
            }
            final String _tmpTagline;
            if (_cursor.isNull(_cursorIndexOfTagline)) {
              _tmpTagline = null;
            } else {
              _tmpTagline = _cursor.getString(_cursorIndexOfTagline);
            }
            final String _tmpRevenue;
            if (_cursor.isNull(_cursorIndexOfRevenue)) {
              _tmpRevenue = null;
            } else {
              _tmpRevenue = _cursor.getString(_cursorIndexOfRevenue);
            }
            final String _tmpRuntime;
            if (_cursor.isNull(_cursorIndexOfRuntime)) {
              _tmpRuntime = null;
            } else {
              _tmpRuntime = _cursor.getString(_cursorIndexOfRuntime);
            }
            final List<ProductionCompanyVO> _tmpProductionCompanies;
            final String _tmp_4;
            if (_cursor.isNull(_cursorIndexOfProductionCompanies)) {
              _tmp_4 = null;
            } else {
              _tmp_4 = _cursor.getString(_cursorIndexOfProductionCompanies);
            }
            _tmpProductionCompanies = __productionCompanyTypeConverter.toProductionCompanies(_tmp_4);
            final List<ProductionCountryVO> _tmpProductionCountries;
            final String _tmp_5;
            if (_cursor.isNull(_cursorIndexOfProductionCountries)) {
              _tmp_5 = null;
            } else {
              _tmp_5 = _cursor.getString(_cursorIndexOfProductionCountries);
            }
            _tmpProductionCountries = __productionCountryTypeConverter.toProductionCountries(_tmp_5);
            final String _tmpHomepage;
            if (_cursor.isNull(_cursorIndexOfHomepage)) {
              _tmpHomepage = null;
            } else {
              _tmpHomepage = _cursor.getString(_cursorIndexOfHomepage);
            }
            final String _tmpImdbId;
            if (_cursor.isNull(_cursorIndexOfImdbId)) {
              _tmpImdbId = null;
            } else {
              _tmpImdbId = _cursor.getString(_cursorIndexOfImdbId);
            }
            final Long _tmpBudget;
            if (_cursor.isNull(_cursorIndexOfBudget)) {
              _tmpBudget = null;
            } else {
              _tmpBudget = _cursor.getLong(_cursorIndexOfBudget);
            }
            final List<GenreVO> _tmpGenres;
            final String _tmp_6;
            if (_cursor.isNull(_cursorIndexOfGenres)) {
              _tmp_6 = null;
            } else {
              _tmp_6 = _cursor.getString(_cursorIndexOfGenres);
            }
            _tmpGenres = __genreListTypeConverter.toGenreList(_tmp_6);
            final List<SpokenLanguageVO> _tmpSpokenLanguages;
            final String _tmp_7;
            if (_cursor.isNull(_cursorIndexOfSpokenLanguages)) {
              _tmp_7 = null;
            } else {
              _tmp_7 = _cursor.getString(_cursorIndexOfSpokenLanguages);
            }
            _tmpSpokenLanguages = __spokenLanguageTypeConverter.toSpokenLanguages(_tmp_7);
            final String _tmpType;
            if (_cursor.isNull(_cursorIndexOfType)) {
              _tmpType = null;
            } else {
              _tmpType = _cursor.getString(_cursorIndexOfType);
            }
            _item = new MovieVO(_tmpAdult,_tmpBackDropPath,_tmpGenreIds,_tmpBelongToCollection,_tmpId,_tmpOriginalLanguage,_tmpOriginalTitle,_tmpOverview,_tmpPopularity,_tmpPosterPath,_tmpReleaseDate,_tmpTitle,_tmpVideo,_tmpVoteAverage,_tmpVoteCount,_tmpStatus,_tmpTagline,_tmpRevenue,_tmpRuntime,_tmpProductionCompanies,_tmpProductionCountries,_tmpHomepage,_tmpImdbId,_tmpBudget,_tmpGenres,_tmpSpokenLanguages,_tmpType);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Flowable<MovieVO> getMovieByIdFlowable(final int movieId) {
    final String _sql = "SELECT * FROM movie_table WHERE id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, movieId);
    return RxRoom.createFlowable(__db, false, new String[]{"movie_table"}, new Callable<MovieVO>() {
      @Override
      public MovieVO call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfAdult = CursorUtil.getColumnIndexOrThrow(_cursor, "adult");
          final int _cursorIndexOfBackDropPath = CursorUtil.getColumnIndexOrThrow(_cursor, "backdrop_path");
          final int _cursorIndexOfGenreIds = CursorUtil.getColumnIndexOrThrow(_cursor, "genre_ids");
          final int _cursorIndexOfBelongToCollection = CursorUtil.getColumnIndexOrThrow(_cursor, "belongs_to_collection");
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfOriginalLanguage = CursorUtil.getColumnIndexOrThrow(_cursor, "original_language");
          final int _cursorIndexOfOriginalTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "original_title");
          final int _cursorIndexOfOverview = CursorUtil.getColumnIndexOrThrow(_cursor, "overview");
          final int _cursorIndexOfPopularity = CursorUtil.getColumnIndexOrThrow(_cursor, "popularity");
          final int _cursorIndexOfPosterPath = CursorUtil.getColumnIndexOrThrow(_cursor, "poster_path");
          final int _cursorIndexOfReleaseDate = CursorUtil.getColumnIndexOrThrow(_cursor, "release_date");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfVideo = CursorUtil.getColumnIndexOrThrow(_cursor, "video");
          final int _cursorIndexOfVoteAverage = CursorUtil.getColumnIndexOrThrow(_cursor, "vote_average");
          final int _cursorIndexOfVoteCount = CursorUtil.getColumnIndexOrThrow(_cursor, "vote_count");
          final int _cursorIndexOfStatus = CursorUtil.getColumnIndexOrThrow(_cursor, "status");
          final int _cursorIndexOfTagline = CursorUtil.getColumnIndexOrThrow(_cursor, "tagline");
          final int _cursorIndexOfRevenue = CursorUtil.getColumnIndexOrThrow(_cursor, "revenue");
          final int _cursorIndexOfRuntime = CursorUtil.getColumnIndexOrThrow(_cursor, "runtime");
          final int _cursorIndexOfProductionCompanies = CursorUtil.getColumnIndexOrThrow(_cursor, "production_companies");
          final int _cursorIndexOfProductionCountries = CursorUtil.getColumnIndexOrThrow(_cursor, "production_countries");
          final int _cursorIndexOfHomepage = CursorUtil.getColumnIndexOrThrow(_cursor, "homepage");
          final int _cursorIndexOfImdbId = CursorUtil.getColumnIndexOrThrow(_cursor, "imdb_id");
          final int _cursorIndexOfBudget = CursorUtil.getColumnIndexOrThrow(_cursor, "budget");
          final int _cursorIndexOfGenres = CursorUtil.getColumnIndexOrThrow(_cursor, "genres");
          final int _cursorIndexOfSpokenLanguages = CursorUtil.getColumnIndexOrThrow(_cursor, "spoken_languages");
          final int _cursorIndexOfType = CursorUtil.getColumnIndexOrThrow(_cursor, "type");
          final MovieVO _result;
          if(_cursor.moveToFirst()) {
            final Boolean _tmpAdult;
            final Integer _tmp;
            if (_cursor.isNull(_cursorIndexOfAdult)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getInt(_cursorIndexOfAdult);
            }
            _tmpAdult = _tmp == null ? null : _tmp != 0;
            final String _tmpBackDropPath;
            if (_cursor.isNull(_cursorIndexOfBackDropPath)) {
              _tmpBackDropPath = null;
            } else {
              _tmpBackDropPath = _cursor.getString(_cursorIndexOfBackDropPath);
            }
            final List<Integer> _tmpGenreIds;
            final String _tmp_1;
            if (_cursor.isNull(_cursorIndexOfGenreIds)) {
              _tmp_1 = null;
            } else {
              _tmp_1 = _cursor.getString(_cursorIndexOfGenreIds);
            }
            _tmpGenreIds = __genreIdsTypeConverter.toGenreIds(_tmp_1);
            final CollectionVO _tmpBelongToCollection;
            final String _tmp_2;
            if (_cursor.isNull(_cursorIndexOfBelongToCollection)) {
              _tmp_2 = null;
            } else {
              _tmp_2 = _cursor.getString(_cursorIndexOfBelongToCollection);
            }
            _tmpBelongToCollection = __collectionTypeConverter.toCollection(_tmp_2);
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpOriginalLanguage;
            if (_cursor.isNull(_cursorIndexOfOriginalLanguage)) {
              _tmpOriginalLanguage = null;
            } else {
              _tmpOriginalLanguage = _cursor.getString(_cursorIndexOfOriginalLanguage);
            }
            final String _tmpOriginalTitle;
            if (_cursor.isNull(_cursorIndexOfOriginalTitle)) {
              _tmpOriginalTitle = null;
            } else {
              _tmpOriginalTitle = _cursor.getString(_cursorIndexOfOriginalTitle);
            }
            final String _tmpOverview;
            if (_cursor.isNull(_cursorIndexOfOverview)) {
              _tmpOverview = null;
            } else {
              _tmpOverview = _cursor.getString(_cursorIndexOfOverview);
            }
            final Double _tmpPopularity;
            if (_cursor.isNull(_cursorIndexOfPopularity)) {
              _tmpPopularity = null;
            } else {
              _tmpPopularity = _cursor.getDouble(_cursorIndexOfPopularity);
            }
            final String _tmpPosterPath;
            if (_cursor.isNull(_cursorIndexOfPosterPath)) {
              _tmpPosterPath = null;
            } else {
              _tmpPosterPath = _cursor.getString(_cursorIndexOfPosterPath);
            }
            final String _tmpReleaseDate;
            if (_cursor.isNull(_cursorIndexOfReleaseDate)) {
              _tmpReleaseDate = null;
            } else {
              _tmpReleaseDate = _cursor.getString(_cursorIndexOfReleaseDate);
            }
            final String _tmpTitle;
            if (_cursor.isNull(_cursorIndexOfTitle)) {
              _tmpTitle = null;
            } else {
              _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            }
            final Boolean _tmpVideo;
            final Integer _tmp_3;
            if (_cursor.isNull(_cursorIndexOfVideo)) {
              _tmp_3 = null;
            } else {
              _tmp_3 = _cursor.getInt(_cursorIndexOfVideo);
            }
            _tmpVideo = _tmp_3 == null ? null : _tmp_3 != 0;
            final Double _tmpVoteAverage;
            if (_cursor.isNull(_cursorIndexOfVoteAverage)) {
              _tmpVoteAverage = null;
            } else {
              _tmpVoteAverage = _cursor.getDouble(_cursorIndexOfVoteAverage);
            }
            final Integer _tmpVoteCount;
            if (_cursor.isNull(_cursorIndexOfVoteCount)) {
              _tmpVoteCount = null;
            } else {
              _tmpVoteCount = _cursor.getInt(_cursorIndexOfVoteCount);
            }
            final String _tmpStatus;
            if (_cursor.isNull(_cursorIndexOfStatus)) {
              _tmpStatus = null;
            } else {
              _tmpStatus = _cursor.getString(_cursorIndexOfStatus);
            }
            final String _tmpTagline;
            if (_cursor.isNull(_cursorIndexOfTagline)) {
              _tmpTagline = null;
            } else {
              _tmpTagline = _cursor.getString(_cursorIndexOfTagline);
            }
            final String _tmpRevenue;
            if (_cursor.isNull(_cursorIndexOfRevenue)) {
              _tmpRevenue = null;
            } else {
              _tmpRevenue = _cursor.getString(_cursorIndexOfRevenue);
            }
            final String _tmpRuntime;
            if (_cursor.isNull(_cursorIndexOfRuntime)) {
              _tmpRuntime = null;
            } else {
              _tmpRuntime = _cursor.getString(_cursorIndexOfRuntime);
            }
            final List<ProductionCompanyVO> _tmpProductionCompanies;
            final String _tmp_4;
            if (_cursor.isNull(_cursorIndexOfProductionCompanies)) {
              _tmp_4 = null;
            } else {
              _tmp_4 = _cursor.getString(_cursorIndexOfProductionCompanies);
            }
            _tmpProductionCompanies = __productionCompanyTypeConverter.toProductionCompanies(_tmp_4);
            final List<ProductionCountryVO> _tmpProductionCountries;
            final String _tmp_5;
            if (_cursor.isNull(_cursorIndexOfProductionCountries)) {
              _tmp_5 = null;
            } else {
              _tmp_5 = _cursor.getString(_cursorIndexOfProductionCountries);
            }
            _tmpProductionCountries = __productionCountryTypeConverter.toProductionCountries(_tmp_5);
            final String _tmpHomepage;
            if (_cursor.isNull(_cursorIndexOfHomepage)) {
              _tmpHomepage = null;
            } else {
              _tmpHomepage = _cursor.getString(_cursorIndexOfHomepage);
            }
            final String _tmpImdbId;
            if (_cursor.isNull(_cursorIndexOfImdbId)) {
              _tmpImdbId = null;
            } else {
              _tmpImdbId = _cursor.getString(_cursorIndexOfImdbId);
            }
            final Long _tmpBudget;
            if (_cursor.isNull(_cursorIndexOfBudget)) {
              _tmpBudget = null;
            } else {
              _tmpBudget = _cursor.getLong(_cursorIndexOfBudget);
            }
            final List<GenreVO> _tmpGenres;
            final String _tmp_6;
            if (_cursor.isNull(_cursorIndexOfGenres)) {
              _tmp_6 = null;
            } else {
              _tmp_6 = _cursor.getString(_cursorIndexOfGenres);
            }
            _tmpGenres = __genreListTypeConverter.toGenreList(_tmp_6);
            final List<SpokenLanguageVO> _tmpSpokenLanguages;
            final String _tmp_7;
            if (_cursor.isNull(_cursorIndexOfSpokenLanguages)) {
              _tmp_7 = null;
            } else {
              _tmp_7 = _cursor.getString(_cursorIndexOfSpokenLanguages);
            }
            _tmpSpokenLanguages = __spokenLanguageTypeConverter.toSpokenLanguages(_tmp_7);
            final String _tmpType;
            if (_cursor.isNull(_cursorIndexOfType)) {
              _tmpType = null;
            } else {
              _tmpType = _cursor.getString(_cursorIndexOfType);
            }
            _result = new MovieVO(_tmpAdult,_tmpBackDropPath,_tmpGenreIds,_tmpBelongToCollection,_tmpId,_tmpOriginalLanguage,_tmpOriginalTitle,_tmpOverview,_tmpPopularity,_tmpPosterPath,_tmpReleaseDate,_tmpTitle,_tmpVideo,_tmpVoteAverage,_tmpVoteCount,_tmpStatus,_tmpTagline,_tmpRevenue,_tmpRuntime,_tmpProductionCompanies,_tmpProductionCountries,_tmpHomepage,_tmpImdbId,_tmpBudget,_tmpGenres,_tmpSpokenLanguages,_tmpType);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Flowable<List<MovieVO>> getMoviesByTypeFlowable(final String type) {
    final String _sql = "SELECT * FROM movie_table WHERE type = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (type == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, type);
    }
    return RxRoom.createFlowable(__db, false, new String[]{"movie_table"}, new Callable<List<MovieVO>>() {
      @Override
      public List<MovieVO> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfAdult = CursorUtil.getColumnIndexOrThrow(_cursor, "adult");
          final int _cursorIndexOfBackDropPath = CursorUtil.getColumnIndexOrThrow(_cursor, "backdrop_path");
          final int _cursorIndexOfGenreIds = CursorUtil.getColumnIndexOrThrow(_cursor, "genre_ids");
          final int _cursorIndexOfBelongToCollection = CursorUtil.getColumnIndexOrThrow(_cursor, "belongs_to_collection");
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfOriginalLanguage = CursorUtil.getColumnIndexOrThrow(_cursor, "original_language");
          final int _cursorIndexOfOriginalTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "original_title");
          final int _cursorIndexOfOverview = CursorUtil.getColumnIndexOrThrow(_cursor, "overview");
          final int _cursorIndexOfPopularity = CursorUtil.getColumnIndexOrThrow(_cursor, "popularity");
          final int _cursorIndexOfPosterPath = CursorUtil.getColumnIndexOrThrow(_cursor, "poster_path");
          final int _cursorIndexOfReleaseDate = CursorUtil.getColumnIndexOrThrow(_cursor, "release_date");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfVideo = CursorUtil.getColumnIndexOrThrow(_cursor, "video");
          final int _cursorIndexOfVoteAverage = CursorUtil.getColumnIndexOrThrow(_cursor, "vote_average");
          final int _cursorIndexOfVoteCount = CursorUtil.getColumnIndexOrThrow(_cursor, "vote_count");
          final int _cursorIndexOfStatus = CursorUtil.getColumnIndexOrThrow(_cursor, "status");
          final int _cursorIndexOfTagline = CursorUtil.getColumnIndexOrThrow(_cursor, "tagline");
          final int _cursorIndexOfRevenue = CursorUtil.getColumnIndexOrThrow(_cursor, "revenue");
          final int _cursorIndexOfRuntime = CursorUtil.getColumnIndexOrThrow(_cursor, "runtime");
          final int _cursorIndexOfProductionCompanies = CursorUtil.getColumnIndexOrThrow(_cursor, "production_companies");
          final int _cursorIndexOfProductionCountries = CursorUtil.getColumnIndexOrThrow(_cursor, "production_countries");
          final int _cursorIndexOfHomepage = CursorUtil.getColumnIndexOrThrow(_cursor, "homepage");
          final int _cursorIndexOfImdbId = CursorUtil.getColumnIndexOrThrow(_cursor, "imdb_id");
          final int _cursorIndexOfBudget = CursorUtil.getColumnIndexOrThrow(_cursor, "budget");
          final int _cursorIndexOfGenres = CursorUtil.getColumnIndexOrThrow(_cursor, "genres");
          final int _cursorIndexOfSpokenLanguages = CursorUtil.getColumnIndexOrThrow(_cursor, "spoken_languages");
          final int _cursorIndexOfType = CursorUtil.getColumnIndexOrThrow(_cursor, "type");
          final List<MovieVO> _result = new ArrayList<MovieVO>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final MovieVO _item;
            final Boolean _tmpAdult;
            final Integer _tmp;
            if (_cursor.isNull(_cursorIndexOfAdult)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getInt(_cursorIndexOfAdult);
            }
            _tmpAdult = _tmp == null ? null : _tmp != 0;
            final String _tmpBackDropPath;
            if (_cursor.isNull(_cursorIndexOfBackDropPath)) {
              _tmpBackDropPath = null;
            } else {
              _tmpBackDropPath = _cursor.getString(_cursorIndexOfBackDropPath);
            }
            final List<Integer> _tmpGenreIds;
            final String _tmp_1;
            if (_cursor.isNull(_cursorIndexOfGenreIds)) {
              _tmp_1 = null;
            } else {
              _tmp_1 = _cursor.getString(_cursorIndexOfGenreIds);
            }
            _tmpGenreIds = __genreIdsTypeConverter.toGenreIds(_tmp_1);
            final CollectionVO _tmpBelongToCollection;
            final String _tmp_2;
            if (_cursor.isNull(_cursorIndexOfBelongToCollection)) {
              _tmp_2 = null;
            } else {
              _tmp_2 = _cursor.getString(_cursorIndexOfBelongToCollection);
            }
            _tmpBelongToCollection = __collectionTypeConverter.toCollection(_tmp_2);
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpOriginalLanguage;
            if (_cursor.isNull(_cursorIndexOfOriginalLanguage)) {
              _tmpOriginalLanguage = null;
            } else {
              _tmpOriginalLanguage = _cursor.getString(_cursorIndexOfOriginalLanguage);
            }
            final String _tmpOriginalTitle;
            if (_cursor.isNull(_cursorIndexOfOriginalTitle)) {
              _tmpOriginalTitle = null;
            } else {
              _tmpOriginalTitle = _cursor.getString(_cursorIndexOfOriginalTitle);
            }
            final String _tmpOverview;
            if (_cursor.isNull(_cursorIndexOfOverview)) {
              _tmpOverview = null;
            } else {
              _tmpOverview = _cursor.getString(_cursorIndexOfOverview);
            }
            final Double _tmpPopularity;
            if (_cursor.isNull(_cursorIndexOfPopularity)) {
              _tmpPopularity = null;
            } else {
              _tmpPopularity = _cursor.getDouble(_cursorIndexOfPopularity);
            }
            final String _tmpPosterPath;
            if (_cursor.isNull(_cursorIndexOfPosterPath)) {
              _tmpPosterPath = null;
            } else {
              _tmpPosterPath = _cursor.getString(_cursorIndexOfPosterPath);
            }
            final String _tmpReleaseDate;
            if (_cursor.isNull(_cursorIndexOfReleaseDate)) {
              _tmpReleaseDate = null;
            } else {
              _tmpReleaseDate = _cursor.getString(_cursorIndexOfReleaseDate);
            }
            final String _tmpTitle;
            if (_cursor.isNull(_cursorIndexOfTitle)) {
              _tmpTitle = null;
            } else {
              _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            }
            final Boolean _tmpVideo;
            final Integer _tmp_3;
            if (_cursor.isNull(_cursorIndexOfVideo)) {
              _tmp_3 = null;
            } else {
              _tmp_3 = _cursor.getInt(_cursorIndexOfVideo);
            }
            _tmpVideo = _tmp_3 == null ? null : _tmp_3 != 0;
            final Double _tmpVoteAverage;
            if (_cursor.isNull(_cursorIndexOfVoteAverage)) {
              _tmpVoteAverage = null;
            } else {
              _tmpVoteAverage = _cursor.getDouble(_cursorIndexOfVoteAverage);
            }
            final Integer _tmpVoteCount;
            if (_cursor.isNull(_cursorIndexOfVoteCount)) {
              _tmpVoteCount = null;
            } else {
              _tmpVoteCount = _cursor.getInt(_cursorIndexOfVoteCount);
            }
            final String _tmpStatus;
            if (_cursor.isNull(_cursorIndexOfStatus)) {
              _tmpStatus = null;
            } else {
              _tmpStatus = _cursor.getString(_cursorIndexOfStatus);
            }
            final String _tmpTagline;
            if (_cursor.isNull(_cursorIndexOfTagline)) {
              _tmpTagline = null;
            } else {
              _tmpTagline = _cursor.getString(_cursorIndexOfTagline);
            }
            final String _tmpRevenue;
            if (_cursor.isNull(_cursorIndexOfRevenue)) {
              _tmpRevenue = null;
            } else {
              _tmpRevenue = _cursor.getString(_cursorIndexOfRevenue);
            }
            final String _tmpRuntime;
            if (_cursor.isNull(_cursorIndexOfRuntime)) {
              _tmpRuntime = null;
            } else {
              _tmpRuntime = _cursor.getString(_cursorIndexOfRuntime);
            }
            final List<ProductionCompanyVO> _tmpProductionCompanies;
            final String _tmp_4;
            if (_cursor.isNull(_cursorIndexOfProductionCompanies)) {
              _tmp_4 = null;
            } else {
              _tmp_4 = _cursor.getString(_cursorIndexOfProductionCompanies);
            }
            _tmpProductionCompanies = __productionCompanyTypeConverter.toProductionCompanies(_tmp_4);
            final List<ProductionCountryVO> _tmpProductionCountries;
            final String _tmp_5;
            if (_cursor.isNull(_cursorIndexOfProductionCountries)) {
              _tmp_5 = null;
            } else {
              _tmp_5 = _cursor.getString(_cursorIndexOfProductionCountries);
            }
            _tmpProductionCountries = __productionCountryTypeConverter.toProductionCountries(_tmp_5);
            final String _tmpHomepage;
            if (_cursor.isNull(_cursorIndexOfHomepage)) {
              _tmpHomepage = null;
            } else {
              _tmpHomepage = _cursor.getString(_cursorIndexOfHomepage);
            }
            final String _tmpImdbId;
            if (_cursor.isNull(_cursorIndexOfImdbId)) {
              _tmpImdbId = null;
            } else {
              _tmpImdbId = _cursor.getString(_cursorIndexOfImdbId);
            }
            final Long _tmpBudget;
            if (_cursor.isNull(_cursorIndexOfBudget)) {
              _tmpBudget = null;
            } else {
              _tmpBudget = _cursor.getLong(_cursorIndexOfBudget);
            }
            final List<GenreVO> _tmpGenres;
            final String _tmp_6;
            if (_cursor.isNull(_cursorIndexOfGenres)) {
              _tmp_6 = null;
            } else {
              _tmp_6 = _cursor.getString(_cursorIndexOfGenres);
            }
            _tmpGenres = __genreListTypeConverter.toGenreList(_tmp_6);
            final List<SpokenLanguageVO> _tmpSpokenLanguages;
            final String _tmp_7;
            if (_cursor.isNull(_cursorIndexOfSpokenLanguages)) {
              _tmp_7 = null;
            } else {
              _tmp_7 = _cursor.getString(_cursorIndexOfSpokenLanguages);
            }
            _tmpSpokenLanguages = __spokenLanguageTypeConverter.toSpokenLanguages(_tmp_7);
            final String _tmpType;
            if (_cursor.isNull(_cursorIndexOfType)) {
              _tmpType = null;
            } else {
              _tmpType = _cursor.getString(_cursorIndexOfType);
            }
            _item = new MovieVO(_tmpAdult,_tmpBackDropPath,_tmpGenreIds,_tmpBelongToCollection,_tmpId,_tmpOriginalLanguage,_tmpOriginalTitle,_tmpOverview,_tmpPopularity,_tmpPosterPath,_tmpReleaseDate,_tmpTitle,_tmpVideo,_tmpVoteAverage,_tmpVoteCount,_tmpStatus,_tmpTagline,_tmpRevenue,_tmpRuntime,_tmpProductionCompanies,_tmpProductionCountries,_tmpHomepage,_tmpImdbId,_tmpBudget,_tmpGenres,_tmpSpokenLanguages,_tmpType);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
