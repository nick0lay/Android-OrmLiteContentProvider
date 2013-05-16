package com.tojc.ormlite.android.compiler.sample;


import android.net.Uri;
import android.content.ContentResolver;
import android.provider.BaseColumns;

public final class PojoContract
    implements BaseColumns {
  public static final String AUTHORITY = "com.tojc.ormlite.android.compiler.sample";

  public static final String CONTENT_URI_PATH = "pojo";

  public static final String MIMETYPE_TYPE = "pojo";
  public static final String MIMETYPE_NAME = "com.tojc.ormlite.android.compiler.sample.provider";

  public static final int CONTENT_URI_PATTERN_MANY = 1;
  public static final int CONTENT_URI_PATTERN_ONE = 2;

  public static final Uri CONTENT_URI = new Uri.Builder().scheme(ContentResolver.SCHEME_CONTENT).authority(AUTHORITY).appendPath(CONTENT_URI_PATH).build();


}