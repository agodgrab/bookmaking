package org.agodgrab.mapper;

public interface Mapper<E, D> {

    D mapToDto(E entity);
    E mapToEntity(D dto);
}
