package io.github.semhas.service;

import io.github.semhas.service.dto.MahasiswaDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import java.util.List;

/**
 * Service Interface for managing Mahasiswa.
 */
public interface MahasiswaService {

    /**
     * Save a mahasiswa.
     *
     * @param mahasiswaDTO the entity to save
     * @return the persisted entity
     */
    MahasiswaDTO save(MahasiswaDTO mahasiswaDTO);

    /**
     *  Get all the mahasiswas.
     *
     *  @param pageable the pagination information
     *  @return the list of entities
     */
    Page<MahasiswaDTO> findAll(Pageable pageable);
    /**
     *  Get all the MahasiswaDTO where Seminar is null.
     *
     *  @return the list of entities
     */
    List<MahasiswaDTO> findAllWhereSeminarIsNull();

    /**
     *  Get the "id" mahasiswa.
     *
     *  @param id the id of the entity
     *  @return the entity
     */
    MahasiswaDTO findOne(Long id);

    /**
     *  Delete the "id" mahasiswa.
     *
     *  @param id the id of the entity
     */
    void delete(Long id);
}