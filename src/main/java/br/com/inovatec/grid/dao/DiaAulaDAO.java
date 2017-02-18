/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.inovatec.grid.dao;

import br.com.inovatec.grid.dao.exceptions.ListEntityException;
import br.com.inovatec.grid.entidades.DiaAula;
import java.util.List;

/**
 *
 * @author zrobe
 */
public class DiaAulaDAO extends GenericDAO<DiaAula> {

    public DiaAulaDAO() {
        super(DiaAula.class);
    }

    @Override
    public List<DiaAula> findAll() throws ListEntityException {
        return this.list("diaAula.findAll", null);
    }
    
}
