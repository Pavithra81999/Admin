package com.extended.repositoryimpl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.extended.entity.Role;
import com.extended.rolerepository.RoleRepository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;

@Repository
public class RepositoryImpl implements RoleRepository {
	@Autowired
	private EntityManager entityManager;

	@Transactional
	@Override
	public Role InsertingOneRoleRecord(Role role) {
		Date date = new Date();
		Query query = entityManager
				.createNativeQuery("insert into role(createddate,rolename,roletype,updateddate) values(?,?,?,?)");

		query.setParameter(1, date);

		query.setParameter(2, role.getRoleName());
		query.setParameter(3, role.getRoleType());

		query.setParameter(4, role.getUpdatedDate());
		query.executeUpdate();
		return role;
	}

	@Override
	public Object[] GetOneRoleRecord(int roleId) {
		Query query = entityManager.createNativeQuery("select * from role where role_id=?");
		query.setParameter(1, roleId);
		Object[] role = (Object[]) query.getSingleResult();

		return role;
	}

	@Override
	public List<Role> GetAllRoleRecords() {
		Query query = entityManager.createNativeQuery("select * from role");
		List<Role> role = query.getResultList();

		return role;
	}

	@Override
	@Transactional
	public String DeleteingRoleRecord(int id) {
		Query query = entityManager.createNativeQuery("delete from role where role_id=?");
		query.setParameter(1, id);
		int Rec = query.executeUpdate();
		if (Rec > 0) {
			return "record was  Deleted";

		}

		return "record was not Deleted";
	}

	@Override
	@Transactional
	public List<Role> InsertingMultipleRoleRecord(List<Role> role) {

		Date date = new Date();
		for (Role roles : role) {
			Query query = entityManager.createNativeQuery("insert into Role values(?,?,?,?,?)");
			query.setParameter(1, roles.getRoleId());
			query.setParameter(2, date);

			query.setParameter(3, roles.getRoleName());
			query.setParameter(4, roles.getRoleType());

			query.setParameter(5, roles.getUpdatedDate());
			int Rec = query.executeUpdate();

		}

		return role;

	}

	@Override
	@Transactional
	public String UpadatingRoleRecord(Role role) {
		Query query = entityManager.createNativeQuery(
				"update Role set role_type=?,role_name=?,created_date=?,updated_date=? where role_id=?");
		query.setParameter(1, role.getRoleType());
		query.setParameter(2, role.getRoleName());
		query.setParameter(3, role.getCreatedDate());
		query.setParameter(4, role.getUpdatedDate());
		query.setParameter(5, role.getRoleId());
		int Rec = query.executeUpdate();
		if (Rec > 0) {
			return "record was updated";
		}

		return "record was Not Updated";
	}

}
