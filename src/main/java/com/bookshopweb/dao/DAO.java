package com.bookshopweb.dao;

import com.bookshopweb.beans.Cart;

import java.util.List;
import java.util.Optional;

public interface DAO<T> { // lop genreic co so, chua cac phuong thuc co ban nhat

    // them, sua, xoa
    long insert(T t);

    void update(T t);

    void delete(long id);

    Optional<T> getById(long id);

    List<T> getAll();

    List<T> getPart(int limit, int offset); // phan trang

    List<T> getOrderedPart(int limit, int offset, String orderBy, String orderDir);

}
