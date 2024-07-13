package com.bogobyte.apibiblioteca.service;

public interface IDataConvertion {
    <T> T convertData(String json, Class<T> clase);
}
