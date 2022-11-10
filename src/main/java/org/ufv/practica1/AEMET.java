package org.ufv.practica1;

import java.util.*;

public class AEMET {

    private String indicativo;
    private Date fecha;
    private Float[] tmed;
    private Float[] prec;
    private Float[] tmin;
    private String[] horatmin;
    private Float[] tmax;
    private String[] horatmax;
    private int[] dir;
    private Float[] velmedia;
    private Float[] racha;
    private String[] horaracha;
    private Float[] sol;
    private Float[] presMax;
    private String[] horaPresMax;
    private Float[] presMin;
    private String[] horaPresMin;

    ArrayList<Date> fechaA = new ArrayList<>();
    ArrayList<String> indicativoA = new ArrayList<>();

    public String getIndicativo() {
        return indicativo;
    }

    public void setIndicativo(String _indicativo) {
        this.indicativo = _indicativo;
        indicativoA.add(_indicativo);
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date _fecha) {
        this.fecha = _fecha;
        fechaA.add(_fecha);

    }

    public Float[] getTmed() {
        return tmed;
    }

    public void setTmed(Float[] _tmed) {
        this.tmed = _tmed;
    }

    public Float[] getPrec() {
        return prec;
    }

    public void setPrec(Float[] _prec) {
        this.prec = _prec;
    }

    public Float[] getTmin() {
        return tmin;
    }

    public void setTmin(Float[] _tmin) {
        this.tmin = _tmin;
    }

    public String[] getHoratmin() {
        return horatmin;
    }

    public void setHoratmin(String[] _horatmin) {
        this.horatmin = _horatmin;
    }

    public Float[] getTmax() {
        return tmax;
    }

    public void setTmax(Float[] _tmax) {
        this.tmax = _tmax;
    }

    public String[] getHoratmax() {
        return horatmax;
    }

    public void setHoratmax(String[] _horatmax) {
        this.horatmax = _horatmax;
    }

    public int[] getDir() {
        return dir;
    }

    public void setDir(int[] _dir) {
        this.dir = _dir;
    }

    public Float[] getVelmedia() {
        return velmedia;
    }

    public void setVelmedia(Float[] _velmedia) {
        this.velmedia = _velmedia;
    }

    public Float[] getRacha() {
        return racha;
    }

    public void setRacha(Float[] _racha) {
        this.racha = _racha;
    }

    public String[] getHoraracha() {
        return horaracha;
    }

    public void setHoraracha(String[] _horaracha) {
        this.horaracha = _horaracha;
    }

    public Float[] getSol() {
        return sol;
    }

    public void setSol(Float[] _sol) {
        this.sol = _sol;
    }

    public Float[] getPresMax() {
        return presMax;
    }

    public void setPresMax(Float[] _presMax) {
        this.presMax = _presMax;
    }

    public String[] getHoraPresMax() {
        return horaPresMax;
    }

    public void setHoraPresMax(String[] _horaPresMax) {
        this.horaPresMax = _horaPresMax;
    }

    public Float[] getPresMin() {
        return presMin;
    }

    public void setPresMin(Float[] _presMin) {
        this.presMin = _presMin;
    }

    public String[] getHoraPresMin() {
        return horaPresMin;
    }

    public void setHoraPresMin(String[] _horaPresMin) {
        this.horaPresMin = _horaPresMin;
    }

}
