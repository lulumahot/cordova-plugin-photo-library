package com.terikon.cordova.photolibrary;

public class PhotoLibraryGetLibraryOptions {

  public final int itemsInChunk;
  public final double chunkTimeSec;
  public final boolean includeAlbumData;
  public final long timestamp;

  public PhotoLibraryGetLibraryOptions(int itemsInChunk, double chunkTimeSec, boolean includeAlbumData, long timestamp) {
    this.itemsInChunk = itemsInChunk;
    this.chunkTimeSec = chunkTimeSec;
    this.includeAlbumData = includeAlbumData;
    this.timestamp = timestamp;
  }

}
