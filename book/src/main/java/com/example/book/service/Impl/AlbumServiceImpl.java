package com.example.book.service.Impl;

import com.example.book.dao.AlbumRepository;
import com.example.book.entity.Album;
import com.example.book.service.AlbumService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.transaction.Transactional;
import java.util.List;

@Service
public class AlbumServiceImpl implements AlbumService {
    @Resource
    private AlbumRepository albumRepository;
    @Override
    public List<Album> getAll() {
        return albumRepository.findAll();
    }

    @Override
    public Album get(int id) {
        return albumRepository.findById(id).get();
    }

    @Override
    public List<Album> getHotAlbums() {
        return albumRepository.findHotAlbum();
    }
}

