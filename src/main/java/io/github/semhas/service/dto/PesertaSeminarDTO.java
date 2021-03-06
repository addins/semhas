package io.github.semhas.service.dto;


import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import java.util.Objects;
import io.github.semhas.domain.enumeration.AbsensiSeminar;

/**
 * A DTO for the PesertaSeminar entity.
 */
public class PesertaSeminarDTO implements Serializable {

    private Long id;

    private AbsensiSeminar absensi;

    private Long mahasiswaId;

    private String mahasiswaNim;

    private SeminarDTO seminar;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public AbsensiSeminar getAbsensi() {
        return absensi;
    }

    public void setAbsensi(AbsensiSeminar absensi) {
        this.absensi = absensi;
    }

    public Long getMahasiswaId() {
        return mahasiswaId;
    }

    public void setMahasiswaId(Long mahasiswaId) {
        this.mahasiswaId = mahasiswaId;
    }

    public String getMahasiswaNim() {
        return mahasiswaNim;
    }

    public void setMahasiswaNim(String mahasiswaNim) {
        this.mahasiswaNim = mahasiswaNim;
    }

    public SeminarDTO getSeminar() {
        return seminar;
    }

    public void setSeminar(SeminarDTO seminar) {
        this.seminar = seminar;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        PesertaSeminarDTO pesertaSeminarDTO = (PesertaSeminarDTO) o;
        if(pesertaSeminarDTO.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), pesertaSeminarDTO.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "PesertaSeminarDTO{" +
            "id=" + getId() +
            ", absensi='" + getAbsensi() + "'" +
            ", seminar='" + getSeminar() + "'" +
            "}";
    }
}
