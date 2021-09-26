/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.frames1.repository;

import com.frames1.model.CarroModel;
import com.frames1.util.ConectorHibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author NAICY
 */
public class CarroRepository {
    //metodo de excluir, editar, buscarpornome, buscarporid, buscartodos.
    public void salvar(CarroModel carroModelo){
        Session ses = ConectorHibernateUtil.getSessionFactory().openSession();
        Transaction tr = ses.beginTransaction();
        
        ses.save(carroModelo);
        
        tr.commit();
        ses.close();
    }
    
}
