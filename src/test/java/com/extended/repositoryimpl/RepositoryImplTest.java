/*
 * package com.extended.repositoryimpl;
 * 
 * import static org.junit.jupiter.api.Assertions.assertEquals; import static
 * org.mockito.ArgumentMatchers.any; import static org.mockito.Mockito.when;
 * 
 * import java.util.ArrayList; import java.util.List;
 * 
 * import org.junit.jupiter.api.DisplayName; import org.junit.jupiter.api.Test;
 * import org.junit.jupiter.api.extension.ExtendWith;
 * 
 * import org.mockito.Mock; import org.mockito.junit.jupiter.MockitoExtension;
 * 
 * 
 * import com.extended.entity.Role;
 * 
 * @ExtendWith(MockitoExtension.class) public class RepositoryImplTest {
 * 
 * @Mock private RepositoryImpl repositoryImpl;
 * 
 * @Test
 * 
 * @DisplayName("should save the role object to the database") public void
 * insertingOneRoleRecordTest() { Role role = new Role();
 * role.setCreatedDate(null); role.setRoleName("Admin"); role.setRoleType("IT");
 * role.setUpdatedDate(null);
 * when(repositoryImpl.InsertingOneRoleRecord(any(Role.class))).thenReturn(role)
 * ; Role role1 = repositoryImpl.InsertingOneRoleRecord(role);
 * assertEquals(role, role1); }
 * 
 * @Test
 * 
 * @DisplayName("should save multiple role objects to the database") public void
 * insertingMultipleRoleRecordsTest() { List<Role> roleList = new
 * ArrayList<Role>(); Role role = new Role(); role.setCreatedDate(null);
 * role.setRoleName("Software Engineer"); role.setRoleType("IT");
 * role.setUpdatedDate(null);
 * 
 * Role role1 = new Role(); role.setCreatedDate(null);
 * role.setRoleName("Software Engineer"); role.setRoleType("IT");
 * role.setUpdatedDate(null);
 * 
 * roleList.add(role); roleList.add(role1);
 * when(repositoryImpl.InsertingMultipleRoleRecord(roleList)).thenReturn(
 * roleList); List<Role> roleList1 =
 * repositoryImpl.InsertingMultipleRoleRecord(roleList); assertEquals(roleList,
 * roleList1); }
 * 
 * @Test
 * 
 * @DisplayName("should update role object") public void updateRoleRecordTest()
 * { Role role = new Role(); role.setCreatedDate(null);
 * role.setRoleName("Developer"); role.setRoleType("IT");
 * role.setUpdatedDate(null);
 * 
 * when(repositoryImpl.UpadatingRoleRecord(role)).
 * thenReturn("record was updated"); String actual =
 * repositoryImpl.UpadatingRoleRecord(role); assertEquals("record was updated",
 * actual);
 * 
 * }
 * 
 * @Test
 * 
 * @DisplayName("should delete role object") public void deleteRoleRecord() {
 * Role role = new Role(); role.setCreatedDate(null);
 * role.setRoleName("Developer"); role.setRoleType("IT");
 * role.setUpdatedDate(null);
 * 
 * when(repositoryImpl.DeleteingRoleRecord(8)).thenReturn("record was  Deleted"
 * ); String actual = repositoryImpl.DeleteingRoleRecord(8);
 * assertEquals("record was  Deleted", actual); }
 * 
 * @Test
 * 
 * @DisplayName("should display all role records") public void
 * getAllRecordsTest() throws RecordNOtFound { List<Role> roleList = new
 * ArrayList<Role>(); Role role = new Role(); role.setCreatedDate(null);
 * role.setRoleName("Software Engineer"); role.setRoleType("IT");
 * role.setUpdatedDate(null);
 * 
 * Role role1 = new Role(); role.setCreatedDate(null);
 * role.setRoleName("Software Engineer"); role.setRoleType("IT");
 * role.setUpdatedDate(null);
 * 
 * roleList.add(role); roleList.add(role1);
 * when(repositoryImpl.GetAllRoleRecords()).thenReturn(roleList); List<Role>
 * roleList1 = repositoryImpl.GetAllRoleRecords(); assertEquals(roleList,
 * roleList1); }
 * 
 * }
 */