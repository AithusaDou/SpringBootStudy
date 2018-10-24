package com.example.book.service;

import com.example.book.entity.Album;

import java.util.List;

public interface AlbumService {
    List<Album> getAll();

    Album get(int id);

    /**
     * 按相册喜欢数获取热门相册
     * @return
     */
    List<Album> getHotAlbums();
}
