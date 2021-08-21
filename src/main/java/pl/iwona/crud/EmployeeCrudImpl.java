package pl.iwona.crud;

import pl.iwona.entity.Employee;
import pl.iwona.entitymanager.EntityManagerUtil;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;


public class EmployeeCrudImpl implements EmployeeCrud {



    @Override
    public Employee saveEmployee(Employee employee) {
        EntityManager em = EntityManagerUtil.getEntityManager();
        em.getTransaction().begin();
        em.persist(employee);
        em.getTransaction().commit();
        return employee;
    }

    @Override
    public Employee updateEmployee(Employee employee) {
        EntityManager em = EntityManagerUtil.getEntityManager();
        em.getTransaction().begin();
        em.merge(employee);
        em.getTransaction().commit();
        return employee;
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<Employee> findAllEmployee() {
        EntityManager em = EntityManagerUtil.getEntityManager();
        Query namedQuery = em.createNamedQuery(Employee.FIND_ALL);
        return namedQuery.getResultList();
    }

}
