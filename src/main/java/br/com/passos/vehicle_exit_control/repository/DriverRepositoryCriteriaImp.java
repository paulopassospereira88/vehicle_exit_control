package br.com.passos.vehicle_exit_control.repository;

import br.com.passos.vehicle_exit_control.model.Driver;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;

import java.util.Optional;

public class DriverRepositoryCriteriaImp implements DriverRepositoryCriteria{

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Optional<Driver> findByCnh(Integer cnh) {
        // Criando o CriteriaBuilder
        CriteriaBuilder builder = entityManager.getCriteriaBuilder();
        // Criando a consulta para a entidade Produto
        CriteriaQuery<Driver> criteriaQuery = builder.createQuery(Driver.class);
        // Definindo o "root" da consulta (representa a tabela Produto)
        Root<Driver> root = criteriaQuery.from(Driver.class);
        // Adicionando o filtro WHERE cnh = :cnh
        Predicate predicate = builder.equal(root.get("cnh"), cnh);
        criteriaQuery.select(root).where(predicate);

        // Executando a consulta
        return entityManager.createQuery(criteriaQuery).getResultStream().findFirst();
    }

}
