/*
 * package com.extended.service;
 * 
 * import static org.junit.jupiter.api.Assertions.assertNotEquals; import static
 * org.mockito.ArgumentMatchers.any; import static org.mockito.Mockito.when;
 * 
 * import java.util.ArrayList; import java.util.List;
 * 
 * import org.junit.jupiter.api.DisplayName; import org.junit.jupiter.api.Test;
 * import org.junit.jupiter.api.extension.ExtendWith; import
 * org.mockito.InjectMocks; import org.mockito.Mock; import
 * org.mockito.junit.jupiter.MockitoExtension;
 * 
 * 
 * import com.extended.entity.Role; import com.extended.reponse.FinalResponse;
 * import com.extended.rolerepository.RoleRepository; import
 * com.extended.serviceimpl.RoleServiceImplementation;
 * 
 * @ExtendWith(MockitoExtension.class) public class RoleServiceTest {
 * 
 * @InjectMocks private RoleServiceImplementation roleService;
 * 
 * @Mock private RoleRepository roleRepository;
 * 
 * @Test
 * 
 * @DisplayName("should save the role object to the database") public void
 * insertingOneRoleRecordTest() { Role role = new Role();
 * role.setCreatedDate(null); role.setRoleName("Admin"); role.setRoleType("IT");
 * role.setUpdatedDate(null);
 * when(roleRepository.InsertingOneRoleRecord(any(Role.class))).thenReturn(role)
 * ; FinalResponse finalResponse = roleService.InsertingOneRoleRecord(role);
 * assertNotEquals(finalResponse, role); }
 * 
 * @Test
 * 
 * @DisplayName("should save multiple save objects into the database") public
 * void insertingMultipleRoleRecordsTest() { List<Role> roleList = new
 * ArrayList<Role>(); Role role = new Role(); role.setCreatedDate(null);
 * role.setRoleName("Software Engineer"); role.setRoleType("IT");
 * role.setUpdatedDate(null);
 * 
 * Role role1 = new Role(); role.setCreatedDate(null);
 * role.setRoleName("Software Engineer"); role.setRoleType("IT");
 * role.setUpdatedDate(null);
 * 
 * roleList.add(role); roleList.add(role1);
 * 
 * when(roleRepository.InsertingMultipleRoleRecord(roleList)).thenReturn(
 * roleList); FinalResponse roles =
 * roleService.InsertingMultipleRoleRecord(roleList); assertNotEquals(roleList,
 * roles);
 * 
 * }
 * 
 * @Test
 * 
 * @DisplayName("should update the role record") public void
 * updateRoleRecordTest() { Role role = new Role(); role.setCreatedDate(null);
 * role.setRoleName("Developer"); role.setRoleType("IT");
 * role.setUpdatedDate(null);
 * 
 * when(roleRepository.UpadatingRoleRecord(role)).
 * thenReturn("record was updated"); FinalResponse finalResponse =
 * roleService.UpadatingRoleRecord(role); assertNotEquals("record was updated",
 * finalResponse); }
 * 
 * @Test
 * 
 * @DisplayName("should delete the role record") public void deleteRoleRecord()
 * { Role role = new Role(); role.setCreatedDate(null);
 * role.setRoleName("Developer"); role.setRoleType("IT");
 * role.setUpdatedDate(null);
 * 
 * when(roleRepository.DeleteingRoleRecord(8)).thenReturn("record was  Deleted"
 * ); FinalResponse finalResponse = roleService.DeleteingRoleRecord(8);
 * assertNotEquals("record was  Deleted", finalResponse); }
 * 
 * @Test
 * 
 * @DisplayName("should fetch one role record") public void getOneRecordTest() {
 * Role role = new Role(); role.setCreatedDate(null);
 * role.setRoleName("Developer"); role.setRoleType("IT");
 * role.setUpdatedDate(null);
 * 
 * // when(roleRepository.GetOneRoleRecord(1)).thenReturn(Object[]); }
 * 
 * @Test
 * 
 * @DisplayName("should fetch all the role records") public void
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
 * 
 * when(roleRepository.GetAllRoleRecords()).thenReturn(roleList); FinalResponse
 * finalResponse = roleService.GetAllRoleRecords(); assertNotEquals(roleList,
 * finalResponse); } }
 */